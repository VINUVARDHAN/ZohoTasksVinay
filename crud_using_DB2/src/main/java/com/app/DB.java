package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

class StatementConnection {
	Statement st;
	Connection con;

	StatementConnection(Statement st, Connection con) {
		this.st = st;
		this.con = con;
	}
}

public class DB {

	private StatementConnection connection() {
		String url = "jdbc:mysql://localhost:3306/zoho";
		String userName = "root";
		String password = "kum@321&654_";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement st = con.createStatement();
			return new StatementConnection(st, con);
		} catch (Exception e) {
			System.out.println("error while connecting with database");
			return null;
		}
	}

	public LinkedList<DbStructure> getDataSet() {
		try {
			StatementConnection sc = connection();
			String sql = "SELECT * FROM LeadTable";
			ResultSet rs = sc.st.executeQuery(sql);
			LinkedList<DbStructure> dataSet = new LinkedList<DbStructure>();
			while (rs.next()) {
				dataSet.add(new DbStructure(rs.getString(1), rs.getString(2), rs.getString(3), Long.parseLong(rs.getString(4)), rs.getString(5)));
			}
			sc.con.close();
			return dataSet;
		} catch (Exception e) {
			System.out.println(e + "i am here in DB getData");
			return null;
		}
	}

	public boolean create(String name, String company, String source, long phoneno, String email) throws ClassNotFoundException, SQLException {
		StatementConnection sc = connection();
		String sql = "INSERT INTO LeadTable VALUES ('" + name + "','" + company + "','" + source + "'," + phoneno + ",'" + email + "')";
		try {
			sc.st.executeUpdate(sql);
			sc.con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e + "i am here in DB create");
			return false;
		}
	}

	public boolean remove(String name) {
		String sql = "DELETE FROM LeadTable WHERE LeadName='" + name + "'";
		StatementConnection sc = connection();
		try {
			sc.st.executeUpdate(sql);
			sc.con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e + "i am here in DB checkDataInDB");
			return false;
		}
	}

	public LinkedList<DbStructure> search(String pattern) {
		String sql = "SELECT * FROM LeadTable WHERE LeadName LIKE '" + pattern + "%' OR LeadCompany LIKE '" + pattern + "%' OR SourceOfLead LIKE '" + pattern + "%'";
		StatementConnection sc = connection();
		try {
			ResultSet rs = sc.st.executeQuery(sql);
			LinkedList<DbStructure> dataSet = new LinkedList<DbStructure>();
			while (rs.next()) {
				dataSet.add(new DbStructure(rs.getString(1), rs.getString(2), rs.getString(3), Long.parseLong(rs.getString(4)), rs.getString(5)));
			}
			sc.con.close();
			return dataSet;
		} catch (Exception e) {
			System.out.println(e + "i am here in DB search");
			return null;
		}
	}

	public boolean update(String oldName, String name, String company, String source, Long phoneno, String email) {
		StatementConnection sc = connection();
		String sql = "UPDATE LeadTable SET LeadName='" + name + "',LeadCompany='" + company + "',SourceOfLead='" + source + "',PhoneNo=" + phoneno + ",Email='" + email + "' WHERE LeadName='" + oldName + "'";
		try {
			sc.st.executeUpdate(sql);
			sc.con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e + " error in update");
			return false;
		}
	}

	public LinkedList<DbStructure> getResultByQuery(String sql) {
		StatementConnection sc = connection();
		try {
			ResultSet rs = sc.st.executeQuery(sql);
			LinkedList<DbStructure> dataSet = new LinkedList<DbStructure>();
			while (rs.next()) {
				dataSet.add(new DbStructure(rs.getString(1), rs.getString(2), rs.getString(3), Long.parseLong(rs.getString(4)), rs.getString(5)));
			}
			sc.con.close();
			return dataSet;
		} catch (Exception e) {
			System.out.println(e + "i am here in getResultByQuery");
			return null;
		}
	}

	public int getSizeOfDb() {
		DB db = new DB();
		LinkedList<DbStructure> totalData = db.getDataSet();
		return totalData.size();
	}
	
}
