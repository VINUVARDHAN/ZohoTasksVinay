package com.learn.web;

import java.util.HashMap;

public class Data {
	static public HashMap<String, Lead> values = new HashMap<String, Lead>() {
		{
			put("Vinay", new Lead("Zoho", "vinay@mail.com","bangalore","Telemarketing"));
			put("Kumar", new Lead("Amazon", "kumar@mail.com","chennai","Advertisement"));
			put("Manja", new Lead("Wipro", "manja@mail.com","tamil nadu","Advertisement"));
			put("Vardhan", new Lead("Brand", "vardhan@mail.com","mandya","Direct mail"));
			put("Vinu", new Lead("Metro", "vinu@mail.com","maduri","Trade Show"));
		}
	};

	static public HashMap<String, Lead> updatedContent(String name ,Lead lead) {
		values.put(name, lead);
		return values;
	}
	static public HashMap<String, Lead> defaultContent() {
		return values;
	}
}
