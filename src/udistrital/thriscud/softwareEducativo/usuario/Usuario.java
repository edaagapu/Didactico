package udistrital.thriscud.softwareEducativo.usuario;
/**
 * fecha: 11.2.19
 * @author anfer
 *
 */
public class Usuario {

	//----------------Atributos-------------------
	
	/**
	 * Atributo tipo String en el que se tendra el registro local del nombre del usuario
	 */
	protected String nombre;
	
	/**
	 * Atributo tipo String en el que se tendrá el registo del nickName del usuario
	 */
	protected String nickName;
	/**
	 * Atributo tipo String en el que se tendra el registro local del APELLIDO
	 del usuario
	 */
	private String apellido;
	
	/**
	 * Atributo tipo String en el que se tendrá el registro de la contrasena del usuario.
	 */
	private String contrasena;
	
	
	//TODO agregar conector BD
	
	//----------------Constructores-------------------
	
	/**
	 * Constructor con paramentros a usarse para registro de usuario
	 * @param nombre Nombre del usuario a registrar.
	 * @param apellido Apelllido del usuario a registrar.
	 * @param nickName Nombre de Usuario del usuario a registrar.
	 * @param contrasena Contrasena del usuario a registrar.
	 */
	public Usuario(String nombre, String apellido, String nickName, String contrasena){
		this.nombre = nombre;
		this.apellido = apellido;
		this.nickName = nickName;
		this.contrasena = contrasena;
	}
	
	//----------------Getters y Setters -------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContrasena() {
		return contrasena;
	}

	
	
	//----------------Métodos -------------------
	/**
	 * Este método es el encargado de guardar los datos si estos han sido cambiados
	 */
	public void guardarDatos(){
		// TODO Agregar cuando se tenga base de datos
	}
	
	/**
	 * Método que permite modificar la contrasena
	 * @param contrasenaActual Contrasena Actual del usuario.
	 * @param contrasenaNueva Contrasena por a cuál se va a cambiar
	 * @throws Exception Si la contrasena actual no coincide con la contrasena registrada del usuario
	 */
	public void cambiarContrasena(String contrasenaActual, String contrasenaNueva) throws Exception{
		if (contrasenaActual.equals(this.contrasena)){
			contrasena = contrasenaNueva;
			guardarDatos();
		}
		else{
			throw new Exception("La contrasena Actual no coincide.");
		}
	}
	
	/**
	 * Cambia la contrasena por medio del nombre de usuari ( si no se sabe la contrasena)
	 * @param nickName Nombre del usuario registrado
	 * @param contrasenaNueva Contrasena con la cual se desea cambiar
	 * @throws Exception si el nombre de usuario no está registrado en la base de datos.
	 */
	public void cambiarContrasenaPorUsuario(String nickName, String contrasenaNueva) throws Exception{
		if (nickName.equals(this.nickName)){
			contrasena = contrasenaNueva;
			guardarDatos();
		}
		else{
			throw new Exception("El nombre de usuario no está registrado.");
		}
	}
}

