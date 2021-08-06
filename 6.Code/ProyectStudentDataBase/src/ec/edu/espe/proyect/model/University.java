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
public class University {
    
    private Integer code;
    private String nameUniversity;
    private String racing;
    private String sede;
    private String userUniversity;
    
    
   
    
    
    public University() {
    }

    public University(Integer code, String nameUniversity, String racing, String sede, String userUniversity) {
        this.code = code;
        this.nameUniversity = nameUniversity;
        this.racing = racing;
        this.sede = sede;
        this.userUniversity = userUniversity;
    }

   

    

   
  public University(BasicDBObject dBObjectDataBase) {
      this.code = dBObjectDataBase.getInt("Code");
      this.nameUniversity = dBObjectDataBase.getString("NameUniversity");
        this.racing = dBObjectDataBase.getString("Racing");
        this.sede = dBObjectDataBase.getString("Sede");
        this.userUniversity = dBObjectDataBase.getString("UserUniversity");
        
        
  
    }
    
    
    public BasicDBObject dbUniversityObjectDataBase(){
        
        BasicDBObject dbUniversityObjectDataBase = new BasicDBObject();
        dbUniversityObjectDataBase.append("Code", this.getCode());
        dbUniversityObjectDataBase.append("NameUniversity", this.getNameUniversity());
        dbUniversityObjectDataBase.append("Racing", this.getRacing());
        dbUniversityObjectDataBase.append("Sede", this.getSede());
        dbUniversityObjectDataBase.append("UserUniversity", this.getUserUniversity());
        
        
       
        
        return dbUniversityObjectDataBase;
        
    }

    /**
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return the nameUniversity
     */
    public String getNameUniversity() {
        return nameUniversity;
    }

    /**
     * @param nameUniversity the nameUniversity to set
     */
    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    /**
     * @return the racing
     */
    public String getRacing() {
        return racing;
    }

    /**
     * @param racing the racing to set
     */
    public void setRacing(String racing) {
        this.racing = racing;
    }

    /**
     * @return the sede
     */
    public String getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    /**
     * @return the userUniversity
     */
    public String getUserUniversity() {
        return userUniversity;
    }

    /**
     * @param userUniversity the userUniversity to set
     */
    public void setUserUniversity(String userUniversity) {
        this.userUniversity = userUniversity;
    }

    /**
     * @return the nameUniversity
     */
    
    
}
    
    
    




        
