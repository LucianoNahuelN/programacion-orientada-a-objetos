package ar.com.educacionit.entidad;

public class Cliente {
	int id;
	String nombre;
	String email;
	boolean activo = true;
	
	public void presentarse() {
		System.out.println("Hola tarolas");
	}
	
	public Cliente(int id, String nombre, String email, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.activo = activo;
	}
	
	public Cliente() {
		
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email + ", activo=" + activo + "]";
	}

	
	
	
}
