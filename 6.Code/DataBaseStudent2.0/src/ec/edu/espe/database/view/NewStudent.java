/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.view;

import ec.edu.espe.database.controller.StudentInformationController;
import ec.edu.espe.database.model.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    
        
        /**
	 * Create the application.
	 */
	public NewStudent() {
		initialize();
		db_conection = new StudentInformationController(this.db_table);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 982, 682);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewStudent = new JLabel("New Student");
		lblNewStudent.setBounds(360, 22, 154, 15);
		frame.getContentPane().add(lblNewStudent);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new StudentWelcome().frame.setVisible(true);
			}
		});
                
                
                btnGoBack.setBounds(12, 618, 117, 25);
		frame.getContentPane().add(btnGoBack);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(32, 82, 82, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(32, 125, 82, 15);
		frame.getContentPane().add(lblLastName);
		
		txtName = new JTextField();
		txtName.setBounds(132, 77, 154, 19);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(132, 120, 154, 19);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
    
}

