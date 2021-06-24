/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent.model;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class University {
    private String nameUniversity;
    private String racing;
    
    
    
    
    public void catagorizeStudents()
    {
        
    }   
    public void establishCourse()
    {
        
    }
    public void placeRacing()
    {
        
        
    } 

    public University(String nameUniversity, String racing) {
        this.nameUniversity = nameUniversity;
        this.racing = racing;
    }

    @Override
    public String toString() {
        return "University{" + "nameUniversity=" + getNameUniversity() + ", racing=" + getRacing() + '}';
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

   
    }

    
    
    
    

  
    
    

