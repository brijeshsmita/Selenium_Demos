package com.training.nosql.mongodb;

import java.util.Arrays;
import java.util.List;

import com.mongodb.AggregationOptions;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Test05 {

	public static void main(String[] args) {
		
		MongoClient mongoClient = new MongoClient("192.168.253.130", 27017);
		mongoClient.dropDatabase("synergetics");
		DB db = mongoClient.getDB("synergetics");
		
		DBCollection coll = db.getCollection("aggregationExample");
        coll.insert(new BasicDBObjectBuilder()
                .add("employee", 1)
                .add("department", "Sales")
                .add("amount", 71)
                .add("type", "airfare")
                .get());
        coll.insert(new BasicDBObjectBuilder()
                .add("employee", 2)
                .add("department", "Engineering")
                .add("amount", 15)
                .add("type", "airfare")
                .get());
        coll.insert(new BasicDBObjectBuilder()
                .add("employee", 4)
                .add("department", "Human Resources")
                .add("amount", 5)
                .add("type", "airfare")
                .get());
        coll.insert(new BasicDBObjectBuilder()
                .add("employee", 42)
                .add("department", "Sales")
                .add("amount", 77)
                .add("type", "airfare")
                .get());

        // create our pipeline operations, first with the $match
        DBObject match = new BasicDBObject("$match", new BasicDBObject("type", "airfare"));

        // build the $projection operation
        DBObject fields = new BasicDBObject("department", 1);
        fields.put("amount", 1);
        fields.put("_id", 0);
        DBObject project = new BasicDBObject("$project", fields );

        // Now the $group operation
        DBObject groupFields = new BasicDBObject( "_id", "$department");
        groupFields.put("average", new BasicDBObject( "$avg", "$amount"));
        DBObject group = new BasicDBObject("$group", groupFields);

        // Finally the $sort operation
        DBObject sort = new BasicDBObject("$sort", new BasicDBObject("average", -1));

        // run aggregation
        List<DBObject> pipeline = Arrays.asList(match, project, group, sort);
        AggregationOutput output = coll.aggregate(pipeline);

        // Output the results
        for (DBObject result : output.results()) {
            System.out.println(result);
        }

        // Aggregation Cursor
        AggregationOptions aggregationOptions = AggregationOptions.builder()
                .batchSize(100)
                .outputMode(AggregationOptions.OutputMode.CURSOR)
                .allowDiskUse(true)
                .build();

        Cursor cursor = coll.aggregate(pipeline, aggregationOptions);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        // clean up
        db.dropDatabase();
        mongoClient.close();

	}

}
