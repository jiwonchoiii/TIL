package org.zerock.mybatis;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.zerock.mybatis.domain.EmployeesVO;
import org.zerock.mybatis.mapper.Time2Mapper;
import org.zerock.mybatis.mapper.TimeMapper;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;;


@Log4j2
@NoArgsConstructor
public class SqlSessionFactoryBuilderTests {
	
	private SqlSessionFactoryBuilder builder;
	private SqlSessionFactory factory;
	private String mybatisConfigXml = "mybatis-config.xml";
	
	
	
	@Before
	public void setup() throws IOException {
		log.debug("setup() invoked.");
		
		// 0. mybatis-config.xml 파일에 대한, 바이트 기반의 InputStream 객체 생성
		InputStream is = Resources.getResourceAsStream(mybatisConfigXml);
		
		// 1. SqlSessionFactoryBuilder 생성
		this.builder = new SqlSessionFactoryBuilder();
		log.info("\t+ builder: " + builder);
				
		// 2. SqlSessionFactory 생성
		this.factory = this.builder.build(is);
		log.info("\t+ factory: " + factory);
	} // setup
	
	
	//==================================================//
	// (1) MyBatis SQL Mapper XML 파일과 namespace/sqlId를 이용한 방식 (*** 추천 ***) 
	//==================================================//
	
	@Test
	public void testGetTime() {
		log.debug("testGetTime() invoked.");

		// 3. SqlSession 생성		
		SqlSession sqlSession = this.factory.openSession();	// AutoClosable 한 자원객체
		log.info("\t+ sqlSession: " + sqlSession);
		
		try(sqlSession) {	// 자동으로 자원해제
			
			// Mybatis에게 SQL처리를 하라! 라고 명령을 하달!!! (이게 어렵기도 하고, 핵심임)
			String namespace = "Test2";
			String sqlId = "getNow";
			
			String sql = namespace + "." + sqlId;	// Test1.getTime
					
			// <T> T selectOne(String statement);
			Timestamp now = sqlSession.<Timestamp>selectOne(sql);
			log.info("\t+ now: " + now);
			
		} // try-with-resources
	} // testGetTime
	
	
	@Test(timeout=2000)
	public void testGetAllEmployees() {
		log.debug("testGetAllEmployees() invoked.");
		
		SqlSession sqlSession = this.factory.openSession();
		
		try (sqlSession) {
			
			String namespace = "org.zerock.mybatis";
			String sqlId = "getAllEmployees";
			
			String mappedStmt = namespace + "." + sqlId;
			
//			Map<String, Number> params = new HashMap<>();
//			params.put("NAME1", 150);
//			params.put("NAME2", 5000.0);
			
			//--------------------------------------------------//
			class Params {
				private Integer name1;			// 사원번호
				private Double  name2;			// 급여
				
				
				public Params(Integer name1, Double name2) {
					this.name1 = name1;
					this.name2 = name2;
				} // constructor
				
				public Integer getNAME1() {
					log.debug("getNAME1() invoked.");
					
					return name1;
				} // getName1
				
				public Double getNAME2() {
					log.debug("getNAME2() invoked.");
					
					return name2;
				} // getName2
			};	// 익명자식객체구현
			
//			Params params = new Params(150, 5000.0);	// 빈즈객체 생성
			//--------------------------------------------------//
			
			Object params = new Object() {
				private Integer name1 = 150;
				private Double name2 = 5000.0;
				
				
				public Integer getNAME1() {
					return name1;
				} // getNAME1
				
				public Double getNAME2() {
					return name2;
				} // getNAME2
			};
			//--------------------------------------------------//
			
			
			// <E> List<E> selectList(String statement);
			List<EmployeesVO> employees = 
				sqlSession.<EmployeesVO>selectList(mappedStmt, params);
			
			assertNotNull(employees);
//			Objects.requireNonNull(employees);
//			assert employees != null;
			
			employees.forEach(log::info);
			
			employees.clear();
			employees = null;
			
		} // try-with-resources
		
	} // testGetAllEmployees
	
	
	//==================================================//
	// (2) MyBatis interface와 Annotation을 이용한 방식 (**** 비추천 ****) 
	//==================================================//
	
	
	@Test
	public void testGetNow() {
		log.debug("testGetNow() invoked.");
		
		SqlSession sqlSession = this.factory.openSession();
		
		try (sqlSession) {
			
			// Lvalue(interface) 변수 = Rvalue(interface 구현객체)
			
			// <T> T getMapper(Class<T> type);
			TimeMapper mapper = 
				sqlSession.<TimeMapper>getMapper(TimeMapper.class);
			
			assertNotNull(mapper);
			
			log.info("\t+ mapper: " + mapper);
			
			String now = mapper.getNow();
			log.info("\t+ now: " + now);
			
		} // try-with-resources
	} // testGetNow
	
	@Test
	public void testGetNow2() {
		log.debug("testGetNow2() invoked.");
		
		SqlSession sqlSession = this.factory.openSession();
		
		try (sqlSession) {
			
			// Lvalue(interface) 변수 = Rvalue(interface 구현객체)
			
			// <T> T getMapper(Class<T> type);
			Time2Mapper mapper = 
				sqlSession.<Time2Mapper>getMapper(Time2Mapper.class);
			
			assertNotNull(mapper);
			
			log.info("\t+ mapper: " + mapper);
			
			Date now = mapper.getNow2();
			log.info("\t+ now: " + now);
			
		} // try-with-resources
	} // testGetNow2
	
	@Test
	public void testGetEmployees() {
		log.debug("testGetEmployees() invoked.");
		
		SqlSession sqlSession = this.factory.openSession();
		
		try (sqlSession) {
			
			// Lvalue(interface) 변수 = Rvalue(interface 구현객체)
			
			// <T> T getMapper(Class<T> type);
			Time2Mapper mapper = 
				sqlSession.getMapper(Time2Mapper.class);
			
			assertNotNull(mapper);
			
			log.info("\t+ mapper: " + mapper);
			
			List<EmployeesVO> emps = mapper.getEmployees(150, 4000.0);
			
			assert emps != null;
			emps.forEach(log::info);
			
		} // try-with-resources
	} // testGetEmployees
	
	
	//==================================================//
	// (3) SQL Mapper XML 방식 + MyBatis interface 방식의 결합 
	//==================================================//
	
	@Test
	public void testGetNow3() {
		log.debug("testGetNow3() invoked.");
		
		SqlSession sqlSession = this.factory.openSession();
		
		try (sqlSession) {
			
			TimeMapper mapper = sqlSession.getMapper(TimeMapper.class);
			log.info("\t+ mapper: " + mapper);
			
			assertNotNull(mapper);
			
			Date now = mapper.getNow3();
			log.info("\t+ now: " + now);
		} // try-with-resources
	} // testGetNow3
	
	
	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");
		
	} // tearDown

} // end class
