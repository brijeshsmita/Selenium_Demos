package com.training.nosql.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;

public class Test01 {
	private Cluster cluster;
	public void connect(String node) {
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
	public static void main(String[] args) {
		Test01 client = new Test01();
		client.connect("192.168.253.131");
		
		
		
		client.close();
	}
}