package org.zerock.myapp.persistence;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations= {
   "file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class DataSourceTests implements InitializingBean, DisposableBean {

   @Setter(onMethod_= { @Autowired })      // 의존성 주입 시그널 장착
   private DataSource dataSource;         // javax.sql.DataSource (Interface 임)
   // DataSource타입의 객체를 주입해달라고 하면 이 인터페이스를 구현하는 클래스가 bean으로 등록되어있는지 찾고, 있으면 의존성 주입.
   // public class HikariDataSource extends HikariConfig implements DataSource, Closeable
   
   @Before
   public void setup() {
      log.debug("setup() invoked.");
      
      assertNotNull(this.dataSource);            // JUnit4 method
//      Objects.requireNonNull(this.dataSource);   // 자바표준 API
//      assert this.dataSource != null;            // 자바언어 문법 키워드
      
      log.info("\t+ dataSource: " + this.dataSource);
   } // setup
   
   
   @After
   public void tearDown() {
      log.debug("tearDown() invoked.");
      
      ((HikariDataSource) dataSource).close();   // 자원해제
   } // tearDown
   
   
   @Test
   public void testHikariCP() throws SQLException {
      log.debug("testHikariCP() invoked.");
      
      //--1. 데이터소스의 커넥션풀에서 하나의 커넥션을 빌려옴
      Connection conn = dataSource.getConnection();
      
      //--2. SQL문장 생성을 위한 객체를 Connection객체로부터 생성
      Statement stmt = conn.createStatement();
      
      //--3. 지정된 SQL문장을 수행하고, 그 결과셋을 반환받음
      ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
      
      // 오른쪽 -> 왼쪽으로 순서대로 자원객체 해제 by try-with-resource
      try(conn; stmt; rs;) {
         log.info("\t+ conn: " + conn);
         log.info("\t+ stmt: " + stmt);
         log.info("\t+ rs: " + rs);
         
               
         while(rs.next()) {
            String employee_id = rs.getString("EMPLOYEE_ID");
            String first_name = rs.getString("FIRST_NAME");
            String last_name = rs.getString("LAST_NAME");
            String email = rs.getString("EMAIL");
            String phone_number = rs.getString("PHONE_NUMBER");
            String hire_date = rs.getString("HIRE_DATE");
            String job_id = rs.getString("JOB_ID");
            String salary = rs.getString("SALARY");
            String commission_pct = rs.getString("COMMISSION_PCT");
            String department_id = rs.getString("DEPARTMENT_ID");
            
            String employee = String.format(
                  "%s, %s, %s, %s, %s, %s, %s, %s, %s, %s",
                  employee_id, first_name, last_name, email, phone_number,
                  hire_date, job_id, salary, commission_pct, department_id);
            
            log.info(employee);
         } // while
      } // try-with-resources
      
   }


	@Override
	public void destroy() throws Exception {
		log.debug("destroy() invoked.");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.debug("afterProperties() invoked.");

	} 

} // end class