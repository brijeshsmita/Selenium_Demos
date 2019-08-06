package com.training.nosql.redis;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.Protocol;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("192.168.1.82");

		System.out.println("Connection to server sucessful");
		// check whether server is running or not
		// System.out.println("Server is running: " + jedis.ping());

		// For Creating Connection Pool - Note that we need commons-pool2.jar
		JedisPool jedisPool = new JedisPool(new JedisPoolConfig(),
				"192.168.1.82", 6379, Protocol.DEFAULT_TIMEOUT);// , "password"
																// is required
																// only in
																// protected
																// mode
		jedis = jedisPool.getResource();// getting connection from pool

		// In case of Spring we will write following in spring configuration
		// file
		/*
		 * <bean id="jedisPool" class="redis.clients.jedis.JedisPool">
		 * <constructor-arg index="0" ref="jedisPoolConfig" /> <constructor-arg
		 * index="1" value="192.168.8.100" /> <constructor-arg index="2"
		 * value="6379" /> <constructor-arg index="3"
		 * value="Protocol.DEFAULT_TIMEOUT" /> <constructor-arg index="4"
		 * value="password" /> </bean>
		 * 
		 * <bean id="jedisPoolConfig"
		 * class="redis.clients.jedis.JedisPoolConfig" > </bean>
		 */

		/* we can only get and set */
		// set the data in redis string
		jedis.set("tutorial-name", "Sia tutorial");
		// Get the stored data and print it
	/*	System.out.println("Stored string in redis:: "
				+ jedis.get("tutorial-name"));*/

		// store data in redis list ,lpush appends at bottom, rpush -goes to head
		jedis.lpush("tutorialSia1-list", "Redis");
		jedis.lpush("tutorialSia1-list", "Mongodb");
		jedis.lpush("tutorialSia1-list", "Mysql1");
		jedis.lpush("tutorialSia1-list", "Mysql2");
		jedis.lpush("tutorialSia1-list", "Mysql3");
		//to remove last element rpop
		// Get the stored data and print it
		List<String> list = jedis.lrange("tutorialSia1-list", 0, 6);//used for pagiation 
		for (String string : list) {
			System.out.println(string);
		}

		// Get the stored keys and print it
		/*Set<String> list1 = (Set<String>) jedis.keys("*");
		for (String string : list1) {
			System.out.println(string);
		}*/

		// jedis.shutdown();
	}

}
