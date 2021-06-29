package org.bitcamp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class JDBCExample5 {

	public static void main(String[] args) {

		String sql = "SELECT * FROM employees WHERE salary > ? and commission_pct is not null ORDER BY salary DESC";

		try {
			Connection conn = DriverManager.getConnection(sql);

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, 3000);

			ResultSet rs = pstmt.executeQuery();

			// 자바 11기준 : 자원객체를 저장하는 참조변수를 try-with-resources 블록 바깥에서 선언하는 것을 허용
			// 안쪽에 try-with-resource 구문으로, 자원객체를 자동으로 반드시 닫도록 보장해주자
			try (conn; pstmt; rs;) { // 순서에 맞게 닫는다! 소괄호의 오른쪽에서 왼쪽 방향 순으로 닫힌다.

				while (rs.next()) {
					int employeeId = rs.getInt("EMPLOYEE_ID");
					String firstName = rs.getString("FIRST_NAME");
					String lastName = rs.getString("LAST_NAME");
					String email = rs.getString("EMAIL");
					String phoneNumber = rs.getString("PHONE_NUMBER");
					Timestamp hireDate = rs.getTimestamp("HIRE_DATE");
					String jobId = rs.getString("JOB_ID");
					double salary = rs.getDouble("SALARY");
					double commissionPct = rs.getDouble("COMMISSION_PCT");
					int managerId = rs.getInt("MANAGER_ID");
					int departmentId = rs.getInt("DEPARTMENT_ID");

					// ---------------------------------------------------------

					String employee = String.format("%5s %10s %8s %10s %10s %15s %10s %8s %2s %6s %4s", employeeId,
							firstName, lastName, email, phoneNumber, hireDate, jobId, salary, commissionPct, managerId,
							departmentId);

					log.info(employee);
				} // while

			} // try-with-resources
		} catch (SQLException e) {
			e.printStackTrace();
		} // try-catch

	} // main

} // end class
