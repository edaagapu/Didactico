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
import javax.swing.ImageIcon;

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
		frame.setBounds(100, 100, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(253, 245, 230));
		panelPrincipal.setLayout(null);
		
		JButton btnBotonmat = new JButton("");
		btnBotonmat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBotonmat.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/ElementosInterfaz/logoMat.png")));
		btnBotonmat.setBounds(72, 264, 270, 250);
		btnBotonmat.setContentAreaFilled(false);
		panelPrincipal.add(btnBotonmat);
		
		JButton btnBotonbio = new JButton("");
		btnBotonbio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotonbio.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/ElementosInterfaz/logoBio.png")));
		btnBotonbio.setBounds(352, 264, 270, 250);
		btnBotonbio.setContentAreaFilled(false);
		panelPrincipal.add(btnBotonbio);
		
		JButton btnBotoninf = new JButton("");
		btnBotoninf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotoninf.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/ElementosInterfaz/logInf.png")));
		btnBotoninf.setBounds(643, 264, 270, 250);
		btnBotoninf.setContentAreaFilled(false);
		panelPrincipal.add(btnBotoninf);
		
		JLabel lblTituloprograma = new JLabel("");
		lblTituloprograma.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/ElementosInterfaz/Titulo.png")));
		lblTituloprograma.setBounds(257, 41, 672, 167);
		panelPrincipal.add(lblTituloprograma);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/ElementosInterfaz/Logo.png")));
		lblLogo.setBounds(23, 11, 221, 242);
		panelPrincipal.add(lblLogo);
		
		JLabel lblFondoprincipal = new JLabel("");
		lblFondoprincipal.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/ElementosInterfaz/VentanaPrincipal.png")));
		lblFondoprincipal.setBounds(0, 0, 984, 711);
		panelPrincipal.add(lblFondoprincipal);
		
		JButton btnCrditos = new JButton("Cr\u00E9ditos");
		btnCrditos.setBounds(840, 677, 89, 23);
		panelPrincipal.add(btnCrditos);
		
		JButton btnCerrarSesion = new JButton("cerrar sesion");
		btnCerrarSesion.setBounds(96, 677, 89, 23);
		panelPrincipal.add(btnCerrarSesion);
		
		anadirCaracteristicas();
		
	}
	private void anadirCaracteristicas(){
		panelPrincipal.setBounds(0, 0, 984, 711);
		frame.getContentPane().add(panelPrincipal);
	}
}
