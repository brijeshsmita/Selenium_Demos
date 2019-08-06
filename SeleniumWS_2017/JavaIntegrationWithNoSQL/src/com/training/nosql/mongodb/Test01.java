package com.training.nosql.mongodb;

import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class Test01 {

	public static void main(String[] args) {
		
		MongoClient mongoClient  = new MongoClient("192.168.253.130",27017);//Connect
		
		mongoClient.dropDatabase("synergetics");//drop existing db
		
		DB db = mongoClient.getDB("synergetics");//get/create Database
		
		DBCollection dbCollection = db.getCollection("employees");//get/create collection
		
		//Save an object
		BasicDBObject basicDBObject = new BasicDBObject();//demo object
		basicDBObject.put("name", "Satyendra Singh");//populate demo object 
		basicDBObject.put("age", "26");//populate demo object 
		basicDBObject.put("createdDate", new Date());//populate demo object 
		
		dbCollection.save(basicDBObject);//save demo object in collection
		
		System.out.println("Inserted...");
		
		//Read all objects
		System.out.println("\n***********All Employees***************\n");
		long count = dbCollection.getCount();
		System.out.println("Total : "+count);
		DBCursor dbCursor = dbCollection.find();
		while(dbCursor.hasNext()){
			System.out.println(dbCursor.next());
		}
		
		/**** Update ****/
		System.out.println("\n***********Updating Employee***************\n");
		// search document where name="Satyendra Singh" and update it with new values
		BasicDBObject oldDocument = new BasicDBObject();
		oldDocument.put("name", "Satyendra Singh");

		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("name", "Satyendra Singh Gaur");

		//To change a field in a document, MongoDB provides update operators, such as $set 
		//to modify values.
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);

		dbCollection.update(oldDocument, updateObj);
		
		//Read all objects
		System.out.println("\n***********All Employees***************\n");
		count = dbCollection.getCount();
		System.out.println("Total : "+count);
		dbCursor = dbCollection.find();
		while(dbCursor.hasNext()){
			System.out.println(dbCursor.next());
		}
		
		//Delete an object
		System.out.println("\n***********Deleting an object***************\n");
		// search document where name="Satyendra Singh" and delete it.
		BasicDBObject documentToDelete = new BasicDBObject();
		documentToDelete.put("name", "Satyendra Singh Gaur");

		dbCollection.remove(documentToDelete);
		
		System.out.println("Deleted...");
		
		//Read all objects
		System.out.println("\n***********All Employees***************\n");
		count = dbCollection.getCount();
		System.out.println("Total : "+count);
		dbCursor = dbCollection.find();
		while(dbCursor.hasNext()){
			System.out.println(dbCursor.next());
		}

	}

}
