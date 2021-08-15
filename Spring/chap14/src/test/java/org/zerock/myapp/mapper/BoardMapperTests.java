package org.zerock.myapp.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Objects;

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

@ContextConfiguration(locations= {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class BoardMapperTests {
	
//	@Resource(type=BoardMapper.class)
//	@Autowired
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;		// DI
	
	
	
	@Before
	public void setup() {
		log.debug("setup() invoked.");
		
		Objects.requireNonNull(this.mapper);
//		assertNotNull(this.mapper);
//		assert this.mapper != null;
		
		log.info("\t+ mapper: " + this.mapper);
		log.info("\t+ type: " + this.mapper.getClass().getName());
	} // setup
	
	
	@Test
	public void testGetList() {
		log.debug("testGetList() invoked.");
		
		List<BoardVO> list = this.mapper.getList();
		
		assert list != null;
		
		list.forEach(log::info);
	} // testGetList
	
	
	@Test(timeout=1000)
	public void testGetListWithPaging() {
		log.debug("testGetListWithPaging() invoked.");
		
		Objects.requireNonNull(mapper);
		
		Criteria cri = new Criteria();
		cri.setCurrPage(3);
		cri.setAmount(20);
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(log::info);
	} // testGetListWithPaging
	
	
	@Test
	public void testRead() {
		log.debug("testRead() invoked.");
		
		BoardVO board = this.mapper.read(1000);
		assertNotNull(board);
		
		log.info("\t+ board: " + board);
	} // testRead
	
	
	@Test
	public void testDelete() {
		log.debug("testRead() invoked.");
		
		int affectedLines = this.mapper.delete(1000);
		log.info("\t+ affectedLines: " + affectedLines);
	} // testDelete
	
	
	@Test
	public void testInsert() {
		log.debug("testRead() invoked.");
		
		BoardVO newBoard = 
				new BoardVO(
					null,
					"TITLE_1001",
					"CONTENT_1001",
					"WRITER_1001",
					null,
					null
				);
		
		int affectedLines = this.mapper.insert(newBoard);
		log.info("\t+ affectedLines: " + affectedLines);
		log.info("\t+ newBoard: " + newBoard);
	} // testInsert
	
	
	@Test
	public void testInsertSelectKey() {
		log.debug("testInsertSelectKey() invoked.");
		
		BoardVO newBoard = 
				new BoardVO(
					null,
					"TITLE_1001",
					"CONTENT_1001",
					"WRITER_1001",
					null,
					null
				);
		
		int affectedLines = this.mapper.insertSelectKey(newBoard);
		log.info("\t+ affectedLines: " + affectedLines);
		log.info("\t+ newBoard: " + newBoard);
	} // testInsertSelectKey
	
	
	@Test
	public void testUpdate() {
		log.debug("testUpdate() invoked.");
		
		// 기존 게시글을 변경(업데이트)함.
		BoardVO updateBoard = 
				new BoardVO(
						999,
						"TITLE_UPDATED",
						"CONTENT_UPDATED",
						"WRITER_UPDATED",
						null,
						null
					);
		
		int affectedLines = this.mapper.update(updateBoard);
		log.info("\t+ affectedLines: " + affectedLines);
	} // testUpdate
	
	
	@Test
	public void testGetTotalCount() {
		log.debug("testGetTotalCount() invoked.");
		
		Criteria cri = new Criteria();
		cri.setCurrPage(3);
		cri.setAmount(10);
		
		int totalAmount = this.mapper.getTotalCount(cri);
		log.info("\t+ totalAmount: " + totalAmount);
	} // testGetTotalCount
	
	
	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");
		
	} // setup

} // end class
