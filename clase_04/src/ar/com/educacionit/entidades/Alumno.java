package ar.com.educacionit.entidades;

public class Alumno extends Persona {
	//aTRIBUTOS (propiedades)
	private int legajo;
	
	private static int contadorAlumno = 0;
	
	public static int getContadorAlumno() {
		return contadorAlumno;
	}
	
	//constructor parametrizado sin legajo
	public Alumno(String nombre, int edad) {
		super(nombre, edad);
		incrementarContadorAlumno();
		
	}
	
	//constructor parametrizado con legajo
	public Alumno(String nombre, int edad, int legajo) {
		super(nombre, edad);
		this.legajo = legajo;
		incrementarContadorAlumno();
	}
	
	private static void incrementarContadorAlumno() {
		contadorAlumno++;
	}
	
	
	//Metodos getters y stters
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	// Sobreescribe el metodo abstracto de persona
	//Alumno es una clase concreta q necesita del metodo getRol funcional

	@Override
	public String getRol() {
		return "Alumno";
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", toString()=" + super.toString() + "]";
	}
	
	

	

	
	
	
	
}
