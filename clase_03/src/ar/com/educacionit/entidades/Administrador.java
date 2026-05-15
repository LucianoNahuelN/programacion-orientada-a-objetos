package ar.com.educacionit.entidades;

public class Administrador extends Usuario {
	
	private boolean isAdministrator;
	
	public Administrador(String nombre, String correo, boolean isAdmin) {
		super(nombre, correo);
		this.isAdministrator = isAdmin;
	
	}

	public void crearUsuario() {
		System.out.println("Admin crando usuario...");
	}
	
}
