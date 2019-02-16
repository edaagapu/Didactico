package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventanaPrincipal {

	private JFrame frame;
	
	private JPanel panelPrincipal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal window = new ventanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(253, 245, 230));
		panelPrincipal.setLayout(null);
		
		JLabel lblFondoprincipal = new JLabel("");
		lblFondoprincipal.setBounds(114, 87, 169, 115);
		panelPrincipal.add(lblFondoprincipal);
		
		anadirCaracteristicas();
		
	}
	private void anadirCaracteristicas(){
		panelPrincipal.setBounds(0, 0, 984, 661);
		frame.getContentPane().add(panelPrincipal);
	}
}
