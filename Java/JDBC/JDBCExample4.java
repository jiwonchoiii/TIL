package org.bitcamp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class JDBCExample4 {

	static final String DRIVER = "oracle.jdbc.OracleDriver";
	static final String JDBC_URL = "jdbc:oracle:thin:@seoul";
	static final String USER = "HR";
	static final String PASSWORD = "oracle";

	// try-with-resources 구문을 이용해서, 자동으로 자원객체를 반드시 닫아주도록 하자
	public static void main(String[] args) {



		String sql = "SELECT * FROM employees WHERE salary >= ? and COMMISSION_PCT is not null order by salary desc"; // Prepared

		try (/* JAVA 8 기준: 이 소괄호 안에서 자원객체를 생성해야 합니다. */
				Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(sql);

		) {
			log.info("- conn: " + conn);
			log.info("- ps: " + pstmt);

			pstmt.setDouble(1, 7000);

			try (ResultSet rs = pstmt.executeQuery();) {
				log.info("- rs: " + rs);

				while (rs.next()) {

					int employeeID = rs.getInt("EMPLOYEE_ID");
					String firstName = rs.getString("FIRST_NAME");
					String lastName = rs.getString("LAST_NAME");
					String email = rs.getString("EMAIL");
					String phoneNumber = rs.getString("PHONE_NUMBER");
					Timestamp hireDate = rs.getTimestamp("HIRE_DATE");
					String jobID = rs.getString("JOB_ID");
					int salary = rs.getInt("SALARY");
					int commissionPct = rs.getInt("COMMISSION_PCT");
					int managerID = rs.getInt("MANAGER_ID");
					int departmentID = rs.getInt("DEPARTMENT_ID");

					// ------------------------------------------//
					String employee = String.format("%s %s %s %s %s %s %s %s %s %s %s", employeeID, firstName, lastName,
							email, phoneNumber, hireDate, jobID, salary, commissionPct, managerID, departmentID);

					System.out.println(employee);

				} // while
			} // try-with-resources - 이 안에서는 try, catch, finally 블럭 모두 단독으로 존재할 수 있다. 
			

		} catch (SQLException e) {
			e.printStackTrace();

		} // try-catch
	} // main

} // end class
