/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.database.view;

import java.awt.EventQueue;

/**
 *
 * @author Future'sProgrammersTech ESPE- DCCO
 */
public class StudentInformationGUI {
    public static void main(String[] args) {
            
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentWelcome window = new StudentWelcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
    

