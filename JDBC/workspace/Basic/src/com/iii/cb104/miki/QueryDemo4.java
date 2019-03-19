package com.iii.cb104.miki;

import java.sql.*;

// Query all employees using Statement
// �ĥ�Class Loader�覡����Driver����A�õ��U��Driver Manager���X�ʵ{�����U���椤
public class QueryDemo4 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String connUrl = "jdbc:mariadb://localhost:3306/jdbc";
			conn = DriverManager.getConnection(connUrl, "root", "mysql");

			String qryStmt = "SELECT ename, salary FROM employee";
			PreparedStatement pstmt = conn.prepareStatement(qryStmt);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class QueryDemo1