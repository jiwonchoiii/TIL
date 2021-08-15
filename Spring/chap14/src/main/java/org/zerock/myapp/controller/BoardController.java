package org.zerock.myapp.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.myapp.domain.BoardVO;
import org.zerock.myapp.domain.Criteria;
import org.zerock.myapp.domain.PageDTO;
import org.zerock.myapp.service.BoardService;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@RequestMapping("/board/")			// Base URI 지정
@Controller
public class BoardController implements InitializingBean {
	
	@Setter(onMethod_= @Autowired)
	private BoardService service;
	
	

	//================================================//
	// Request Mapping table 설계
	//================================================//
	// (1) /board/get  		GET		void get(bno, model)      ---> 특정 게시글 상세조회화면으로 이동
	// (2) /board/list		GET		void list(model)		  ---> 게시판 목록화면으로 이동
	// (3) /board/modify	POST	modify(board, rttrs)      ---> redirect:/board/list
	// (4) /board/register	POST	register(board, rttrs)    ---> redirect:/board/list
	// (5) /board/remove	POST	String remove(bno, rttrs) ---> redirect:/board/list
	// (6) /board/register  GET     register()                ---> 새로운 게시글 등록화면으로 이동
	//================================================//
	
	@PostMapping("modify")
	public String modify(
			@ModelAttribute("cri") Criteria cri,
			BoardVO board,
			RedirectAttributes rttrs) {
		log.debug("modify({}, {}) invoked.", board, rttrs);
		
		boolean isModified = this.service.modify(board);
		
		if(isModified) {
			rttrs.addFlashAttribute("result", "success");
		} // if
		
		rttrs.addAttribute("currPage", cri.getCurrPage());
		rttrs.addAttribute("amount", cri.getAmount());
		rttrs.addAttribute("pagesPerPage", cri.getPagesPerPage());
		
		return "redirect:/board/listPerPage";
	} //modify
	
	
	@PostMapping("register")
	public String register(
			@ModelAttribute("cri") Criteria cri,
			BoardVO board,
			RedirectAttributes rttrs
		) {
		log.debug("register({}, {}) invoked.", board, rttrs);
		
		this.service.register(board);
		
		rttrs.addFlashAttribute("result", board.getBno());
		
		rttrs.addAttribute("currPage", cri.getCurrPage());
		rttrs.addAttribute("amount", cri.getAmount());
		rttrs.addAttribute("pagesPerPage", cri.getPagesPerPage());
		
		return "redirect:/board/listPerPage";
	} // register
	
	
	@GetMapping("register")
	public void register(@ModelAttribute("cri") Criteria cri) {	// Method overloading
		log.debug("register({}) invoked.", cri);
		
	} // register
	
	
	@GetMapping("list")
	public void list(Model model) {
		log.debug("list({}) invoked.", model);
		
		List<BoardVO> boards = this.service.getList();
		
		Objects.requireNonNull(boards);
		boards.forEach(log::info);
		
		model.addAttribute("list", boards);
	} // list
	
	
	@GetMapping("listPerPage")
	public String listPerPage(
			@ModelAttribute("cri")
			Criteria cri,
			
			Model model
		) {
		log.debug("listPerPage({}) invoked.", model);
		
		List<BoardVO> boards = this.service.getListPerPage(cri);
		
		Objects.requireNonNull(boards);
		boards.forEach(log::info);
		
		PageDTO pageDTO = new PageDTO(cri, this.service.getTotal(cri));
		
		model.addAttribute("list", boards);
		model.addAttribute("pageMaker", pageDTO);
		
		return "board/list";
	} // listPerPage
	
	
	@GetMapping({ "get", "modify" })
	public void get(
			@ModelAttribute("cri") Criteria cri,
			@RequestParam("bno") Integer bno,
			Model model
		) {
		log.debug("get({}, {}) invoked.", bno, model);
		
		BoardVO board = this.service.get(bno);
		
		assert board != null;
		log.info("\t+ board: {}", board);
		
		model.addAttribute("board", board);
	} // get
	
	
	@PostMapping("remove")
	public String remove(
			@ModelAttribute("cri") Criteria cri,
			@RequestParam("bno") Integer bno,
			RedirectAttributes rttrs
		) {
		log.debug("remove({}, {}) invoked.", bno, rttrs);
		
		boolean isRemoved = this.service.remove(bno);
		if(isRemoved) {	// 삭제성공 일 때
			rttrs.addFlashAttribute("result", "success");
		} // if

		rttrs.addAttribute("currPage", cri.getCurrPage());
		rttrs.addAttribute("amount", cri.getAmount());
		rttrs.addAttribute("pagesPerPage", cri.getPagesPerPage());
		
		return "redirect:/board/listPerPage";
	} // remove
	
	
	

	
	
	//================================================//

	@Override
	public void afterPropertiesSet() throws Exception {	// 빈 객체가 생성직후에 호출
		log.debug("afterPropertiesSet() invoked.");
		
		assert this.service != null;
		
		log.info("\t+ service: {}", this.service);
	} // afterPropertiesSet
	
	//================================================//

} // end class
