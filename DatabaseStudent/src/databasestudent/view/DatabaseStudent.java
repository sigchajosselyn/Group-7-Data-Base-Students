/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import databasestudent.model.Course;
import databasestudent.model.ID;

import databasestudent.model.Subject;
import databasestudent.model.University;
import java.util.Scanner;


/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class DatabaseStudent {

    public static void main(String[] args) {
        
        int numbersId;
        
        String name;
        int age;
        String sex;
        String civilStatus;
        String nameUniversity;
        String racing;
        int nrc;
        String semester;
        String subjects;
        String jsonID = "";
        String jsonUniversity = "";
        String jsonCourse = "";
        String jsonSubjects = "";
        
        
        Scanner enter = new Scanner(System.in);
        
         ID id [] = new ID [5];
         Subject subject [] = new Subject [5] ;
         Course course [] = new Course[5] ;
         University university [] = new University[5];
         
         
         
         
         boolean salir= false;
         int option;
       while(!salir){
           System.out.println("Save options menu");
           System.out.println("\n Welcome to the student database "+" \n ");
           System.out.println("\n 1.Enter Information Student ");
           System.out.println("\n 2.Search on Student ");
           System.out.println("\n 3.Exit");
           
           System.out.println("Enter a number ");
           option= enter.nextInt();  
             
           
           
            switch(option){
               case 1:
            
                   System.out.println("Enter Information on Student");
             
         for (int i=0 ; i<2;i++){
             System.out.println(" Enter the Id number: ");
             numbersId = enter.nextInt();
             
             System.out.println("Enter your full Names:");
             name = enter.next();
             
             System.out.println(" Enter your Age:");
             age = enter.nextInt();
             
             System.out.println(" Enter your sex:");
             sex = enter.next();
             
             System.out.println("Enter your Status Civil:");
             civilStatus = enter.next();
             
             
             System.out.println("Enter the name of your University:");
             nameUniversity = enter.next();
             
             System.out.println("Enter the name of your Racing:");
             racing = enter.next();
             
             System.out.println("Eneter your corresponding Nrc:"); 
             nrc = enter.nextInt();
             
             System.out.println("Enter your corresponding semster:");
             semester = enter.next();
             
             System.out.println("Eneter the Subjects you belon to:");
             subjects = enter.next();
             System.out.println("\n ");
             
             
             enter.nextLine();
             
             id[i] = new ID( name,  numbersId,  civilStatus, sex);
             subject[i] = new Subject(name, age);
             course [i] = new Course(semester, nrc);
             university[i] = new University(nameUniversity, racing);
             
            GsonBuilder gsonBuilder = new  GsonBuilder();
            Gson gson = gsonBuilder.create();
            jsonID = gson.toJson(id[i]);
            jsonUniversity = gson.toJson(university[i]);
            jsonCourse= gson.toJson(course[i]);
            jsonSubjects= gson.toJson(subject[i]);
            
            ID id1; 
            id1 = gson.fromJson(jsonID, ID.class);
            University university1;
            university1 = gson.fromJson(jsonUniversity, University.class);
            Course course1;
            course1  =  gson.fromJson(jsonCourse,Course.class);
            Subject subject1;
            subject1 =  gson.fromJson(jsonSubjects, Subject.class);
           
            System.out.println("jsonID ->"+ jsonID);
            System.out.println("jsonUniversity ->"+ jsonUniversity);
            System.out.println("jsonCourse ->"+ jsonCourse);
            System.out.println("jsonSubject ->"+ jsonSubjects);
            
           
           
           
           
              
            
             
             
 
             
            
         }
         
         
         
         
         
         
        
         
        
        
       }   
       
       }   
}
}
