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
public class Course {
    private int number;
    private int identificationStudent;
    private int age;

    @Override
    public String toString() {
        return "Course{" + "number=" + number + ", identificationStudent=" + identificationStudent + ", age=" + age + '}';
    }
    
    
    
    
    
    public void determineNumber()
    {        
    
    }
    public void detailAge()
    {
        
    }
    public void separateID()
    {
        
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the identificationStudent
     */
    public int getIdentificationStudent() {
        return identificationStudent;
    }

    /**
     * @param identificationStudent the identificationStudent to set
     */
    public void setIdentificationStudent(int identificationStudent) {
        this.identificationStudent = identificationStudent;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    

    
        
    }
    

