package org.bitcamp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Homework4 {

   static final String driver = "oracle.jdbc.OracleDriver";
   static final String jdbcUrl = "jdbc:oracle:thin:@seoul";
   static final String user = "HR";
   static final String pass = "oracle";

   public static void main(String[] args) {
      String sql = "select first_name||' '||last_name as Name, salary, nvl2(commission_pct, 'Salary + Commission', 'Salary only') as 수당여부 from employees order by salary";

      try {
         Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
         log.info("- conn: " + conn);

         PreparedStatement pstmt = conn.prepareStatement(sql);
         log.info("- pstmt: " + pstmt);

         ResultSet rs = pstmt.executeQuery();
         log.info("- rs: " + rs);

         try (conn; pstmt; rs;) {

//            select first_name||' '||last_name as Name, salary, 
//            nvl2(commission_pct, 'Salary + Commission', 'Salary only') as 수당여부
//            from employees
//            order by salary;
            while (rs.next()) {
               String name = rs.getString("Name");
               double salary = rs.getInt("SALARY");
               String commissionPct = rs.getString("수당여부");
              
               String print = String.format("%s,%s, %s", name, salary, commissionPct);
               log.info(print);

            } // while

         } // try-with-resource
      } catch (SQLException e) {
         e.printStackTrace();

      } // try-catch

   }// main

}// end class