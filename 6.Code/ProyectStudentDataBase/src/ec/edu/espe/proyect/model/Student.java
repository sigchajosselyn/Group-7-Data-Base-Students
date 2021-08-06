/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.model;

import com.mongodb.BasicDBObject;
import javax.swing.JFrame;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Student {
    private Integer cedula;
    private String names;
    private String lastName;
    private String civilStatus;
    private Integer phone;
     private String sex;
    private String email;
    
   
    
    
    public Student() {
    }

    public Student(Integer cedula, String names, String lastName, String civilStatus, Integer phone, String sex, String email) {
        this.cedula = cedula;
        this.names = names;
        this.lastName = lastName;
        this.civilStatus = civilStatus;
        this.phone = phone;
        this.sex = sex;
        this.email = email;
    }

   
 public Student(BasicDBObject dBObjectDataBase) {
          this.cedula = dBObjectDataBase.getInt("Cedula");
        this.names = dBObjectDataBase.getString("Names");
        this.lastName = dBObjectDataBase.getString("lastName");
        this.civilStatus = dBObjectDataBase.getString("civilStatus");
        this.phone = dBObjectDataBase.getInt("Phone");
        this.sex =dBObjectDataBase.getString("Sex");
        this.email =dBObjectDataBase.getString("Email");
        
        
  
    }
    
    
    public BasicDBObject dbStudentObjectDataBase(){
        
        BasicDBObject dbStudentObjectDataBase = new BasicDBObject();
        
        dbStudentObjectDataBase.append("Cedula", this.getCedula());
        dbStudentObjectDataBase.append("Names", this.getNames());
        dbStudentObjectDataBase.append("LastName", this.getLastName());
        dbStudentObjectDataBase.append("Phone", this.getPhone());
        dbStudentObjectDataBase.append("CivilStatus", this.getCivilStatus());
        dbStudentObjectDataBase.append("Sex", this.getSex());
        dbStudentObjectDataBase.append("Email", this.getEmail());
        
       
        
        return dbStudentObjectDataBase;
        
        
        
        
    }

    /**
     * @return the cedula
     */
    public Integer getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the civilStatus
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * @param civilStatus the civilStatus to set
     */
    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    /**
     * @return the phone
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
