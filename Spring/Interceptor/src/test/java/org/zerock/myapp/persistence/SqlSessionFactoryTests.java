//package org.zerock.myapp.persistence;
//
//import static org.junit.Assert.assertNotNull;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Objects;
//
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.zerock.myapp.domain.DepartmentsVO;
//import org.zerock.myapp.mapper.TimeMapper;
//
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.extern.log4j.Log4j2;
//
//@Log4j2
//@NoArgsConstructor
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-*.xml" })
//public class SqlSessionFactoryTests {
//
////	@Inject   // dependency 있어야함
////	@Resource(type=SqlSessionFactory.class)
////	@Autowired
//
////	@Setter(onMethod_= {@Autowired})
//	@Setter(onMethod_ = @Autowired)
//	private SqlSessionFactory sqlSessionFactory;
//
//	@Before
//	public void setUp() {
//		log.debug("setUp() invoked.");
//
//		assertNotNull(this.sqlSessionFactory);
//		log.info("\t + sqlSessionFactory: " + sqlSessionFactory);
//	} // setUp
//	
//	//==================================================//
//	// (1) MyBatis SQL Mapper XML 파일과 namespace/sqlId를 이용한 방식 (*** 추천 ***) 
//	//==================================================//
//	
//
//	@Test
//	public void testDQL1() {
//		log.debug("testDQL1() invoked.");
//
//		SqlSession sqlSession = this.sqlSessionFactory.openSession();
//
//		try (sqlSession) {
//			log.info("\t+ sqlSession: " + sqlSession);
//
//			String namespace = "sqlmapper1";
//			String sqlId = "DQL1";
//			String mappedStatement = namespace + "." + sqlId;
//
//			String now = sqlSession.<String>selectOne(mappedStatement);
//
//			log.info("\t + now: " + now);
//		} // try-with-resources
//
//	} // testDQL1
//
//	@Test
//	public void testDQL2() {
//		log.debug("testDQL2() invoked.");
//
//		SqlSession sqlSession = this.sqlSessionFactory.openSession();
//
//		try (sqlSession) {
//
//			String namespace = "sqlmapper2";
//			String sqlId = "DQL2";
//			String mappedStatement = namespace + "." + sqlId;
//			
//			Map<String, Object> params = new HashMap<>();
//			params.put("deptno",100);
//			params.put("deptname", "Co");
//
//			List<DepartmentsVO> depts = sqlSession.<DepartmentsVO>selectList(mappedStatement, params);
//			Objects.requireNonNull(depts);
//
//			log.info("\t + type: " + depts.getClass().getName());
//			
//			depts.forEach(log::info);
//		} // try-with-resources
//
//	} // testDQL2
//	
//	
//	//==================================================//
//	// (2) MyBatis interface와 Annotation을 이용한 방식 (**** 비추천 ****) 
//	//==================================================//
//	
//	
//	@Test
//	public void testGetNow() {
//		log.debug("testGetNow() invoked.");
//		
//		SqlSession sqlSession = this.sqlSessionFactory.openSession();
//		
//		try(sqlSession){
//			TimeMapper mapper = sqlSession.<TimeMapper>getMapper(TimeMapper.class);
//			
//			assert mapper != null;
//			
//			log.info("\t + mapper: " + mapper);
//			
//			Date now = mapper.getNow();
//			
//			log.info("\t + now: " + now);
//		} // try-with-resources
//		
//	} // testGetNow
//	
//	
//	//==================================================//
//	// (3) SQL Mapper XML 방식 + MyBatis interface 방식의 결합(책) 
//	//==================================================//
//	
//	@Test
//	public void testGetTime() {
//		log.debug("testGetNow() invoked.");
//		
//		SqlSession sqlSession = this.sqlSessionFactory.openSession();
//		
//		try(sqlSession){
//			
//			TimeMapper mapper = sqlSession.getMapper(TimeMapper.class);
//			log.info("\t mapper: " + mapper);
//			
//			String now = mapper.getTime();  // @Select annotation이 없는 추상메소드
//			log.info("\t+ now: " + now);
//		} // try-with-resources
//		
//	} // testGetTime
//
//	@After
//	public void tearDown() {
//		log.debug("tearDown() invoked.");
//	} // tearDown
//
//}
