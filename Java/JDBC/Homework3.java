package org.bitcamp.jdbc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Homework3 {
   
   static final String driver="oracle.jdbc.OracleDriver";
   static final String jdbcUrl = "jdbc:oracle:thin:@seoul";
   static final String user = "HR";
   static final String pass = "oracle";
         
   
   public static void main(String[] args) {
      String sql = "select first_name||' '||last_name as Name, job_id, hire_date from employees "
            + "where hire_date between to_date(20060520,'yy/mm/dd') and to_date(20070520, 'yy/mm/dd') order by hire_date";
      
      
      
      try {
         Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
         log.info("- conn: " + conn);
         
         PreparedStatement pstmt = conn.prepareStatement(sql);
         log.info("- pstmt: " + pstmt);
         
         
         ResultSet rs = pstmt.executeQuery();
         log.info("- rs: "+rs);

         try(conn; pstmt; rs;){
            
            
            
//        select first_name||' '||last_name as Name, job_id, hire_date
//        from employees
//        where hire_date between to_date(20060520,'yy/mm/dd') and to_date(20070520, 'yy/mm/dd')
//        order by hire_date;
            while(rs.next()) {
               String name = rs.getString("name");
               String jobId = rs.getString("JOB_ID");
               Timestamp hireDate = rs.getTimestamp("HIRE_DATE");
               
               String print = String.format("%s,%s, %s", name, jobId, hireDate);
               log.info(print);

            }//while
            
         }//try-with-resource
      } catch(SQLException e){ 
         e.printStackTrace();
         
      }//try-catch
      
   }//main
   
}//end class