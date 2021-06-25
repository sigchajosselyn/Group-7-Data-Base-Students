/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudents20.view;

import databasestudent20.model.StudentsInformation;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class RegistrationSystem {
    public static void main(String[] args) throws IOException {
        
         Scanner enter = new Scanner(System.in);
        RegistrationSystem bus =  new RegistrationSystem();
        boolean salir= false;
         int option;
       while(!salir){
        
           
           System.out.println("\n Welcome to the student database "+" \n ");
           System.out.println("\n 1.Enter Information Student ");
           System.out.println("\n 2.Search on Student ");
           System.out.println("\n 3.Exit");
           
           System.out.println("Enter a number ");
             option = enter.nextInt();
        
    
}
        int numbersId;
       
        String nameStudent;
        String sex;
        String civilStatus;
        String nameUniversity;
        String racing;
        int nrc;
        String semester;
        String nameSubjects;
        String jsonStudenInformation = "";
        
       
        
        List<StudentsInformation> studentsInformationList = new ArrayList<StudentsInformation>();
         FileWriter file = new FileWriter("./files/StudentDataBase.json");
                
        
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student Information ");
}
}
