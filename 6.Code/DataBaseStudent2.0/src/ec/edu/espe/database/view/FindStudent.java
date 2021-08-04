/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.view;
import ec.edu.espe.database.model.Student;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Futures Programmers ESPE-DCC0
 */
public class FindStudent {
    
     public JFrame frame;

	/**
	 * Create the application.
	 */
	public FindStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFind = new JLabel("FInd");
		lblFind.setBounds(79, 79, 70, 15);
		frame.getContentPane().add(lblFind);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new StudentWelcome().frame.setVisible(true);
			}
                        
		});
		btnGoBack.setBounds(47, 177, 117, 25);
		frame.getContentPane().add(btnGoBack);
	}

    
}
    
    
    
    
    
    
    
}