package org.zerock.myapp.controller;

import java.util.Objects;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
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

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;



@Log4j
@AllArgsConstructor

@RequestMapping("/board/*")
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

	
	@GetMapping("/list")
	public void list(Model model) {
		log.debug("list(model) invoked.");
		
		Objects.requireNonNull(service);
		
		model.addAttribute("list", service.getList());	// set to request scope.
	} // list
	
	
	@GetMapping("/listPerPage")
	public String listPerPage(@ModelAttribute("cri") Criteria cri, Model model) {
		log.debug("listPerPage(cri, model) invoked.");
		
		log.info("\t+ cri: " + cri);
		
		Objects.requireNonNull(service);
		
		model.addAttribute("list", service.getListPerPage(cri));
		
		PageDTO pageDTO = new PageDTO(cri, service.getTotal(cri));
		model.addAttribute("pageMaker", pageDTO);
		
		return "board/list";
	} // listPerPage
	
	
	@PostMapping("/register")
	public String register(BoardVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttrs) {
		log.debug("register(board, cri, rttrs) invoked.");
		
		log.info("\t+ board: " + board);
		log.info("\t+ cri: " + cri);
		
		Objects.requireNonNull(service);
		
		if(service.register(board)) {
			rttrs.addFlashAttribute("result", "success");	// OK : Request Scope 이용
//			rttrs.addAttribute("result", "success");		// XX : ?result=success 방식으로 전달
		} // if
		
		rttrs.addAttribute("currPage", cri.getCurrPage());
		rttrs.addAttribute("amount", cri.getAmount());
		rttrs.addAttribute("pagesPerPage", cri.getPagesPerPage());
		
		return "redirect:/board/listPerPage";
	} // register
	
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Integer bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.debug("get(bno, model) invoked.");
		
		log.info("\t+ bno: " + bno);
		log.info("\t+ cri: " + cri);
		
		Objects.requireNonNull(service);
		
		BoardVO board = service.get(bno);
		log.info("\t+ board: " + board);
		
		model.addAttribute("board", board);
	} // get
	
	
	@PostMapping("/modify")
	public String modify(BoardVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttrs) {
		log.debug("modify(board, cri, rttrs) invoked.");
		
		log.info("\t+ board: "+board);
		log.info("\t+ cri: " + cri);
		
		Objects.requireNonNull(service);
		
		if(service.modify(board)) {
			rttrs.addFlashAttribute("result", "success");	// OK : Request Scope 이용
//			rttrs.addAttribute("result", "success");		// XX : ?result=success 방식으로 전달
		} // if
		
		rttrs.addAttribute("currPage", cri.getCurrPage());
		rttrs.addAttribute("amount", cri.getAmount());
		rttrs.addAttribute("pagesPerPage", cri.getPagesPerPage());
		
		return "redirect:/board/listPerPage";
	} // modify
	
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Integer bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttrs) {
		log.debug("remove(board, cri, rttrs) invoked.");
		
		log.info("\t+ bno: " + bno);
		log.info("\t+ cri: " + cri);
		
		Objects.requireNonNull(service);
		
		if(service.remove(bno)) {
			rttrs.addFlashAttribute("result", "success");	// OK : Request Scope 이용
//			rttrs.addAttribute("result", "success");		// XX : ?result=success 방식으로 전달
		} // if
		
		rttrs.addAttribute("currPage", cri.getCurrPage());
		rttrs.addAttribute("amount", cri.getAmount());
		rttrs.addAttribute("pagesPerPage", cri.getPagesPerPage());
		
		return "redirect:/board/listPerPage";
	} // remove
	
	
	@GetMapping("/register")
	public void register(@ModelAttribute("cri") Criteria cri) {
		log.debug("register(cri) invoked.");
		
		log.info("\t+ cri: " + cri);
		
		
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
