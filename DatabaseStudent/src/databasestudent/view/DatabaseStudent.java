/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent.view;

import databasestudent.model.Course;
import databasestudent.model.ID;
import databasestudent.model.StudentInformation;
import databasestudent.model.Subject;
import databasestudent.model.University;
import java.util.concurrent.Future;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class DatabaseStudent {

    public static void main(String[] args) {
        StudentInformation studentInformation = new StudentInformation();
        Course course = new Course();
        ID id = new ID ();
        Subject subject = new Subject ();
        University university = new University ();
     
        
        
        System.out.println("Hello from DatabaseStudent");
        
        studentInformation.setName("Josselyn");
        studentInformation.setAge(19);
        studentInformation.setDni(1722864343);
      
        course.setNumber(3730);
        course.setIdentificationStudent(22);
        course.setAge(19);
        id.setNumbers(1722864343);
       
        subject.setName ("Programming");
        subject.setType(3730);
        university.setName ("Universidad de las Fuerzas Armadas ESPE");
        university.setStudent("Sigcha Josselyn");
      
        
        
        
        
        
        
        System.out.println("the studentInformation is:" + studentInformation);
        System.out.println("the course is:" + course);
        System.out.println("the id is:" + id);
        System.out.println("the name of subject is:" + subject);
        System.out.println("the name of university is:" + university);
        
                  
       
    }
    
}
