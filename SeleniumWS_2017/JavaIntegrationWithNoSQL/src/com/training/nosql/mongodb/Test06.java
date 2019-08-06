package com.training.nosql.mongodb;

import java.util.Arrays;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public class Test06 {

	public static void main(String[] args) {
	
		MongoCredential credential = MongoCredential.createCredential("satyen", "synergetics", "satyen123".toCharArray());
		MongoClient mongoClient = new MongoClient(new ServerAddress("192.168.253.131",27017), Arrays.asList(credential));
		
		DB db = mongoClient.getDB("synergetics");

		System.out.println("Count: " + db.getCollection("synergetics").count());
		
		System.out.println("User Validated...");

		mongoClient.close();
	}

}
