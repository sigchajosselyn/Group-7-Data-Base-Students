/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.model;


/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */

import java.util.ArrayList;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */

public class Student extends StudentInformation{
    
     public Student(String ci, String name, String last_name, String civilStatus, String sex, String semester, String status, String username, String email, String phone, String password, String university, String nrc, String subject) {
	this.ci = ci;
        this.name = name;
        this.last_name = last_name;
        this.civilStatus = civilStatus;
        this.sex = sex;
        this.semester = semester;
        this.status= status;		
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.university = university;
        this.nrc =nrc;
        this.subject = subject;
		System.out.println("Creating a new student");
	}

    
}
