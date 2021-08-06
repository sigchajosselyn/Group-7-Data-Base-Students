/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Subject {
    private Integer nrc;
    private String nameSubject;
    private String typeOfSchedule;
    private String daysOfMatter;
    
    
    public Subject() {
        
    }

    public Subject(Integer nrc, String nameSubject, String typeOfSchedule, String daysOfMatter) {
        this.nrc = nrc;
        this.nameSubject = nameSubject;
        this.typeOfSchedule = typeOfSchedule;
        this.daysOfMatter = daysOfMatter;
    }

  
 public Subject(BasicDBObject dBObjectDataBase) {
     
     
        this.nrc = dBObjectDataBase.getInt("Nrc");
        this.nameSubject = dBObjectDataBase.getString("NameSubject");
        this.typeOfSchedule = dBObjectDataBase.getString("TypeOfSchedule");
        this.daysOfMatter = dBObjectDataBase.getString("DaysOfMatter");
        
       
    }
    
    
    public BasicDBObject dbSubjectObjectDateBase(){
        
        BasicDBObject  dbSubjectObjectDataBase = new BasicDBObject();
        
        dbSubjectObjectDataBase.append("Cedula", this.getNrc());
        dbSubjectObjectDataBase.append("Names", this.getNameSubject());
        dbSubjectObjectDataBase.append("LastName", this.getTypeOfSchedule());
        dbSubjectObjectDataBase.append("Phone", this.getDaysOfMatter());
       
        
        return dbSubjectObjectDataBase;
        
    }

    /**
     * @return the nrc
     */
    public Integer getNrc() {
        return nrc;
    }

    /**
     * @param nrc the nrc to set
     */
    public void setNrc(Integer nrc) {
        this.nrc = nrc;
    }

    /**
     * @return the nameSubject
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /**
     * @param nameSubject the nameSubject to set
     */
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    /**
     * @return the typeOfSchedule
     */
    public String getTypeOfSchedule() {
        return typeOfSchedule;
    }

    /**
     * @param typeOfSchedule the typeOfSchedule to set
     */
    public void setTypeOfSchedule(String typeOfSchedule) {
        this.typeOfSchedule = typeOfSchedule;
    }

    /**
     * @return the daysOfMatter
     */
    public String getDaysOfMatter() {
        return daysOfMatter;
    }

    /**
     * @param daysOfMatter the daysOfMatter to set
     */
    public void setDaysOfMatter(String daysOfMatter) {
        this.daysOfMatter = daysOfMatter;
    }

    
    
    
    
}
