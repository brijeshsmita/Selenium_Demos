package com.training.nosql.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class Test02 {
	final static String createKeyspaceCql = "CREATE keyspace bookmyshow"
			+ " with replication = {'class':'SimpleStrategy','replication_factor':1}";
	
	final static String createMovieCql = "CREATE TABLE movies ("
			+ "title varchar, "
			+ "year int, "
			+ "description varchar, "
			+ "mmpa_rating varchar, "
			+ "dustin_rating varchar, "
			+ "PRIMARY KEY (title, year))";
	
	public static void main(String[] args) {
		Test02 client = new Test02();
		client.connect("192.168.253.131");
		
		Session session = client.getSession();
		
		session.execute(createKeyspaceCql);
		System.out.println("Keyspace created...");
		
		session.execute("use bookmyshow");
		System.out.println("using keyspace");
		
		session.execute(createMovieCql);
		System.out.println("movies table created...");
		
		
		session.close();
		client.close();
	}
	public Session getSession(){
		return cluster.connect();
	}
	
	private Cluster cluster;
	public void connect(String node) {
		//cluster = Cluster.builder().addContactPoint(node).withPort(port).build();
		cluster = Cluster.builder().addContactPoint(node).build();
		
		Metadata metadata = cluster.getMetadata();
		System.out.printf("Connected to cluster: ", metadata.getClusterName());
		for (Host host : metadata.getAllHosts()) {
			System.out.printf("Datacenter: %s; Host: %s; Rack: %s\n", host.getDatacenter(), host.getAddress(),
					host.getRack());
		}
	}
	public void close() {
		cluster.close();
	}
}