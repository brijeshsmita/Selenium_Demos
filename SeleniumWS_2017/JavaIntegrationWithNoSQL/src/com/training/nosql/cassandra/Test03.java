package com.training.nosql.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class Test03 {

	private final static String insertCql = "INSERT INTO movies (title, year, description, mmpa_rating, dustin_rating) "
			+ "VALUES (?, ?, ?, ?, ?)";

	public static void main(String[] args) {
		Test03 client = new Test03();
		client.connect("192.168.253.131");

		Session session = client.getSession();

		session.execute("use bookmyshow");
		System.out.println("using keyspace");

		session.execute(insertCql, "Baby", 2014,
				"A RAW officer on a mission to kill India's most wanted terrorist Hafiz Saeed", "9.1", "8.9");
		System.out.println("Inserted...");
		
		session.close();
		client.close();
	}

	public Session getSession() {
		return cluster.connect();
	}

	private Cluster cluster;

	public void connect(String node) {
		// cluster =
		// Cluster.builder().addContactPoint(node).withPort(port).build();
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