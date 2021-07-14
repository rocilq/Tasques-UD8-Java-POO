
public class Persona {
	// Atributos
	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private int peso;
	private int altura;
	
	// Constantes
	
	final static char HOMBRE = 'h';
	
	// Constructores
	
	public Persona() {
		this(" ",0," ",HOMBRE,0,0);
	}
	
	public Persona(String nombre, int edad, String DNI, char sexo, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
	
	
	
	
}
