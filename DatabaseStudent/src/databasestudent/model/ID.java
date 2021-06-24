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
public class ID {
    private string student;
    private float numbers;
    private string datainformation;
    private string sex;
    
    
    public void identifyStudent()
    {
        
    }
    public void poseNumber()
    {
        
    }
    public void specifyDatainformation()
    {
        
    }

    @Override
    public String toString() {
        return "ID{" + "student=" + getStudent() + ", numbers=" + getNumbers() + ", datainformation=" + getDatainformation() + ", sex=" + getSex() + '}';
    }

    /**
     * @return the student
     */
    public string getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(string student) {
        this.student = student;
    }

    /**
     * @return the numbers
     */
    public float getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(float numbers) {
        this.numbers = numbers;
    }

    /**
     * @return the datainformation
     */
    public string getDatainformation() {
        return datainformation;
    }

    /**
     * @param datainformation the datainformation to set
     */
    public void setDatainformation(string datainformation) {
        this.datainformation = datainformation;
    }

    /**
     * @return the sex
     */
    public string getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(string sex) {
        this.sex = sex;
    }

    public void setSex(String female) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    

    


            
    
    
}
