package ar.com.educacionit.entidades;

public abstract class Usuario {
	protected String nombre;
	private String correo;
	
	
	public Usuario(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}

	public void login() {
		System.out.println(this.nombre + "inicio sesion");
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + "]";
	}
	
}
