
public class Password {
	private int longitud;
	private String contrase�a;
	
	// constructores
	
	final static int LONG = 8;
	
	public Password() {
		this(LONG,"");
	}
	
	public Password(int longitud, String contrase�a) {
		super();
		this.longitud = longitud;
		this.contrase�a = generarContrasena(LONG);
	}
	
	// M�todos
	
	public static String generarContrasena(int longitud) {
		String posibilidades = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String contrasena = " ";
		 
		for (int i = 0; i < longitud; i++) {
			contrasena += (posibilidades.charAt((int)(Math.random() * posibilidades.length())));
		}
 
		return contrasena;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	} 
	
	
}
