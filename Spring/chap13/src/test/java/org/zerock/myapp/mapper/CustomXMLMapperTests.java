package org.zerock.myapp.mapper;

import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.myapp.domain.BoardVO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;



@Log4j
@NoArgsConstructor

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations= {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"	
})
public class CustomXMLMapperTests {
	
//	@Setter(onMethod_= { @Autowired })
//	@Setter(onMethod_= { @Inject })
	
//	@Setter(onMethod_= { @Resource })
//	@Setter(onMethod_= { @Resource(type=SqlSessionFactory.class) })
	
	
//	@Setter(onMethod_= @Autowired)
//	@Setter(onMethod_= @Inject)
	
	
//	@Setter(onMethod_= @Resource)
//	@Setter(onMethod_= @Resource(type=SqlSessionFactory.class))
	
//	@Inject
//	@Autowired
	
//	@Resource
	@Resource(type = SqlSessionFactory.class)
	private SqlSessionFactory sqlSessionFactory;
	
	
	
	@Before
	public void setup() {
		log.debug("setup() invoked.");
		
		Objects.requireNonNull(sqlSessionFactory);
		log.info("\t+ sqlSessionFactory: " + sqlSessionFactory);
	} // setup
	
	
//	@Test(timeout=1000)
	@Test
	public void testGetList() {
		log.debug("testGetList() invoked.");
		
		SqlSession sess = sqlSessionFactory.openSession();
		
		try(sess) {
			
			String sql = "CustomBoardMapper" + "." + "getList";
			List<BoardVO> list = sess.<BoardVO>selectList(sql);
			
			list.forEach(b -> {
				
				String board = String.format(
						"%s, %s, %s, %s, %s, %s",
						b.getBno(),
						b.getTitle(),
						b.getContent(),
						b.getWriter(),
						b.getInsert_ts(),
						b.getUpdate_ts()
					);
				
				log.info(board);
			}); // forEajch
			
		} // try-with-resource on the JAVA 9 and above.
		
	} // testGetList
	
	
	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");
		
	} // tearDown

} // end class
