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
public class JDBCExample2 {

	// JDBC driver name and database URL
//	 static final String DRIVER = "Oracle Driver's FQCN";
//	 static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DRIVER = "oracle.jdbc.OracleDriver";

	// (1)EZCONNECT
//	 static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521/seoul";
	// (2) TNS Alias
	static final String JDBC_URL = "jdbc:oracle:thin:@seoul";

	static final String USER = "HR";
	static final String PASSWORD = "oracle";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// Step.1 To load the specified JDBC Driver class
		Class.forName(DRIVER);

		// Step.2 To connect to the specified Oracle Instance.
		conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
		log.info("- conn: " + conn);

		// Step.3 To prepare SQL to execute.
//		stmt = conn.createStatement(); // Dynamic SQL
//		log.info("- stmt: " + stmt);

		// Step.4 To execute our SQL statement.
//		String sql = "SELECT * FROM employees";  // 컬럼이름은 자바의 변수 이름에 맞게 넣어준다.
		
		
		String sql = "SELECT * FROM employees WHERE salary >= ? and COMMISSION_PCT is not null order by salary desc"; // Prepared SQL
		// ? : bind variable. value값을 ?로 사용하는 변수
		
		pstmt = conn.prepareCall(sql); // prepared SQL
		pstmt.setDouble(1, 7000);    //각각의 bind variable의 매개변수 번호는 1부터 시작한다. 유일하게 1로 시작하는 index
		
		// stmt.execute(sql);
		//rs = pstmt.executeQuery(sql);  //Dynamic SQL 실행
		
		rs = pstmt.executeQuery();		
		log.info("- rs: " + rs);
		// resultSet은 단방향이다 - 재사용 못한다는 의미가 아니라, 되감아서 다시 처음 레코드 이전부터 얻을 수 있다.

		// Step.5 To extract all employees from result set.
		// JDBC에서 Result set은 모두 while 루프를 이용한다.
		while (rs.next()) {
			// 커서라는 포인터가 첫번째 이전의 행을 가리키고 있다. rs.next()를 호출하면 그다음 레코드가 있는지 확인한다.
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
			String employee = String.format("%s %s %s %s %s %s %s %s %s %s %s", employeeID, firstName, lastName, email,
					phoneNumber, hireDate, jobID, salary, commissionPct, managerID, departmentID);

			// int도 %s로 출력할 수 있다. 심지어 객체를 찍으면 참조변수가 나온다.

			//log.info(employee);
			

		} // while

		// --------------------------------//
		// JDBC에서는 아래의 3개 자원객체를 닫는 순서가 정해져 있음:
		// (1) ResultSet.close()
		// (2) Statement/PreparedStatement.close()
		// (3) Connection.close()
		// --------------------------------//

		// assert rs != null; //테스트에서는 assert를 사용하는 것이 좋다
		if (rs != null) { // 실무코드에서는 if사용
			rs.close();
		} // if

		if (pstmt != null)
			conn.close();

		assert pstmt != null;
		pstmt.close();

	} // main

} // end class
