//$Id$
package com.app;

import java.sql.*;
import java.util.LinkedList;

public class DBManagement {
	private String url = "jdbc:mysql://localhost:3306/zoho";
	private String userName = "root";
	private String password = "kum@321&654_";
	
	/*
	 * Connect with DB and return that connections
	 */
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			return con;
		} catch (Exception e) {
			System.out.println("error while connecting with database");
			return null;
		}
	}
	
	/*
	 * Return the subset of data by taking start and end point
	 */
	public LinkedList<DbStructure> getRangeOfData(int start, int range) {
		try {
			Connection myCon = getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("SELECT * FROM LeadTable limit ?,?");
			myStmt.setInt(1, start);
			myStmt.setInt(2, range);
			ResultSet rs = myStmt.executeQuery();
			LinkedList<DbStructure> data = new LinkedList<DbStructure>();
			while (rs.next()) {
				data.add(new DbStructure(rs.getString(1), rs.getString(2), rs.getString(3), Long.parseLong(rs.getString(4)), rs.getString(5)));
			}
			myCon.close();
			return data;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/*
	 * Return the size of data
	 */
	public int getDBSize()
	{
		try {
			Connection myCon = getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("SELECT * FROM LeadTable");
			ResultSet rs = myStmt.executeQuery();
			LinkedList<DbStructure> data = new LinkedList<DbStructure>();
			while (rs.next()) {
				data.add(new DbStructure(rs.getString(1), rs.getString(2), rs.getString(3), Long.parseLong(rs.getString(4)), rs.getString(5)));
			}
			myCon.close();
			return data.size();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	/*
	 * Search the DB with some pattern
	 */
	public LinkedList<DbStructure> search(String pattern) {
		String sql = "SELECT * FROM LeadTable WHERE LeadName LIKE '" + pattern + "%' OR LeadCompany LIKE '" + pattern + "%' OR SourceOfLead LIKE '" + pattern + "%'";
		try {
			Connection myCon = getConnection();
			Statement st = myCon.createStatement();
			ResultSet rs = st.executeQuery(sql);
			LinkedList<DbStructure> dataSet = new LinkedList<DbStructure>();
			while (rs.next()) {
				dataSet.add(new DbStructure(rs.getString(1), rs.getString(2), rs.getString(3), Long.parseLong(rs.getString(4)), rs.getString(5)));
			}
			myCon.close();
			return dataSet;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
