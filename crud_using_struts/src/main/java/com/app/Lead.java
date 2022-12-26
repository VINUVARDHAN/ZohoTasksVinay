//$Id$
package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Lead{
	private String leadName = "";
	private String company = "";
	private String source = "";
	private long phoneNo = 0;
	private String email = "";
	private String oldName = "";
	private String message = "none";
	private int start;
	private int range;
	private String action;

	public int getStart() {
		return start;
	}

	public int getRange() {
		return range;
	}

	public String getAction() {
		return action;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String range() {
		return "success";
	}

	public String getOldName() {
		return oldName;
	}

	public String getLeadName() {
		return leadName;
	}

	public String getCompany() {
		return company;
	}

	public String getSource() {
		return source;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String addLead() {
		DBManagement db = new DBManagement();
		try {
			Connection myCon = db.getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("INSERT INTO LeadTable VALUES (?,?,?,?,?)");
			myStmt.setString(1, getLeadName());
			myStmt.setString(2, getCompany());
			myStmt.setString(3, getSource());
			myStmt.setLong(4, getPhoneNo());
			myStmt.setString(5, getEmail());
			myStmt.executeUpdate();
			myCon.close();
			return "success";

		} catch (Exception e) {
			System.out.println(e);
			return "error";
		}
	}

	public String updateLead() {
		DBManagement db = new DBManagement();
		try {
			Connection myCon = db.getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("UPDATE LeadTable SET LeadName=?,LeadCompany=?,SourceOfLead=?,PhoneNo=?,Email=?  WHERE LeadName=?");
			myStmt.setString(1, getLeadName());
			myStmt.setString(2, getCompany());
			myStmt.setString(3, getSource());
			myStmt.setLong(4, getPhoneNo());
			myStmt.setString(5, getEmail());
			myStmt.setString(6, getOldName());
			myStmt.executeUpdate();
			myCon.close();
			return "success";

		} catch (Exception e) {
			System.out.println(e);
			return "error";
		}
	}

	public String deleteLead() {
		DBManagement db = new DBManagement();
		try {
			Connection myCon = db.getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("DELETE FROM LeadTable WHERE LeadName=?");
			myStmt.setString(1, getLeadName());
			myStmt.executeUpdate();
			myCon.close();
			return "success";

		} catch (Exception e) {
			System.out.println(e);
			return "error";
		}
	}
}
