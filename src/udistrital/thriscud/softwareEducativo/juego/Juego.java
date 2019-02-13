package udistrital.thriscud.softwareEducativo.juego;
/**
 * fecha: 13.2.19
 * @author Sebasti�n Mora
 *
 */
public class Juego {
	//------------------Atributos------------------------
	
	/**
	 * Atributo tipo string, donde se mantendra el nombre local del juego
	 */
	private String nombre;
	
	/**
	 * Atributo tipo string, donde se encontrara una breve descripci�n del juego
	 */
	private String descripcion;
	
	/**
	 * Atributo tipo long, donde se guardara el m�ximo puntaje que se haya obtenido en el juego
	 */
	private long maxPunt;
	
	/**
	 * Atributo tipo String, donde se mantendra el nombre del usuario correspondiente al puntaje m�ximo obtenido
	 */
	private String userName;
	//------------------Constructores--------------------
	
	/**
	 * Constructor del juego con parametros utilizados para obtener los atributos
	 * @param nombre: Nombre del juego en cuesti�n
	 * @param descripcion: Descripci�n del juego en cuesti�n
	 * @param maxPunt: M�ximo puntaje obtenido en el juego
	 * @param userName: Nombre del usuario al cual corresponde el m�ximo puntaje que se ha obtenido en el juego
	 */
	public Juego(String nombre, String descripcion, long maxPunt, String userName) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.maxPunt = maxPunt;
		this.userName = userName;
	}
	
	//------------------Getters and Setters-------------
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public long getMaxPunt() {
		return maxPunt;
	}
	
	public void setMaxPunt(long maxPunt) {
		this.maxPunt = maxPunt;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//------------------M�todos-----------------------
	/**
	 * M�todo que lanza el juego escogido
	 */
	public void Jugar() {
		//Es necesario ver como se trataran los juegos dentro del programa
	}
}
