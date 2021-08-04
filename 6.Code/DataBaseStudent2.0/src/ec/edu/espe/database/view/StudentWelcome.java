/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.view;

import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
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
		lblTitle.setBounds(363, 44, 141, 27);}
        
    
    
}
