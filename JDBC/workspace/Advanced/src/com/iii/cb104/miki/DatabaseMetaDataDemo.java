package com.iii.cb104.miki;

import java.sql.*;

public class DatabaseMetaDataDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			String connUrl = "jdbc:mariadb://localhost:3306/jdbc";
			conn = DriverManager.getConnection(connUrl, "root", "mysql");
			
			DatabaseMetaData dbmd = conn.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDriverName());
			ResultSet rs = dbmd.getTableTypes();
			
			while(rs.next())
				System.out.print(rs.getString("TABLE_TYPE") + ", ");
			System.out.print("\n");
			
			rs = dbmd.getPrimaryKeys(null, null, "EMPLOYEE");
			while(rs.next()) {
				System.out.print(rs.getString("TABLE_NAME") + ", ");
				System.out.print(rs.getString("COLUMN_NAME") + ", ");
				System.out.print(rs.getString("KEY_SEQ"));
			}
			rs.close();
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
}// end of class DatabaseMetaDataDemo 
