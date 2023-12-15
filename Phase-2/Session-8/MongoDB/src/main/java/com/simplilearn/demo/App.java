package com.simplilearn.demo;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
 

 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try {
			MongoClient mongo= new MongoClient("127.0.0.1",27017);
			DB db= mongo.getDB("mydb");
			if(db!=null) {
				System.out.println("Connections Established");
				
				DBCollection collection=db.getCollection("student");
				
				System.out.println("Full Name: "+collection.getFullName());
				System.out.println("Collection Name: "+collection.getName());
				
			}else{
				System.out.println("Error While Connecting");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		 
        
    }
}
