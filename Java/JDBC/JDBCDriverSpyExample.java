package org.bitcamp.jdbc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class JDBCDriverSpyExample {
   
	// static final String log4jdbc = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
	// static final String driver="oracle.jdbc.OracleDriver";
	// static final String jdbcUrl = "jdbc:oracle:thin:@seoul";
	//static final String jdbcUrl = "jdbc:log4jdbc:oracle:thin:@seoul"; // For log4jdbc
	//static final String jdbcUrl = "jdbc:log4jdbc:oracle:thin:@localhost:1521/seoul"; // For log4jdbc
	static final String jdbcUrl = "jdbc:log4jdbc:oracle:thin:@localhost:1521/seoul?TNS_ADMIN=D:/u01/oracle/product/19.3.0/dbhome/network/admin"; // For log4jdbc
	
	static final String user = "HR";
	static final String pass = "oracle";
   
   public static void main(String[] args) {
      String sql = "SELECT FIRST_NAME||' '||LAST_NAME as name,SALARY FROM EMPLOYEES "
            + "WHERE SALARY NOT BETWEEN ? AND ? ORDER BY SALARY ASC";
      
      
      
      try {
         Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
         log.info("- conn: " + conn);
         
         PreparedStatement pstmt = conn.prepareStatement(sql);
         log.info("- pstmt: " + pstmt);
         pstmt.setInt(1, 7000);
         pstmt.setInt(2, 10000);
         
         
         ResultSet rs = pstmt.executeQuery();
         log.info("- rs: "+rs);

         try(conn; pstmt; rs;){
            
//            SELECT first_name||' '||last_name as Name, salary
//            FROM employees
//            WHERE salary NOT BETWEEN 7000 AND 10000
//            ORDER BY salary;            
            while(rs.next()) {
               String name = rs.getString("name");
               double salary = rs.getInt("SALARY");
               
               
               String print = String.format("%s,%s", name,salary);
               log.info(print);

            }//while
            
         }//try-with-resource
      } catch(SQLException e){ 
         e.printStackTrace();
         
      }//try-catch
      
   }//main
   
}//end class