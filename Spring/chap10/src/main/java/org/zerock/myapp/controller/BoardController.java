package org.zerock.myapp.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.myapp.domain.BoardVO;
import org.zerock.myapp.service.BoardService;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/board/")
@Controller
public class BoardController
   implements InitializingBean{

   @Setter(onMethod_= @Autowired)
   private BoardService service;
   

   @Override
   public void afterPropertiesSet() throws Exception {
      log.debug("afterPropertiesSet() invoked.");
      
      Objects.requireNonNull(service);
      
      log.info("\t+ service : {}", service);
      
   }//afterPropertiesSet
   
   
   //==========================================
   // Request Mapping Table 설계
   //==========================================
   //(1) /board/get      GET      get(bno, model)
   //(2) /board/list      GET      list(model)
   //(3) /board/modify      POST   modify() 
   //(4) /board/register   POST   register(board, rttrs) --> redirect:/board/list
   //(5) /board/remove      POST   remove(bno, RedirectionAttributes rttrs) --> redirect:/board/list
   //==========================================

   
   @GetMapping("list")
   public void list(Model model) {
      log.debug("list({}) invoked.", model);
      
      List<BoardVO> boards = this.service.getList();
      
      assert boards != null;
      
      boards.forEach(log::info);
      
      model.addAttribute("list", boards);
   }//list
   
   @GetMapping("get")
   public void get(@RequestParam("bno") Integer bno, Model model) {
      log.debug("get({}, {}) invoked.", bno, model);
      
      BoardVO board = this.service.get(bno);
      
      assert board != null;
      
      log.info("\t+ board : {}", board);
      
      model.addAttribute("board", board);
      
   }//get
   
   @PostMapping("remove")
   public String remove(@RequestParam("bno") Integer bno, RedirectAttributes rttrs) {
      log.debug("remove({}, {}) invoked.", bno, rttrs);
      
      boolean isRemoved = this.service.remove(bno);
      if(isRemoved) {   //삭제 성공일 때
         rttrs.addAttribute("result", "success");
      }//if
      
      return "redirect:/board/list";
   }//remove
   
   @PostMapping("register")
   public String regeister(BoardVO board, RedirectAttributes rttrs) {
      log.debug("register({}, {}) invoked", board, rttrs) ;
      
      this.service.register(board);
      
      rttrs.addFlashAttribute("result",board.getBno());
      
      return "redirect:/board/list";
      
   }//register
   
   @PostMapping("modify")
   public String modify(BoardVO board, RedirectAttributes rttrs) {
      log.debug("modify({}, {}) invoked.", board, rttrs);
      
      boolean isModified = this.service.modify(board);
      
      if(isModified) {
         rttrs.addFlashAttribute("result", "success");
      }//if
      
      //HTTP status code 301 (moved permanently)
      return "redirect:/board/list";
   }


}