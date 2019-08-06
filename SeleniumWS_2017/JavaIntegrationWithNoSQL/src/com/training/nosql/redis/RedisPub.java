package com.training.nosql.redis;

import java.util.Scanner;

import redis.clients.jedis.Jedis;

public class RedisPub {
    public static void main(String  args[]){
        Jedis jedis = new Jedis("192.168.1.82");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the channel name:");
        String channel=scanner.nextLine();
        System.out.println("Starting publisher for channel "+ channel);

        while (true){
            System.out.println("Enter the string to Publish:");
            String msg = scanner.nextLine();
            jedis.publish(channel,msg);

        }
    }
}
