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
import ec.edu.espe.proyect.model.Student;
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
public class StudentController {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject(); 
    
    public StudentController(){
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("DataBase");
            collection = DataBase.getCollection("Student");
            System.out.println("successful connection");
        }catch(UnknownHostException ex){
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
    
    public boolean add(Integer cedula, String names, String lastName, String civilStatus, Integer phone, String sex, String email){
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(cedula, names, lastName, civilStatus, phone, sex, email));
        for (Student pueS : student){
            collection.insert(pueS.dbStudentObjectDataBase());
            
            
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
    }  
     public boolean delete(Integer cedula){
        document.put("Cedula",cedula);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
               
                
    }
      public boolean update(Integer cedulas, String names){
        DBObject find = new BasicDBObject("Cedula", new BasicDBObject("$eq", cedulas));
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
