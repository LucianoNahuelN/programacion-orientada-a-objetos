package ar.com.educacionit.entidades;

public abstract class Persona {
	//Atributos o propiedades
	//de instancia
	private String nombre;
	private int edad;
	//Atributos de clase
	private static int contadorPersona = 0;
	
	public static int getContadorPersona() {
		return contadorPersona;
	}
	
	
	//Metodo constructor parametrizado
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
		contadorPersona++;
		//si quiero acceder a un atributo de instancia uso el this
		//si quiero acceder a un atributo de clase(estatico) no uso this
	}

	//Metodos getters
	
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}
	
	//Metodo abstracto
	
	public abstract String getRol();

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
