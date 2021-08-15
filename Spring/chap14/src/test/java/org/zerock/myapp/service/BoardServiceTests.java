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
import org.zerock.myapp.domain.Criteria;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
})
public class BoardServiceTests {
	
	@Setter(onMethod_= @Autowired)
	private BoardService service;			// 테스트할 대상 빈 객체
	
	
	
	@Before
	public void setup() {					// 사전처리작업
		log.debug("setup() invoked.");
		
//		assertNotNull(this.service);
//		assert this.service != null;
//		Objects.requireNonNull(this.service);
		
		log.info("\t+ service: {}", this.service);
	} // setup
	
	
	@Test
	public void testGetList() {
		log.debug("testGetList() invoked.");
		
		List<BoardVO> boards = this.service.getList();
		
		assertNotNull(boards);
		
		boards.forEach(log::info);
		
		// 리스트 자원객체 해제코드(빨리 GC되도록 해줌...)
		boards.clear();
		boards = null;
	} // testGetList
	
	
	@Test(timeout=500)
	public void testGetListPerPage() {
		log.debug("testGetListPerPage() invoked.");
		
		Criteria cri = new Criteria();
		cri.setCurrPage(20);
		cri.setAmount(20);
		
		List<BoardVO> boards = this.service.getListPerPage(cri);
		boards.forEach(log::info);
		
		boards.clear();
		boards = null;
	} // testGetListPerPage
	
	
	@Test
	public void testRegister() {
		log.debug("testRegister() invoked.");
		
		BoardVO board = 
			new BoardVO(
				null, 
				"TITLE_777", 
				"CONTENT_777", 
				"WRITER_777", 
				null, 
				null);
		
		log.info("\t+ board: " + board);
		
		if(service.register(board)) {
			log.info("\t+ New board registered.");
			log.info("\t+ board: {}", board);
		} else {
			log.info("\t+ No board registered.");
		} // if-else
	} // testRegister
	
	
	@Test
	public void testModify() {
		log.debug("testModify() invoked.");
		
		BoardVO board = 
			new BoardVO(
				1007, 
				"TITLE_1007", 
				"CONTENT_1007", 
				"WRITER_1007", 
				null, 
				null);
		
		log.info("\t+ board: " + board);
		
		if(service.modify(board)) {
			log.info("\t+ The specified board updated.");
			log.info("\t+ board: {}", board);
		} else {
			log.info("\t+ No board updated.");
		} // if-else
	} // testModify
	
	
	@Test(timeout=1000)		// Time Limit: 1초(1000ms)
	public void testGetTotal() {
		log.debug("testGetTotal() invoked.");
		
		Criteria cri = new Criteria();
		cri.setCurrPage(3);
		cri.setAmount(10);
		
		int totalAmount = this.service.getTotal(cri);
		log.info("\t+ totalAmount: {}", totalAmount);
	} // testGetTotal
	
	
	@After
	public void tearDown() {				// 사후처리작업
		log.debug("tearDown() invoked.");
		
	} // tearDown

} // end class
