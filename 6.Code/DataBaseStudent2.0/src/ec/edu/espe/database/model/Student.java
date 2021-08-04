/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.model;


/**
 *
 * @author Future'sProgrammersTech ESPE- DCCO
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
@Override
	public String getCi() {
		return this.ci;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getCivilStatus() {
		return this.civilStatus;
	}

	@Override
	public String getSex() {
		return this.sex;
	}

	@Override
	public String getSemester() {
		return this.semester;
	}

//	@Override
//	public String getNrc() {
//		return this.nrc;
//	}

	@Override
	public String getStatus() {
		return this.status;
	}

	@Override
	public ArrayList<Double> getNotes() {
		return null;
	}

	@Override
	public double getAverage_notes() {
		return this.average_notes;
	}


	@Override
	public void setCi(String ci) {
		this.ci = ci;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	@Override
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void setSemester(String semester) {
		this.semester = semester;
	}

//	@Override
//	public void setNrc(String nrc) {
//		this.nrc = nrc;
//	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void setNotes(ArrayList<Double> notes) {
		this.notes = notes;
	}

	@Override
	public void setAverage_notes(double average_notes) {
		this.average_notes = average_notes;		
	}

	@Override
	public String getLastName() {
		return this.last_name;
	}

	@Override
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}


	@Override
	public String getUsername() {
		return this.username;
	}


	@Override
	public String getEmail() {
		return this.email;
	}


	@Override
	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String getPhone() {
		return this.phone;
	}


	@Override
	public String getPassword() {
		return this.password;
	}


	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String getCreatedAt() {
		return this.created_at;
	}


	@Override
	public void  setCreatedAt(String date) {
		this.created_at = date;
	}


	@Override
	public String getUniversity() {
		return this.university;
	}


	@Override
	public String getNCR() {
		return this.nrc;
	}


	@Override
	public void setUniversity(String university) {
		this.university = university;
	}


	@Override
	public void setNCR(String ncr) {
		this.nrc = ncr;
	}


	@Override
	public String getSubject() {
		return this.subject;
	}


	@Override
	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Student [ci=" + ci + ", name=" + name + ", last_name=" + last_name + ", civilStatus=" + civilStatus
				+ ", sex=" + sex + ", semester=" + semester + ", status=" + status + ", username=" + username
				+ ", email=" + email + ", phone=" + phone + ", password=" + password + ", created_at=" + created_at
				+ ", university=" + university + ", nrc=" + nrc + ", subject=" + subject + ", notes=" + notes
				+ ", average_notes=" + average_notes + "]";
	}

   
    
    
    
}

    

