package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
		anadirCaracteristicas();
		
	}
	private void anadirCaracteristicas(){
		panelPrincipal.setBounds(0, 0, 984, 661);
		frame.getContentPane().add(panelPrincipal);
	}
}
