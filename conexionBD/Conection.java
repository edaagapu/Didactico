package udistrital.thriscud.softwareEducativo.conexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import udistrital.thriscud.softwareEducativo.usuario.Usuario;
public class Conection {
	 /*Usuario y pass de la Base de Datos. */
	 private String user = "system";
	 private String pass = "Afrv5497*";
	  
	 /* URL de la Base de Datos */
	 static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	  
	 /* Conexion a la Base de Datos */
	 private Connection conn = null;
	 private PreparedStatement stmt;

	 public Conection() {
		 try {
			   Class.forName("oracle.jdbc.OracleDriver");
			   conn = (Connection)DriverManager.getConnection(url, user, pass);
			   
			   if (conn != null) {
			    System.out.println("Conexion a base de datos "+url+" . . . Ok");
			   }
			   
			  } catch(SQLException ex) {
			   System.out.println("Hubo un problema al intentar conecarse a la base de datos"+url);
			   
			  } catch(ClassNotFoundException ex) {
			   System.out.println("Error... "+ex);
			  }  
	 }
	 
	 /**
	  * Consultas a la Base de Datos.
	  * @param _query
	  * @return
	  */
	 public ResultSet getQuery() {
	  Statement state = null;
	  ResultSet resultado = null;
	  
	  try {
	   state = (Statement) conn.createStatement();
	   resultado = state.executeQuery("select * from Usuario");
	  } catch(SQLException e) {
	   e.printStackTrace();  
	  }
	  
	  return resultado;
	 }
	  
	  
	 /**
	  * Modificacion a la Base de Datos.
	  * @param _query
	 * @throws SQLException 
	  */
	 public void cambiarContrasena(Usuario usuario) throws Exception {
		 String strSQL ="UPDATE  Usuario SET " + "contrasena = '" + usuario.getContrasena() + "' WHERE usuario = '"
					+ usuario.getNickName()+"'";
		 try {
				
				PreparedStatement prepStmt = conn.prepareStatement(strSQL);
				prepStmt.executeUpdate();
				prepStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
	 }


	 public void insertar(Usuario usuario) throws Exception  {
		 stmt = conn.prepareStatement("INSERT INTO Usuario VALUES (?,?,?,?)");
	     stmt.setString(1,usuario.getApellido());
	     stmt.setString(2,usuario.getNombre());
	     stmt.setString(3,usuario.getNickName());
	     stmt.setString(4,usuario.getContrasena());
	                     
	     int retorno = stmt.executeUpdate();
	     if (retorno<0) {
	    	 throw new Exception(":(");
	     } 
	     stmt.close();
		
	 }
}
