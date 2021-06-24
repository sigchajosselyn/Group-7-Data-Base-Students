/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class StudentCompilation {
    private ArrayList<ID> databasestudents;
    public StudentCompilation(){
        
        databasestudents=new ArrayList<>();
    }
    
     public void agregarEstudiante(ID nuevoEstudiante) {
         databasestudents.add(nuevoEstudiante);
        
    }
     
     public boolean buscarPorNombre(String name){
         boolean encontrado = false;
         int i = 0;
         while(encontrado == false && i<databasestudents.size()){
             if (databasestudents.get(i).getName().compareToIgnoreCase(name)==0) {
                 encontrado = true;
                 
             }else{
                 i++;
             }
             
             
             
         }
         if (encontrado) {
             JOptionPane.showMessageDialog(null, "Name: " + databasestudents.get(i).getName() + "\n"
            + "Civil Status: " + databasestudents.get(i).getCivilStatus() + "\n"
            + "Sex: " + databasestudents.get(i).getSex());
            return false;
            
            
         }else{
             JOptionPane.showMessageDialog(null,"No existe el nombre, intente nuevamente..!!");
             return true;
             
         }   
     }    
}
