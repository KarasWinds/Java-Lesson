package com.iii.cb104.miki;

import java.sql.*;

// Update employee data
public class UpdateDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:mariadb://localhost:3306/jdbc";
			conn = DriverManager.getConnection(connUrl, "root", "mysql");
			
			String updStmt = "UPDATE employee SET salary=? WHERE empno=?";
			PreparedStatement pstmt = conn.prepareStatement(updStmt);
			pstmt.setDouble(1, 58000);
			pstmt.setInt(2, 1009);
			int num = pstmt.executeUpdate();
			System.out.println("update count = " + num);
			
			String qryStmt = "SELECT * FROM employee WHERE empno=?";
			pstmt = conn.prepareStatement(qryStmt);
			pstmt.setInt(1, 1009);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("name = " + rs.getString("ename") + ", ");
				System.out.println("salary = " + rs.getDouble("salary"));
			}
			rs.close();
			pstmt.close();
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
}// end of class UpdateDemo
