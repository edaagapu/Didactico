package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtNickname;
	private JTextField txtDocumento;
	private JTextField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIngresar = new JButton("");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrar();
			}
		});
		btnIngresar.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/ElementosInterfaz/btnIngresar.png")));
		btnIngresar.setBounds(365, 567, 282, 100);
		btnIngresar.setContentAreaFilled(false);
		btnIngresar.setBorderPainted(false);
		contentPane.add(btnIngresar);
		
		txtNombres = new JTextField();
		txtNombres.setForeground(new Color(47, 79, 79));
		txtNombres.setFont(new Font("Agency FB", Font.PLAIN, 30));
		txtNombres.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombres.setBounds(497, 207, 205, 42);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setHorizontalAlignment(SwingConstants.LEFT);
		txtApellidos.setForeground(new Color(47, 79, 79));
		txtApellidos.setFont(new Font("Agency FB", Font.PLAIN, 30));
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(497, 278, 205, 42);
		contentPane.add(txtApellidos);
		
		txtNickname = new JTextField();
		txtNickname.setHorizontalAlignment(SwingConstants.LEFT);
		txtNickname.setForeground(new Color(47, 79, 79));
		txtNickname.setFont(new Font("Agency FB", Font.PLAIN, 30));
		txtNickname.setColumns(10);
		txtNickname.setBounds(497, 357, 205, 42);
		contentPane.add(txtNickname);
		
		txtDocumento = new JTextField();
		txtDocumento.setHorizontalAlignment(SwingConstants.LEFT);
		txtDocumento.setForeground(new Color(47, 79, 79));
		txtDocumento.setFont(new Font("Agency FB", Font.PLAIN, 30));
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(497, 425, 205, 42);
		contentPane.add(txtDocumento);
		
		txtContrasena = new JTextField();
		txtContrasena.setHorizontalAlignment(SwingConstants.LEFT);
		txtContrasena.setForeground(new Color(47, 79, 79));
		txtContrasena.setFont(new Font("Agency FB", Font.PLAIN, 30));
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(497, 500, 205, 42);
		contentPane.add(txtContrasena);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setForeground(new Color(255, 255, 255));
		lblNombres.setFont(new Font("Agency FB", Font.BOLD, 35));
		lblNombres.setBounds(298, 205, 156, 42);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setForeground(new Color(255, 255, 255));
		lblApellidos.setFont(new Font("Agency FB", Font.BOLD, 35));
		lblApellidos.setBounds(298, 276, 156, 42);
		contentPane.add(lblApellidos);
		
		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setForeground(new Color(255, 255, 255));
		lblNickname.setFont(new Font("Agency FB", Font.BOLD, 35));
		lblNickname.setBounds(298, 355, 156, 42);
		contentPane.add(lblNickname);
		
		JLabel lblDocumento = new JLabel("Documento ");
		lblDocumento.setForeground(new Color(255, 255, 255));
		lblDocumento.setFont(new Font("Agency FB", Font.BOLD, 35));
		lblDocumento.setBounds(298, 423, 156, 42);
		contentPane.add(lblDocumento);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setForeground(new Color(255, 255, 255));
		lblContrasena.setFont(new Font("Agency FB", Font.BOLD, 35));
		lblContrasena.setBounds(298, 498, 156, 42);
		contentPane.add(lblContrasena);
		
		JLabel lblContenedorregistro = new JLabel("");
		lblContenedorregistro.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/ElementosInterfaz/contenedorGrande.png")));
		lblContenedorregistro.setBounds(191, 126, 640, 585);
		contentPane.add(lblContenedorregistro);
		
		JLabel lblTitulo = new JLabel("");
		lblTitulo.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/ElementosInterfaz/Titulo.png")));
		lblTitulo.setBounds(178, 11, 660, 106);
		contentPane.add(lblTitulo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/ElementosInterfaz/VentanaPrincipal.png")));
		lblFondo.setBounds(10, 0, 984, 711);
		contentPane.add(lblFondo);
	}
	/**Método del boton ingresar, que registra al usuario*/
	public void registrar(){
		
	}
}

