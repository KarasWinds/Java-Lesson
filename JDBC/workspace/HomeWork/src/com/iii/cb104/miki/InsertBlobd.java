package com.iii.cb104.miki;

import java.sql.*;
import java.io.*;

public class InsertBlobd {

	public static void main(String[] args) {
		Connection conn = null;
		String inFile = args[0];
		try {
			String connUrl = "jdbc:mariadb://localhost:3306/jdbc";
			conn = DriverManager.getConnection(connUrl, "root", "mysql");
			
			String qryStmt = "SELECT empno FROM employee";
			PreparedStatement pstmt = conn.prepareStatement(qryStmt);
			ResultSet rs = pstmt.executeQuery();
			
			String updateStmt = "UPDATE employee SET photo = ? WHERE empno = ?";
			pstmt = conn.prepareStatement(updateStmt);
			while(rs.next()) {
				int empno = rs.getInt(1);
				File f = new File(inFile + empno + ".jpg");
				FileInputStream fis = new FileInputStream(f);
				pstmt.setBinaryStream(1, fis, f.length());
				pstmt.setInt(2, empno);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
			System.out.println("Update blob is successful!");

			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
