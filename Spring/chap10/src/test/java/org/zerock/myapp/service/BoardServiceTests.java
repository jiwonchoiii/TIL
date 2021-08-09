package org.zerock.myapp.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.myapp.domain.BoardVO;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
      "file:src/main/webapp/WEB-INF/spring/root-*.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-*.xml"})      
public class BoardServiceTests {
   
   @Setter(onMethod_= {@Autowired})
   private BoardService service;         //테스트 대상 객체
   
   @Before
   public void setup() {
      log.debug("setup() invoked.");
      
      assertNotNull(this.service);
      
      log.info("\t+ service : {}", this.service);      
   } //setup
   
   @Test
   public void testGetList() {
      log.debug("testGetList() invoked.");
      
      List<BoardVO> boards = this.service.getList();
      
      assertNotNull(boards);
      
      boards.forEach(log::info);
      
      //리스트 자원객체 해제코드
      boards.clear();
      boards = null;      
   } //testGetList
   
   @Test
   public void testRegister() {
      log.debug("testRegister() invoked.");
      
      BoardVO board = new BoardVO(null, "title_1010", "content_1010", "writer_1010", null, null);
      
      if(service.register(board)) {
         log.info("\t+ new board registered.");
         log.info("\t+ board : {}", board);
      } else {
         
         log.info("board register failed");
      } //if-else      
   
   } //testRegister
   
   @Test
   public void testModify() {
      log.debug("testModify() invoked.");
      
      BoardVO board = new BoardVO(1012, "title_1020", "content_1020", "writer_1020", null, null);
      
      if(service.modify(board)) {
         log.info("\t+ the specified board updated.");
         log.info("\t+ board : {}", board);
      } else {
         log.info("board update failed");
      }
   } //testModify
   
   @Test
   public void testRemove() {
      log.debug("testRemove() invoked.");
      
      if(service.remove(1012)) {
         
         log.info("\t+ board remove success");         
      } else {
         
         log.info("board remove failed");
      } //if-else
   } //testRemove
   
   @Test
   public void testGet() {
      log.debug("testGet() invoked.");
      
      BoardVO board = this.service.get(999);
      
      log.info("\t+ board : {}", board);
   } //testGet
   
   @After
   public void tearDown() {
      log.debug("tearDown() invoked.");
      
   } //tearDown

} //end class