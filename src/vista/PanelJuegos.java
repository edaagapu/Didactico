package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PanelJuegos extends JPanel {

	public PanelJuegos() {
		setBackground(new Color(255, 250, 240));
		setLayout(null);
		
		JButton btnRompecabezas = new JButton("Rompecabezas");
		btnRompecabezas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		btnRompecabezas.setBounds(63, 38, 365, 158);
		add(btnRompecabezas);
		
		JButton btnParejitas = new JButton("Parejitas");
		btnParejitas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		btnParejitas.setBounds(63, 243, 365, 148);
		add(btnParejitas);
		
		JButton btnNewButton = new JButton("Ahorcado");
		btnNewButton.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(500, 38, 338, 158);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sopa de letras");
		btnNewButton_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		btnNewButton_1.setBounds(500, 243, 338, 148);
		add(btnNewButton_1);
		
		JButton btnCrucigrama = new JButton("Crucigrama");
		btnCrucigrama.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		btnCrucigrama.setBounds(291, 428, 365, 148);
		add(btnCrucigrama);
		
		JButton btnPaginaPrincipal = new JButton("Pagina Principal");
		btnPaginaPrincipal.setBounds(499, 602, 107, 47);
		add(btnPaginaPrincipal);
		
		JButton btnPuntajes = new JButton("Puntajes");
		btnPuntajes.setBounds(359, 602, 107, 47);
		add(btnPuntajes);

	}
}
