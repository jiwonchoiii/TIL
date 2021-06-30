package org.bitcamp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Homework1 {

   static final String jdbcUrl = "jdbc:oracle:thin:@seoul";
   static final String user = "hr";
   static final String pass = "oracle";
   
   public static void main(String[] args) {
      String sql = "SELECT * FROM employees";   
      
      //가장 바깥쪽의 try-catch 구문에서는 자원객체를 생성하고
      try {
         Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
      
         PreparedStatement pstmt = conn.prepareStatement(sql);
         
         ResultSet rs = pstmt.executeQuery();
         
         //JAVA 11 기준 : 자원객체생성을 바깥에서 생성할 수 있게됨.
         //안쪽에서 try-with-resources 구문으로 자원객체를 자동으로 반드시 닫도록 보장해주자!
   
         try(conn; pstmt; rs;) {   //자원 객체를 담고 있는 참조변수는 오른쪽에서 왼쪽으로 닫힌다.
                           // => rs.close(); -> pstmt.close() -> conn.close(); 순으로 실행된다.
               
            
            
//            SELECT FIRST_NAME||' ' ||LAST_NAME AS NAME, 
//            JOB_ID AS JOB, 
//            SALARY, 
//            SALARY*12+100 AS "Increase Ann_Salary", 
//            (SALARY+100)*12 AS "Increase Salary" 
//            FROM EMPLOYEES;
            String columnName = String.format("%20s, %10s, %10s, %10s, %10s", "Name", "JobId", "Salary", "Increase Ann_Salary", "Increase Salary");
            log.info(columnName);
            
            while (rs.next()){   
               String firstName = rs.getString("FIRST_NAME");
               String lastName = rs.getString("LAST_NAME");
               String jobId = rs.getString("JOB_ID");
               double salary = rs.getDouble("SALARY");
         
               //---------------------------------------------------------
               
               String employee = String.format(
                     "%20s, %10s, %10s, %13s, %18s",
                      firstName + " " + lastName, jobId, salary, salary*12+100, (salary+100)*12); 
               
               log.info(employee);
            }//while
            
         }//try-with-resources
         
      }catch(SQLException e) {
         e.printStackTrace();
      }//try-with-resources-catch      
      
   }//main

}//end class