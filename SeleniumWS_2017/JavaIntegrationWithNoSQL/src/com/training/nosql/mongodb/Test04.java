package com.training.nosql.mongodb;

import java.net.UnknownHostException;
import java.util.Date;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

public class Test04 {

	public static void main(String[] args) throws UnknownHostException {
		
		Datastore datastore = new Morphia().createDatastore(new MongoClient("192.168.253.130",27017), "synergetics");

		//Add New Document
		Employee employee = new Employee(101,"Vikram Singh",new Date(),200000);
		employee.addSkill("Java");
		employee.addSkill("Hadoop");
		employee.addSkill("MongoDB");
		employee.addSkill("Cassandra");
		
		employee.setAddress(new Address("Gen A.K.V. Marg","Mumbai",400097));
		
		datastore.save(employee);
		System.out.println("Inserted...");

		//Read All Document
		Query<Employee> query = datastore.createQuery(Employee.class);
		//query.field("empName").equals("Vikram Singh");
				
		for (Employee employee2 : query.fetch()) {
			System.out.println(employee2);
		}
	}

}




