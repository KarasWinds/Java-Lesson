package com.iii.cb104.miki;

import java.sql.*;

// Query selected employees
public class QueryDemo5 {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:mariadb://localhost:3306/jdbc";
			conn = DriverManager.getConnection(connUrl, "root", "mysql");			
		/*		
			String empno = "1001";
			String qryStmt = "SELECT * FROM employee WHERE empno=" + empno;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(qryStmt);
			
			String empno = "1001";
			String qryStmt = "SELECT * FROM employee WHERE empno=" + empno;
			PreparedStatement stmt = conn.prepareStatement(qryStmt);
			ResultSet rs = stmt.executeQuery();
			
			String empno = "1001";
			String qryStmt = "SELECT * FROM employee WHERE empno=?";
			PreparedStatement stmt = conn.prepareStatement(qryStmt);
			stmt.setString(1, empno);
			ResultSet rs = stmt.executeQuery();
		*/	
		 	String qryStmt = "SELECT * FROM employee WHERE deptno=? and title=?";
			PreparedStatement stmt = conn.prepareStatement(qryStmt);
			stmt.setString(1, "100");
			stmt.setString(2, "engineer");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("name = " + rs.getString("ename"));
				System.out.println("salary = " + rs.getDouble("salary"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch(SQLException e) { 
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class QueryDemo5
