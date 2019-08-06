package com.training.nosql.mongodb;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class Test03 {
	public static void show(String s, DBCollection collection, BasicDBObject query) {
		System.out.println(s);
		DBCursor cursorDoc = collection.find(query);
		while (cursorDoc.hasNext()) {
			System.out.println(cursorDoc.next());
		}
	}

	public static void main(String[] args) throws UnknownHostException {
		MongoClient m = new MongoClient("192.168.253.130", 27017);
		m.dropDatabase("synergetics");
		DB db = m.getDB("synergetics");
		DBCollection collection = db.getCollection("cities");

		// Show Collection
		show("Initial", collection, null);

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "Satyendra Singh");
		map.put("gender", "male");
		map.put("company", "synergetics-india.com");
		map.put("age", 26);
	
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("Spring");
		skills.add("Hadoop");
		skills.add("MongoDB");
		skills.add("Cassandra");
		skills.add("Cloud Foundry");
		
		Map<String,String> address = new HashMap<>();
		address.put("city", "Mumbai");
		address.put("street", "Gen A.K.V Marg");
		address.put("pin-code", "400097");
		
		map.put("skills", skills);
		map.put("address", address);
		
		collection.insert(new BasicDBObject(map));
		show("Initial", collection, null);
		
		
	}

}
