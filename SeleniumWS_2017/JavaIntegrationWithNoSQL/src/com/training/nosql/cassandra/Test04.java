package com.training.nosql.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class Test04 {
	private final static String insertCql = "INSERT INTO movies (title, year, description, mmpa_rating, dustin_rating) "
			+ "VALUES (?, ?, ?, ?, ?)";
	public static void main(String[] args) {
		
		Test04 client = new Test04();
		client.connect("192.168.253.131");

		Session session = client.getSession();
    
		session.execute("use bookmyshow");
		System.out.println("using keyspace");

		session.execute(insertCql, "Baby", 2015,
				"A RAW officer on a mission to kill India's most wanted terrorist Hafiz Saeed", "9.1", "8.9");
		session.execute(insertCql, "Gabbar", 2014,
				"A common man on a mission to eliminate bad people from from India", "9.5", "8.8");
		session.execute(insertCql, "Sholay", 1971,
				"A Dacauit kills and exploit people in a village. A Police officer hires 2 prisoners to kill this dacauit", "9.0", "9.1");
		session.execute(insertCql, "Thartharaat", 1995,
				"A Comedy movie from mahesh kothare starring, Laxmikant Berde in double role.", "8.8", "8.7");
		session.execute(insertCql, "Sairat", 2016,
				"A Love Story with a tragic end on honour killing", "9.2", "8.6");
		session.execute(insertCql, "Yellow", 2015,
				"A journey of a person to enter into a paralympic olympiad", "9.8", "9.0");
		
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
