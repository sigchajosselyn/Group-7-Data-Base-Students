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
    private String name;
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

    public University(String name, String racing) {
        this.name = name;
        this.racing = racing;
    }

    @Override
    public String toString() {
        return "University{" + "name=" + getName() + ", racing=" + getRacing() + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    
    
    
    

  
    
    

