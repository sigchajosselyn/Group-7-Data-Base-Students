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

public void init_database() {
		mongoClient = new MongoClient( "localhost" , 27017 );  
		db = mongoClient.getDatabase(this.db_name);  
		table = db.getCollection(this.db_table);  
	}

public boolean insert_student(Student new_student) {
		boolean result = false;
		try {
			doc = new Document("ci", new_student.getCi());  
			doc.append("name",new_student.getName());
			doc.append("last_name",new_student.getLastName());
			doc.append("civil_status",new_student.getCivilStatus());
			doc.append("sex",new_student.getSex());
			doc.append("semester",new_student.getSemester());
			doc.append("status",new_student.getStatus());
			doc.append("username",new_student.getUsername());
			doc.append("email",new_student.getEmail());
			doc.append("phone",new_student.getPhone());
			doc.append("password",new_student.getPassword());
			doc.append("university",new_student.getUniversity());
			doc.append("subject",new_student.getSubject());
			doc.append("ncr",new_student.getNCR());
			doc.append("created_at",new_student.getCreatedAt());  
			table.insertOne(doc);
			result = true;
		} catch (Exception e) {
			System.out.println("Error to try insert a new element in database");
		}
		return result;
	}
	

        
        	

        
	
}
