package org.zerock.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor

public class SqlSessionFactoryBuilderTests {
	
	private SqlSessionFactoryBuilder builder;
	private SqlSessionFactory factory;
	private String mybatisConfigXml = "mybatis-config.xml";

	@Before
	public void setUp() throws IOException {
		log.debug("setUp() invoked.");
		
		// 0. mybatis-config.xml 파일에 대한, 바이트 기반의 InputStream 객체 생성
		InputStream is = Resources.getResourceAsStream(mybatisConfigXml);
		
		
		// 1. SqlSessionFactoryBuilder 생성
		this.builder = new SqlSessionFactoryBuilder();
		
		log.info("\t + builder: " + builder);
		
		// 2. SqlSessionFactory 생성
		this.factory = this.builder.build(is);
		
		log.info("\t + factory: " + factory);
	} // setUp

	@Test
	public void testxxx() {
		log.debug("testxxx() invoked.");
		
		
		// 3. SqlSession 생성
		
		// AutoClosable한 자원객체
		SqlSession sqlSession = this.factory.openSession();
		
		log.info("\t + sqlSession: " + sqlSession);
		
		try(sqlSession){
			Connection conn = sqlSession.getConnection();
			log.info("\t + conn: " + conn);
			
			String now = sqlSession.selectOne("SELECT sysdate FROM dual");
			log.info("\t now: " + now);
			
		} // try-with-resources

	} // testxxx

	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");

	} // tearDown
} // end class
