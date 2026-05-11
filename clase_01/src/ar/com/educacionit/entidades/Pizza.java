package ar.com.educacionit.entidades;

public class Pizza {
	short id;
	String nombre;
	String tamanio;
	String ingredientes;
	String precio;
	
	//Constructor por defecto
	public Pizza() {
		this.id = 999;
	}
	
	//Constructor parametrizado
	public Pizza(String nombre, String tamanio, String ingredientes, String precio) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.ingredientes = ingredientes;
		this.precio = precio;
	}
	//Sobrescribo el metodo toString de object
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", nombre=" + nombre + ", tamanio=" + tamanio + ", ingredientes=" + ingredientes
				+ ", precio=" + precio + "]";
	}



	
	
	
	
}
