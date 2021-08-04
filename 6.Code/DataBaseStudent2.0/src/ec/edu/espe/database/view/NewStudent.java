/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.view;
import ec.edu.espe.database.controller.StudentInformationController;
import ec.edu.espe.database.model.Student;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Futures Programmers ESPE-DCC0
 */
public class NewStudent {
        public JFrame frame;
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtDate;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtCI;
	private JTextField txtUniversityName;
	public StudentInformationController db_conection;
	public Student student;
	private String db_table = "students";
    
    
}

