package ar.com.educacionit.entidades;

public class Docente extends Persona {
	//aTRIBUTOS (propiedades)
	private String especialidad;
	
	//Metodo constructor parametrizado
	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad); //llama al constructor de persona
		this.especialidad = especialidad;
	}
	
	//Getters y setters
	public String getEspecialidad() {
		return especialidad;
	}

	@Override
	public String getRol() {
		return "Docente";
	}

	@Override
	public String toString() {
		return "Docente [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
