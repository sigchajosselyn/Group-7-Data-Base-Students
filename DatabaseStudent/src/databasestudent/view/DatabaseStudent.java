/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent.view;

import databasestudent.model.Course;
import databasestudent.model.ID;

import databasestudent.model.Subject;
import databasestudent.model.University;
import java.util.Scanner;
import java.util.concurrent.Future;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class DatabaseStudent {

    public static void main(String[] args) {
        
        int ID;
        String name;
        int age;
        String sex;
        String statusCivil;
        String university;
        int nrc;
        String semester;
        String subjects;
        String jsonID = "";
        String jsonUniversity = "";
        String jsonCourse = "";
        String jsonSubjects = "";
        
        
        Scanner enter = new Scanner(System.in);
        
         ID id [] = new ID [10];
         Subject subject [] = new Subject [5] ;
         Course course [] = new Course[5] ;
                 
         for (int i=0 ; i<10;i++){
             System.out.println(" Enter the Id number: ");
             ID = enter.nextInt();
             
             System.out.println("Enter your full Names:");
             name = enter.next();
             
             System.out.println(" Enter your Age:");
             age = enter.nextInt();
             
             System.out.println(" Enter your sex:");
             sex = enter.next();
             
             System.out.println("Enter your Status Civil:");
             statusCivil = enter.next();
             
             
             System.out.println("Enter the name of your University:");
             university = enter.next();
             
             System.out.println("Eneter your corresponding Nrc:"); 
             nrc = enter.nextInt();
             
             System.out.println("Enter your corresponding semster:");
             semester = enter.next();
             
             System.out.println("Eneter the Subjects you belon to:");
             subjects = enter.next();
             System.out.println("\n ");
             
             
             enter.nextLine();
             
             id[i] = new ID(name, nrc, university, sex);
             subject[i] = new Subject(name, age);
             course [i] = new Course(semester, nrc);
             
               
              
     
             
             
             
             
            
         }
         
         
         
         
         
         
        
         
        
        
        
       
    
}
}
