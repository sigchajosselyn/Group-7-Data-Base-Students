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
public class Subject {
    private String name;
    private int type;

    public Subject(String name, int type) {
        this.name = name;
        this.type = type;
    }

    

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", type=" + type + '}';
    }
    
    
    
    
    
    
    public void selectName()
    {
        
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
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
 
    
    
    
    

    
}
