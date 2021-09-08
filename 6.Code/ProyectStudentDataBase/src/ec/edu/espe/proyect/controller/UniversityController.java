/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.controller;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.proyect.model.University;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */

public class UniversityController {
 DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject(); 
    
    public UniversityController(){
        Mongo mongo = new Mongo("localhost", 27017);
        DataBase = mongo.getDB("DataBase");
        collection = DataBase.getCollection("University");
        System.out.println("successful connection");
    }
    
    
    public boolean add( Integer code ,String  nameUniversity, String racing, String sede, String UserUniversity){
        ArrayList<University> university = new ArrayList<>();
        university.add(new University( code,nameUniversity, racing,  sede,  UserUniversity));
        for (University pueU : university){
            collection.insert(pueU.dbUniversityObjectDataBase());
            
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
    }  
     public boolean delete(Integer cedula){
        document.put("Code",cedula);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
               
                
    }
      public boolean update(Integer cedulas, String names){
        DBObject find = new BasicDBObject("Code", new BasicDBObject("$eq", cedulas));
        DBObject updated = new BasicDBObject().append("$set",new BasicDBObject().append("Names", names));
        collection.update(find, updated,false,true);
        int input = JOptionPane.showConfirmDialog(null, "Update Record", "OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
    }
      public void display(JTextArea txtArea){
        
        DBCursor cursor = collection.find();
        
        try{
            while(cursor.hasNext()){
                txtArea.setText(txtArea.getText()+"\n" + cursor.next().toString());
                
                
            }
        } finally{
                 cursor.close();
                    
                    }
        }
    
    
    
    
   
    
 
}
