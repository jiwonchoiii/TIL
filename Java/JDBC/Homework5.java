package org.bitcamp.jdbc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Homework5 {
   
   static final String driver="oracle.jdbc.OracleDriver";
   static final String jdbcUrl = "jdbc:oracle:thin:@seoul";
   static final String user = "HR";
   static final String pass = "oracle";
         
   
   public static void main(String[] args) {
      String sql = "select 'Han-bit' as 회사이름, first_name||' '||last_name as name, e.job_id 업무, d.department_name 부서이름, l.city 도시이름 from employees e, departments d, locations l where e.department_id = d.department_id and d.location_id = l.location_id and l.city = 'Oxford'";
      
      
      
      try {
         Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
         log.info("- conn: " + conn);
         
         PreparedStatement pstmt = conn.prepareStatement(sql);
         log.info("- pstmt: " + pstmt);
     //    pstmt.setString(1, "Oxford");
         
         
         ResultSet rs = pstmt.executeQuery();
         log.info("- rs: "+rs);

         try(conn; pstmt; rs;){
            
                    
			//	select 'Han-bit' as 회사이름, first_name||' '||last_name as name, e.job_id 업무, d.department_name 부서이름, l.city 도시이름
			//	from employees e, departments d, locations l
			//	where e.department_id = d.department_id
			//	and d.location_id = l.location_id
			//	and l.city = 'Oxford';
        	 
            while(rs.next()) {
               String hanBit = rs.getString("회사이름");
               String name = rs.getString("name");
               String jobId = rs.getString("업무");
               String departmentName = rs.getString("부서이름");
               String city = rs.getString("도시이름");
               
               String print = String.format("%s,%s, %s, %s, %s", hanBit, name, jobId, departmentName, city);
               log.info(print);

            }//while
            
         }//try-with-resource
      } catch(SQLException e){ 
         e.printStackTrace();
         
      }//try-catch
      
   }//main
   
}//end class