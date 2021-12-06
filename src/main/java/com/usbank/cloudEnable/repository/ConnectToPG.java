package com.usbank.cloudEnable.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConnectToPG {
	@Autowired
	private DataSource connection;

	public String getAllCatalogeName() {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
//		try {
////			con = connection.getConnection();
////			stmt = con.createStatement();
////			rs = stmt.executeQuery("select carId as carId from USBCloud.USBCloudServices");
//		//	rs = stmt.executeQuery("select carId as carId from public.application");
////			while (rs.next()) {
////				System.out.println("carId=" + rs.getString("carId"));
////			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (stmt != null)
//					stmt.close();
//				if (con != null)
//					con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return null;
	}
}
