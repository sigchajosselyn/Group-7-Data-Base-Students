/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.database.model.StudentsInformation;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Futures Programmers ESPE-DCC0
 */
public class RegistrationSystem {
    
    static StudentsInformation students[] = null;
    
    static int cont = 0;
    
    public static void main(String[] args) throws IOException{
        
        students =  new StudentsInformation[3];
        
        int opcion = 0;
        
        do{
            System.out.println("--Students Registration--");
            System.out.println("------------------");
            System.out.println("1.-Enter ID (Cedula)");
            System.out.println("2.-Search Student");
            System.out.println("3.-Exit");
            System.out.println("Select your option....: ");
            opcion = RegistrationSystem1.datoInt();
            
            switch(opcion){
                case 1:
                    if (cont < 3) {
                        agregarAlumno();
                    }else{
                        System.out.println("error!");
                    } 
                    break;
                case 2:
                    editarAlumno();
                    break;
                case 3:
                    listarAlumno();
                    break;
                case 4:
                    System.out.println("close the code");
             
            }
        } while (opcion != 4);
        System.exit(0);
        
    }

    private static void agregarAlumno() throws IOException {
        
        
        String cedula = "";
        String name = "";
        String civilStatus = "";
        String sex = "";
        String nameUniversity = "";
        String racing = "";
        String semester = "";
        String nrc = "";
        String nameSubject = "";
        String estado = "";
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double promedio = 0;
        String jsonStudentsInformation = "";
        
        FileWriter file = new FileWriter("./files/DataBaseStudent2.0.json");
        
        
        System.out.println("\n\n\n");
        System.out.println("----------------");
        System.out.println("--Student Data--");
        System.out.println("------------------");
        
        System.out.print("CI: ");
        cedula = RegistrationSystem1.dato();
        
        System.out.print("Name: ");
        name = RegistrationSystem1.dato();
        
        System.out.print("CivilStatus: ");
        civilStatus = RegistrationSystem1.dato();
        
        System.out.print("Sex: ");
        sex = RegistrationSystem1.dato();
        
        System.out.print("NameUniversity; ");
        nameUniversity = RegistrationSystem1.dato();
        
        System.out.print("Racing: ");
        racing = RegistrationSystem1.dato();
        
        System.out.print("Semester: ");
        semester = RegistrationSystem1.dato();
        
        System.out.print("NRC: ");
        nrc = RegistrationSystem1.dato();
        
        System.out.print("NameSubject: ");
        nameSubject = RegistrationSystem1.dato();
        
        System.out.print("Grade 1: ");
        n1 = RegistrationSystem1.datoDouble();
        
        System.out.print("Grade 2: ");
        n2 = RegistrationSystem1.datoDouble();
        
        System.out.print("Grade 3: ");
        n3 = RegistrationSystem1.datoDouble();
        
        promedio = (n1 + n2 + n3)/3;
        
        System.out.println("Grade point average: " + promedio);
        
        if(promedio >= 3.95) {
            estado = "Approved";
            System.out.println(estado);
        } else {
            estado = "Reproved";
            System.out.println(estado);
        }
        
       
           
        students[cont] = new StudentsInformation(cedula, name, civilStatus, sex, nameUniversity, racing, semester, nrc, nameSubject, estado, n1, n2, n3, promedio);
        cont++;
        System.out.println("Added Student!: " + cont);
         GsonBuilder gsonBuilder = new  GsonBuilder();
         Gson gson = gsonBuilder.create();
         jsonStudentsInformation = gson.toJson(students);
          
         System.out.println("jsonStudentsInformation ->" + jsonStudentsInformation);
         
         try {
                      file.append(jsonStudentsInformation);
                       
                       file.flush();
                       file.close();

                    } catch (IOException e){
                        
                    }
           
    }

    
    
    private static void editarAlumno() throws IOException{
        
        String cedula;
        int pos = -1;
        int accion = 0;
            System.out.print("Enter the ID: ");
            cedula = RegistrationSystem1.dato();
            pos = buscarAlumno(cedula);
    
        
        if (pos >= 0) {
            System.out.println("Data: " + students[pos].toString());
            System.out.println("1.-KEEP DATA ???");
            System.out.println("2.-DELETE");
            System.out.println("Option enter....");
            accion = RegistrationSystem1.datoInt();
            
            
            switch(accion){
                case 1:
                    
                    utilizarDatos(pos);
                    break;
                case 2:
                    eliminarDatos(pos);
                default:
                    System.out.println("Invalid Option");
            }
            
            
        } else {
            System.out.println("Dont Exist Register");
        }
       
    }
    
    

    private static int buscarAlumno(String cedula) throws IOException{
        int pos = -1;
        for (int i = 0; i < cont; i++) {
            if (students[i].getCedula().equals(cedula)){
                System.out.println("Record Found !");
                pos = i;  
            } else {
                System.out.println("No Registration!");
                
            }
         
        }   
        return pos;
    }

    
    private static void utilizarDatos(int pos) throws IOException{
        
     String cedula = null;
     String name = null;
     String civilStatus = null;
     String sex = null;
     String nameUniversity = null;
     String racing = null;
     String semester = null;
     String nrc = null;
     String nameSubject = null;
     String estado = null;
     double n1 = 0;
     double n2 = 0;
     double n3 = 0;
     double promedio = 0;
     int opcion = 0;
     int seguir = 0;
     
     
       
     
     while (seguir == 1){
         System.out.println("\n\n--Students Menu--");
         System.out.println("---------------------------");
         System.out.println("1.-Cambiar ID ");
         System.out.println("2.-Cambiar name ");
         System.out.println("3.-Cambiar civilStatus");
         System.out.println("4.-Cambiar sex");
         System.out.println("5.-Cambiar nameUniversity");
         System.out.println("6.-Cambiar racing");
         System.out.println("7.-Cambiar semester");
         System.out.println("8.-Cambiar nrc");
         System.out.println("9.-Cambiar nameSubject");
         System.out.println("10.-Cambiar grade 1");
         System.out.println("11.-Cambiar grade 2");
         System.out.println("12.-Cambiar grade 3");
         System.out.println(".-Enter the option: ");
         opcion = RegistrationSystem1.datoInt();
         
         switch (opcion) {
             case 1:
                 System.out.println("ID: ");
                 cedula  = RegistrationSystem1.dato();
                 students[pos].setCedula(cedula);
                 break;
             case 2:
                 System.out.println("Name");
                 name = RegistrationSystem1.dato();
                 students[pos].setName(name);
                 break;
             case 3:
                 System.out.println("CivilStatus");
                 civilStatus = RegistrationSystem1.dato();
                 students[pos].setCivilStatus(civilStatus);
                 break;
             case 4:
                 System.out.println("Sex");
                 sex = RegistrationSystem1.dato();
                 students[pos].setSex(sex);
                 break;
             case 5:
                 System.out.println("NameUniversity");
                 nameUniversity = RegistrationSystem1.dato();
                 students[pos].setNameUniversity(nameUniversity);
                 break;
             case 6:
                 System.out.println("Racing");
                 racing = RegistrationSystem1.dato();
                 students[pos].setRacing(racing);
                 break;
             case 7:
                 System.out.println("Semester");
                 semester = RegistrationSystem1.dato();
                 students[pos].setSemester(semester);
                 break;
             case 8:
                 System.out.println("NRC");
                 nrc = RegistrationSystem1.dato();
                 students[pos].setNrc(nrc);
                 break;
             case 9:
                 System.out.println("NameSubject");
                 nameSubject = RegistrationSystem1.dato();
                 students[pos].setNameSubject(nameSubject);
                 break;
            case 10:
                 System.out.println("Grade 1");
                 n1 = RegistrationSystem1.datoDouble();
                 students[pos].setN1(n1);
                 break;
             case 11:
                 System.out.println("Grade 2");
                 n2 = RegistrationSystem1.datoDouble();
                 students[pos].setN2(n2);
                 break; 
             case 12:
                 System.out.println("Grade 3");
                 n3 = RegistrationSystem1.datoDouble();
                 students[pos].setN3(n3);
                 break;   
             default :
                 System.out.println("Invalid Option!");
         }
         if (opcion <= 10 && opcion <= 12) {
             n1 = students[pos].getN1();
             n2 = students[pos].getN2();
             n3 = students[pos].getN3();
             
             promedio = (n1+n2+n3)/3;
             System.out.println("grade point average: " + promedio);
             students[pos].setPromedio(promedio);
             
             if (promedio >= 3.95) {
                 estado = "Approved";
                 System.out.println("estado");
             } else {
                 estado = "Reprobate";
                 System.out.println(estado);
             }
             students[pos].setEstado(estado);
         }
         System.out.println("-------------------------------");
         System.out.println("1.-Continue to amend");
         System.out.println("2.-Exit");
         System.out.println("Enter Option: ");
         seguir = RegistrationSystem1.datoInt();
      
     } 
     
     
    }
    
    
    
     private static void eliminarDatos(int pos) throws IOException{
         
         for (int i = pos; i < cont; i++) {
             students[i] = students[i + 1];
         }
         System.out.println("Data deleted!");
         cont--;
        
    }
    
    
    private static void listarAlumno() {
        for (int i = 0; i < cont; i++) {
            System.out.println("\n\n\n--STUDENT DATA--");
            System.out.println("---------------------------------");
            System.out.println(students[i].toString());
        }
        
    }
    
    
     
}