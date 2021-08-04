/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author  Futures Programmers ESPE-DCC0
 */
public class StudentInformationController {
    MongoClient mongoClient;
	MongoDatabase db;
	MongoCollection<Document> table;
	Document doc;
	private String db_name = "students_database";
	private String db_table;
        
public StudentInformationController(String db_table) {
		this.db_table = db_table;
		init_database();
		
	}
	
        
        	

        
	
}
