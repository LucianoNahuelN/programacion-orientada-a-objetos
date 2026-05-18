package ar.com.educacionit.entidades;

public class Materia {
	//Atributos o propiedades
	private String nombre;
	private Docente docente; //relacion simple
	
	//Metodo constructor parametrizado
	public Materia(String nombre, Docente docente) {
		this.nombre = nombre;
		this.docente = docente;
	}

	//Getters 
	public String getNombre() {
		return nombre;
	}

	public Docente getDocente() {
		return docente;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", docente=" + docente + "]";
	}
	
	
	
	
}
