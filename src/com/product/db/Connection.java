/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.product.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author karel
 */
public class Connection {
    public static MongoDatabase konekMongoDB(){
        try {
            MongoClient client = MongoClients.create();
            MongoDatabase database = client.getDatabase("practice");
            System.out.println("Connection Success");
            return database;
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        
        return null;
    }
}
