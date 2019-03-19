package com.iii.cb104.miki;

import java.io.*;
import java.sql.*;
import java.util.*;

public class BatchUpdates {

	public static void main(String[] args) {
		File file = new File(args[0]);
		List<String[]> empin = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String str;
			while ((str = in.readLine()) != null) {
				StringBuffer sb = new StringBuffer(256);
				sb.append(str);
				String[] emptemp = sb.toString().split(",");
				empin.add(emptemp);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Connection conn = null;
		try {
			String connUrl = "jdbc:mariadb://localhost:3306/jdbc";
			conn = DriverManager.getConnection(connUrl, "root", "mysql");

			String qryStmt = "SELECT max(empno) FROM employee";
			PreparedStatement pstmt = conn.prepareStatement(qryStmt);
			ResultSet rs = pstmt.executeQuery();
			int empno = (rs.first())? rs.getInt(1) : 0;
			
			String insStmt = "INSERT INTO employee VALUES (?, ?, curdate(), ?, ?, ?)";
			pstmt = conn.prepareStatement(insStmt);
			Iterator<String[]> objs = empin.iterator();
			while (objs.hasNext()) {
				empno += 1;
				String[] emp = objs.next();
				pstmt.setInt(1, empno);
				pstmt.setString(2, emp[0]);
				pstmt.setDouble(3, Double.parseDouble(emp[2]));
				pstmt.setInt(4, Integer.parseInt(emp[3]));
				pstmt.setString(5, emp[4]);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
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

	}

}
