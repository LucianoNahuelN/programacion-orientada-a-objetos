package ar.com.educacionit.entidades;

public class Alumno extends Usuario {
	
	private String legajo;
	
	public Alumno(String nombre, String correo, String legajo) {
		super(nombre, correo); //se crea instancia usuario
		this.legajo = legajo;
		
	}
	
	public void inscribirseCurso() {
		//System.out.println(this.nombre + " se inscribio a un curso");
		System.out.println(super.getNombre() + " se inscribio a un curso");
	}
	
}
