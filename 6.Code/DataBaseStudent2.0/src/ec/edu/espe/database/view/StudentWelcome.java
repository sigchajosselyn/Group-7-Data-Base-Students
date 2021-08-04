/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Future'sProgrammersTech ESPE- DCCO
 */
public class StudentWelcome {
    public JFrame frame;
	JLabel lblTitle;
	public NewStudent new_student_window;
	public FindStudent find_student_window;
        
        
        public StudentWelcome() {
		initialize();
	}
        
        
        private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 846, 418);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTitle = new JLabel("Student Database");
		lblTitle.setBounds(363, 44, 141, 27);
                frame.getContentPane().add(lblTitle);
		
		JButton btnFindStudent = new JButton("List Students");
		btnFindStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				find_student_window = new FindStudent();
				find_student_window.frame.setVisible(true);
			}
		});
                
                btnFindStudent.setBounds(131, 167, 182, 25);
		frame.getContentPane().add(btnFindStudent);
		
		JButton btnAddNewStudent = new JButton("Add New Student");
		btnAddNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new_student_window = new NewStudent();
				new_student_window.frame.setVisible(true);
				
			}
		});
                
                btnAddNewStudent.setBounds(581, 167, 174, 25);
		frame.getContentPane().add(btnAddNewStudent);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(717, 354, 117, 25);
		frame.getContentPane().add(btnExit);
	}
                
                
                
                
                
                
                
                
                
                
                
                
                        }

        
    
