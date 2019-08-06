package com.training.nosql.mongodb;

import java.net.UnknownHostException;

import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class Test02 {

	public static void main(String[] args) throws UnknownHostException {

		MongoClient m = new MongoClient("localhost", 27017);
		m.dropDatabase("synergetics");
		DB db = m.getDB("synergetics");
		DBCollection collection = db.getCollection("cities");

		// Show Collection
		show("Initial", collection, null);

		// Insert a document
		String json = "{'_id' : '553906942236c367ad171717', 'age' : 31.0,'eyeColor' : 'brown', 'name' : 'Dimitris Ganosis', 'gender' : 'male', 'company' : 'app-genesis.com', 'email': 'dg@gmail.com', "
				+ "'phone':'1 (961) 562-3607', 'address' : '273 Nautilus Avenue, Cazadero, Wisconsin, 514' , 'latitude' : 54.592598 , 'longitude' : -62.444972}";

		BasicDBObject newDoc = (BasicDBObject) JSON.parse(json);
		collection.insert(newDoc);
		show("After inserting", collection, null);

		// Find a document
		BasicDBObject findName = new BasicDBObject();
		findName.put("name", "Adrienne Boyle");
		show("Adrienne Boyle", collection, findName);

		// Update a document
		collection.update((BasicDBObject) JSON.parse("{ 'name' : 'Dimitris Ganosis'}"),
				(BasicDBObject) JSON.parse("{ '$set' : { 'age': 28}}"));
		show("After updating", collection, null);

		// Remove a document
		collection.remove(new BasicDBObject().append("name", "Dimitris Ganosis"));
		show("After deleting", collection, null);

		// Aggregation(project, match, sort)
		DBObject project = new BasicDBObject("$project",
				new BasicDBObject("_id", 0).append("age", 1).append("eyeColor", 1).append("name", 1).append("gender", 1)
						.append("company", 1).append("email", 1).append("phone", 1).append("address", 1)
						.append("latitude", 1).append("longitude", 1));

		DBObject match = new BasicDBObject("$match", new BasicDBObject("eyeColor", "brown"));
		DBObject sort = new BasicDBObject("$sort", new BasicDBObject("age", 1));

		AggregationOutput output = collection.aggregate(match, sort, project);
		System.out.println("After matching the eyeColor and sorting on age, suppress the _id ");
		for (DBObject result : output.results()) {
			System.out.println(result);
		}

		// group by gender and get the avg age
		DBObject groupFields = new BasicDBObject("_id", "$gender");
		groupFields.put("average", new BasicDBObject("$avg", "$age"));
		DBObject group = new BasicDBObject("$group", groupFields);

		AggregationOutput output2 = collection.aggregate(group);
		System.out.println("The average age of genders. ");
		for (DBObject result : output2.results()) {
			System.out.println(result);
		}
	}

	public static void show(String s, DBCollection collection, BasicDBObject query) {
		System.out.println(s);
		DBCursor cursorDoc = collection.find(query);
		while (cursorDoc.hasNext()) {
			System.out.println(cursorDoc.next());
		}
	}
}


