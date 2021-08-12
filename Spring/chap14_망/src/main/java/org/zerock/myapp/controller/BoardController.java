package org.zerock.myapp.controller;

import java.util.List;
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
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor

@RequestMapping("/board/")
@Controller("boardController")
public class BoardController implements InitializingBean, DisposableBean {

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

	// =============================================//
	// Request Mapping table 설계
	// =============================================//
	// (1) /board/get GET void get(bno, model)
	// (2) /board/list GET void list(model)
	// (3) /board/modify POST modify()
	// (4) /board/register POST register()
	// (5) /board/remove POST String remove(bno,rttrs) ---> redirect:/board/list

	@GetMapping("list")
	public void list(Model model) {
		log.debug("list({}) invoked.", model);

		Objects.requireNonNull(service);
		model.addAttribute("list", service.getList()); // set to request scope.
	} // list

	@GetMapping("listPerPage")
	public String listPerPage(
//			자동으로 날라가지만 이 어노테이션을 안쓰면 criteria라고 날라감.
//			우리가 원하는 이름은 cri이므로 어노테이션 사용
			@ModelAttribute("cri") Criteria cri, Model model) {
		log.debug("listPerPage({}, {}) invoked.", cri, model);

		List<BoardVO> boards = this.service.getListPerPage(cri);

		Objects.requireNonNull(boards);
		boards.forEach(log::info);

		PageDTO pageDTO = new PageDTO(cri, this.service.getTotal(cri));
		model.addAttribute("list", boards); // set to request scope.
		model.addAttribute("pageMaker", pageDTO);
		return "board/list"; // 직접 return할때는 base uri까지 반환해야한다!
	} // listPerPage

	@PostMapping("register")
	public String register(
			@ModelAttribute("cri") Criteria cri,
			BoardVO board, 
			RedirectAttributes rttrs) {
		log.debug("register(board, rttrs) invoked.");

		log.info("\t+ board: " + board);

		Objects.requireNonNull(service);
		
		this.service.register(board);

//		공유영역을 통해 값을 전달. session scope를 통해 날아간다. 쿼리스트링X 
		rttrs.addFlashAttribute("result", "success"); // OK : Session Scope 이용

//		GET방식답게 전송파라미터를 보내려면 addAttribute를 사용해야한다. (addFlashAttribute X)
		// 쿼리스트링을 통해 값을 전달. 공유영역 X
		rttrs.addAttribute("currPage", cri.getCurrPage());
		rttrs.addAttribute("amount",cri.getAmount());
		rttrs.addAttribute("pagesPerPage",cri.getPagesPerPage());
		
		return "redirect:/board/listPerPage";
//		return "redirect:http://localhost:7777";
	} // register

	@GetMapping("/register")
	public void register(@ModelAttribute("cri") Criteria cri) { // 메소드 오버로딩
		log.debug("register({}) invoked.", cri);

	} // register

	@GetMapping({ "/get", "/modify" })
	public void get(@ModelAttribute("cri") Criteria cri, @RequestParam("bno") Integer bno, Model model) {
		log.debug("get(bno, model) invoked.");

		log.info("\t+ bno: " + bno);

		Objects.requireNonNull(service);
		BoardVO board = service.get(bno);
		log.info("\t+ board: " + board);

//		model.addAttribute("board", board);
	} // get

	@PostMapping("/modify")
	public String modify(
			@ModelAttribute("cri") Criteria cri, BoardVO board, RedirectAttributes rttrs) {
		log.debug("modify(board, rttrs) invoked.");

		log.info("\t+ board: " + board);

		Objects.requireNonNull(service);
		if (service.modify(board)) {
			rttrs.addFlashAttribute("result", "success");
		} // if

		return "redirect:/board/list";
	} // modify

	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Integer bno, RedirectAttributes rttrs) {
		log.debug("modify(board, rttrs) invoked.");

		log.info("\t+ bno: " + bno);

		Objects.requireNonNull(service);
		if (service.remove(bno)) {
			rttrs.addFlashAttribute("result", "success");
		} // if

		return "redirect:/board/list";
	} // remove

	// ===================================================//

	@Override
	public void destroy() throws Exception {
		log.debug("destroy() invoked.");

	} // destroy

	@Override
	public void afterPropertiesSet() throws Exception {
		log.debug("afterPropertiesSet() invoked.");

	} // afterPropertiesSet

} // end class
