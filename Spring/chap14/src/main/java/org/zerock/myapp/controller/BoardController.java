package org.zerock.myapp.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.myapp.domain.BoardVO;
import org.zerock.myapp.domain.Criteria;
import org.zerock.myapp.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Log4j2
@AllArgsConstructor

@RequestMapping("/board/")
@Controller("boardController")
public class BoardController
	implements InitializingBean, DisposableBean {
	
//	@Setter(onMethod_= { @Autowired })
//	@Setter(onMethod_= { @Inject })
	
//	@Setter(onMethod_= { @Resource })
//	@Setter(onMethod_= { @Resource(type=BoardService.class) })
	
//	@Setter(onMethod_= @Autowired)
//	@Setter(onMethod_= @Inject)
	
//	@Setter(onMethod_= @Resource)
//	@Setter(onMethod_= @Resource(type=BoardService.class))
	
//	@Inject
//	@Autowired
	
//	@Resource
//	@Resource(type = BoardService.class)
	
	// Since Spring v4.3, One field injected by a constructor with that field.
	private BoardService service;

	//=============================================//
	// Request Mapping table 설계
	//=============================================//
	// (1) /board/get	GET		void get(bno, model)
	// (2) /board/list	GET		void list(model)
	// (3) /board/modify	POST	modify()
	// (4) /board/register	POST	register()
	// (5) /board/remove	POST	String remove(bno,rttrs) ---> redirect:/board/list

	@GetMapping("list")
	public void list(Model model) {
		log.debug("list({}) invoked.", model);
		
		Objects.requireNonNull(service);
		model.addAttribute("list", service.getList());	// set to request scope.
	} // list
	
	@GetMapping("listPerPage")
	public String listPerPage(Criteria cri, Model model) {
		log.debug("listPerPage({}, {}) invoked.", cri, model);
		
		List<BoardVO> boards = this.service.getListPerPage(cri);
		
		Objects.requireNonNull(boards);
		
		boards.forEach(log::info);
		
		model.addAttribute("list", boards);	// set to request scope.

		return "board/list"; // 직접 return할때는 base uri까지 반환해야한다!
	} // listPerPage
	
	@PostMapping("register")
	public String register(BoardVO board, RedirectAttributes rttrs) {
		log.debug("register(board, rttrs) invoked.");
		
		log.info("\t+ board: " + board);
		
		Objects.requireNonNull(service);
		
		if(service.register(board)) {
			rttrs.addFlashAttribute("result", "success");	// OK : Session Scope 이용
//			rttrs.addAttribute("result", "success");		// XX : ?result=success 방식으로 전달
		} // if
		
		
		return "redirect:/board/list";
	} // register
	
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Integer bno, Model model) {
		log.debug("get(bno, model) invoked.");
		
		log.info("\t+ bno: " + bno);
		
		Objects.requireNonNull(service);
		BoardVO board = service.get(bno);
		log.info("\t+ board: " + board);
		
		model.addAttribute("board", board);
	} // get
	
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttrs) {
		log.debug("modify(board, rttrs) invoked.");
		
		log.info("\t+ board: "+board);
		
		Objects.requireNonNull(service);
		if(service.modify(board)) {
			rttrs.addFlashAttribute("result", "success");
		} // if
		
		return "redirect:/board/list";
	} // modify
	
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Integer bno, RedirectAttributes rttrs) {
		log.debug("modify(board, rttrs) invoked.");
		
		log.info("\t+ bno: " + bno);
		
		Objects.requireNonNull(service);
		if(service.remove(bno)) {
			rttrs.addFlashAttribute("result", "success");
		} // if
		
		return "redirect:/board/list";
	} // remove
	
	
	@GetMapping("/register")
	public void register() {
		log.debug("register() invoked.");
		
		
	} // register
	
	
	//===================================================//

	@Override
	public void destroy() throws Exception {
		log.debug("destroy() invoked.");
		
	} // destroy

	@Override
	public void afterPropertiesSet() throws Exception {
		log.debug("afterPropertiesSet() invoked.");
		
	} // afterPropertiesSet
	

} // end class
