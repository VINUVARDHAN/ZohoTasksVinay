package com.app;
/*
 * Data model of the CRUD project
 */
public class DbStructure {
	private String name;
	private String company;
	private String email;
	private String source;
	private long phoneno;

	
	DbStructure(String name, String company, String source, long phoneno, String email) {
		this.name = name;
		this.company = company;
		this.source = source;
		this.phoneno = phoneno;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getEmail() {
		return email;
	}

	public String getSource() {
		return source;
	}

	public long getPhoneno() {
		return phoneno;
	}

}
