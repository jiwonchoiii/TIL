package org.bitcamp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import lombok.extern.log4j.Log4j2;

@Log4j2
//prepared statement
public class JDBCExample3 {

	static final String DRIVER = "oracle.jdbc.OracleDriver";
	static final String JDBC_URL = "jdbc:oracle:thin:@seoul";
	static final String USER = "HR";
	static final String PASSWORD = "oracle";

	public static void main(String[] args) {

		// JDBC 인터페이스는 모두 AutoCloseable 인터페이스를 extends하고 있다.
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// JDBC spec 4.0이상부터는, 명시적으로 JDBC Driver class를 로딩하지 않아도 된다.
		// Class.forName(DRIVER);

		try {
			conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
			log.info("- conn: " + conn);

			String sql = "SELECT * FROM employees WHERE salary >= ? and COMMISSION_PCT is not null order by salary desc"; // Prepared
																															// SQL

			pstmt = conn.prepareCall(sql);
			log.info("- ps: "+ pstmt);
			pstmt.setDouble(1, 7000); // 각각의 bind variable의 매개변수 번호는 1부터 시작한다. 유일하게 1로 시작하는 index

			rs = pstmt.executeQuery();
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

		} catch (SQLException e) {
			e.printStackTrace();

		} finally { // 자원(객체)를 생성했다면 해제(close)한다.
			//자원 객체 해제코드가 너무 길고 중복된다..-> try-with-resource 이용

			try {
				if (rs != null) {
					rs.close();
				}// if
			} catch (SQLException e) {;;} // try-catch

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {;;} // try-catch

			try {
				if (pstmt != null) {
					conn.close();
				}
			} catch (SQLException e) {;;} // try-catch

		} // try-finally
	} // main

} // end class
