package org.bitcamp.jdbc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Homework6 {
   
   static final String driver="oracle.jdbc.OracleDriver";
   static final String jdbcUrl = "jdbc:oracle:thin:@seoul";
   static final String user = "HR";
   static final String pass = "oracle";
         
   
   public static void main(String[] args) {
      String sql = "select d.department_name 부서이름, count(e.department_id) 사원수 "
      		+ "from employees e, departments d where e.department_id = d.department_id group by e.department_id, d.department_name having count(*) >= ? order by e.department_id desc";
      
      
      
      try {
         Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
         log.info("- conn: " + conn);
         
         PreparedStatement pstmt = conn.prepareStatement(sql);
         log.info("- pstmt: " + pstmt);
         pstmt.setInt(1, 5);
         
         
         ResultSet rs = pstmt.executeQuery();
         log.info("- rs: "+rs);

         try(conn; pstmt; rs;){
            
            
            
//        	 select d.department_name 부서이름, count(e.department_id) 사원수
//        	 from employees e, departments d
//        	 where e.department_id = d.department_id
//        	 group by e.department_id, d.department_name
//        	 having count(*) >= 5
//        	 order by e.department_id desc;

            while(rs.next()) {
            	String departmentName = rs.getString("부서이름");
            	int departmentID = rs.getInt("사원수");
      
               
               String print = String.format("%s,%s",  departmentName, departmentID);
               log.info(print);

            }//while
            
         }//try-with-resource
      } catch(SQLException e){ 
         e.printStackTrace();
         
      }//try-catch
      
   }//main
   
}//end class