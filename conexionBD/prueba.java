package udistrital.thriscud.softwareEducativo.conexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;

import udistrital.thriscud.softwareEducativo.usuario.Usuario;

public class prueba {

	public static void main(String[] args) {
		Conection BD = new Conection();
		ResultSet resultado;
		Usuario u = new Usuario ("Felipe","Renteria","anferente","123456789");
		
		String nombre = null, apellido = null, usuario = null, contrasena = null;
		try {
			BD.cambiarContrasena(u);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		resultado = BD.getQuery();
		try {
			while(resultado.next()) {
				apellido = resultado.getString("apellido");
				nombre = resultado.getString("nombre");
				usuario = resultado.getString("usuario");
				contrasena = resultado.getString("contrasena");
				System.out.println(nombre+"  "+apellido+"  "+usuario+" "+contrasena);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
