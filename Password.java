
public class Password {
	private int longitud;
	private String contraseña;
	
	// constructores
	
	final static int LONG = 8;
	
	public Password() {
		this(LONG,"");
	}
	
	public Password(int longitud, String contraseña) {
		super();
		this.longitud = longitud;
		this.contraseña = generarContrasena(LONG);
	}
	
	// Métodos
	
	public static String generarContrasena(int longitud) {
		String posibilidades = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String contrasena = " ";
		 
		for (int i = 0; i < longitud; i++) {
			contrasena += (posibilidades.charAt((int)(Math.random() * posibilidades.length())));
		}
 
		return contrasena;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	} 
	
	
}
