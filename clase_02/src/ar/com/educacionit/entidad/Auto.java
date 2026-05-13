package ar.com.educacionit.entidad;

public class Auto {
	
	//Atributos o propiedades
	String marca;
	String color;
	String modelo;
	int velocidad;
	
	//Constructor parametrizado
	public Auto(String marca, String color, String modelo, int velocidad) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	//diferentes firmas, una recibe metodo y la vuelve distintas
	public void acelerar() {
		this.velocidad = 10;
	}
	
	public void acelerar(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelerar(int velocidad, boolean nitro) {
		if(nitro) {
			this.velocidad = velocidad * 2;
		}else {
			this.velocidad = velocidad;
		}
	}


	//Sobrescribimos el metodo toString()
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
}
