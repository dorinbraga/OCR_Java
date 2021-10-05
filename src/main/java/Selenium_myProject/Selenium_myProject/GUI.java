package Selenium_myProject.Selenium_myProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sourceforge.tess4j.TesseractException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	protected Object mydata;

	public static void main(String[] args) throws IOException, TesseractException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	
	public GUI() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null,mydata);
			}
		});
		btnNewButton.setBounds(164, 200, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
	}

}
