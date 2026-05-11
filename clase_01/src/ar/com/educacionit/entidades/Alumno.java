package ar.com.educacionit.entidades;

public class Alumno {
	//atributos (caracteristicas)
	String nombre;
	String legajo;
	//Constructor por defecto
	public Alumno() {
		this.nombre = "";
	}
	//Constructor parametrizado
	public Alumno(String nombre, String legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	//metodos (acciones)
	public void saludar(){
		System.out.println("Hola soy " + nombre);
		}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", legajo=" + legajo + "]";
	}
	
	
}
