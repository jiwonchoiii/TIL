package org.zerock.myapp.mapper;

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
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper; // DI

	@Before
	public void setUp() {
		log.debug("setUp() invoked.");

		assertNotNull(this.mapper);

		log.info("\t+ mapper: " + mapper);
		log.info("\t+ type: " + this.mapper.getClass().getName());
	} // setUp

	@Test
	public void testGetList() {
		log.debug("testGetList() invoked.");

		List<BoardVO> list = this.mapper.getList();
		assert list != null;
//		assertNotNull(list);

//		log.info("\t+ list: "+list);
		list.forEach(log::info);

	} // testGetList

	@Test
	public void testSelect() {
		log.debug("testSelect() invoked.");

		BoardVO board = this.mapper.select(100); // auto boxing
		assertNotNull(board);

		log.info("\t+ board: " + board);
	} // testSelect

	@Test
	public void testDelete() {
		log.debug("testDelete() invoked.");

		int affectedLines = this.mapper.delete(998); // auto boxing
//		assertNotNull(affectedLines); 객체가 아니므로 null인지 확인하지 않음 

		log.info("\t+ affectedLines: " + affectedLines);
	} // testDelete

	@Test
	public void testInsert() {
		log.debug("testInsert() invoked.");

		BoardVO newBoard = 
				new BoardVO(
					null, 
					"TITLE_998", 
					"CONTENT_998", 
					"WRITER_998", 
					null, 
					null
					);
	
		int affectedLines = this.mapper.insert(newBoard); // auto boxing
//		assertNotNull(affectedLines); 객체가 아니므로 null인지 확인하지 않음 

		log.info("\t+ affectedLines: " + affectedLines);
		log.info("\t+ newBoard: " + newBoard);
	} // testInsert
	
	@Test
	public void testInsertSelectKey() {
		log.debug("testInsertSelectKey() invoked.");

		BoardVO newBoard = 
				new BoardVO(
					null, 
					"TITLE_998", 
					"CONTENT_998", 
					"WRITER_998", 
					null, 
					null
					);
	
		int affectedLines = this.mapper.insertSelectKey(newBoard); // auto boxing
//		assertNotNull(affectedLines); 객체가 아니므로 null인지 확인하지 않음 

		log.info("\t+ affectedLines: " + affectedLines);
		log.info("\t+ newBoard: " + newBoard);
	} // testInsertSelectKey
	
	@Test
	public void testUpdate() {
		log.debug("testUpdate() invoked.");
		

		BoardVO newBoard = 
				new BoardVO(
					1002, 
					"TITLE_UPDATED", 
					"CONTENT_UPDATED", 
					"WRITER_UPDATED", 
					null, 
					null
					);
	
		int affectedLines = this.mapper.update(newBoard); // auto boxing
//		assertNotNull(affectedLines); 객체가 아니므로 null인지 확인하지 않음 

		log.info("\t+ affectedLines: " + affectedLines);
	} // testUpdate

	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");

	} // tearDown

} // end class
