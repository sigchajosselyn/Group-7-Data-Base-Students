/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.model;

import java.util.ArrayList;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public abstract class StudentInformation {
    
    protected String ci;
    protected String name;
    protected String last_name;
    protected String civilStatus;
    protected String sex;
    protected String semester;
    //protected String nrc;
    protected String status; //approved or insuficient
    protected String username;
    protected String email;
    protected String phone;
    protected String password;
    protected String created_at;
    protected String university;
    protected String nrc;
    protected String subject;
    
    protected ArrayList<Double>notes;
    protected double average_notes;
	
    public abstract String getCi();
	public abstract String getName();
	public abstract String getLastName();
	public abstract String getCivilStatus();
	public abstract String getSex();
	public abstract String getSemester();
	public abstract String getUsername();
	public abstract String getEmail();
	public abstract String getStatus();
	public abstract String getPhone();
	public abstract String getPassword();
	public abstract String getCreatedAt();
	public abstract String getUniversity();
	public abstract String getNCR();
	public abstract String getSubject();
	public abstract ArrayList<Double> getNotes();
	public abstract double getAverage_notes();
	public abstract void setCi(String ci);
	public abstract void setName(String name);
	public abstract void setLastName(String last_name);
	public abstract void setCivilStatus(String civilStatus);
	public abstract void setSex(String sex);
	public abstract void setSemester(String semester);
	public abstract void setCreatedAt(String date);
	public abstract void setStatus(String status);
	public abstract void setPhone(String phone);
	public abstract void setPassword(String password);
	public abstract void setUsername(String username);
	public abstract void setEmail(String email);
	public abstract void setUniversity(String university);
	public abstract void setNCR(String ncr);
	public abstract void setSubject(String subject);
	public abstract void setNotes(ArrayList<Double> notes);
	public abstract void setAverage_notes(double average_notes);

    
    
    
}
