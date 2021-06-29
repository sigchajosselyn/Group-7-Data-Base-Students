/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudents20.view;
import java.io.*;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class RegistrationSystem1 {
    
    public static String dato() {
        String sdato = null;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            sdato = entrada.readLine();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return sdato;
        
    }
    
    public static int datoInt(){
        try{
            return(Integer.parseInt(dato()));
        } catch (NumberFormatException error){
            return (Integer.MIN_VALUE);
        }
    }
    
    public static float datoFloat(){
        try{
            Float f = new Float(dato());
            return (f.floatValue());
        } catch (NumberFormatException error){
            return (Float.NaN);
        }
    }
    
    public static double datoDouble(){
        try{
            Double d = new Double(dato());
            return (d.doubleValue());
        } catch (NumberFormatException error){
            return (Double.NaN);
        }
    }
    
    public static char datoChar(){
        try{
            char resp = dato().charAt(0);
            return resp;
        } catch (Exception error){
            return ('z');
        }
    }
    
    public static boolean datoBoolean(){
        try{
            return(Boolean.parseBoolean(dato()));
        } catch(NumberFormatException error){
            return (false);
        }
    }
}

