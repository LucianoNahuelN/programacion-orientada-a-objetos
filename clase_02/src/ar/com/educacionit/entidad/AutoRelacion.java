package ar.com.educacionit.entidad;

import java.util.Arrays;

public class AutoRelacion {
	
	//Atributos o propiedades
	String marca;
	String color;
	String modelo;
	int velocidad;
	// Relacion simple
	Motor motor; // tipo dato clase
	// Relacion multiple
	Rueda ruedas[]; //coleccion ruedas en un array

	public AutoRelacion(String marca, String color, String modelo, int velocidad, Motor motor) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.motor = motor;
	}
	//Constructor parametrizado
	public AutoRelacion(String marca, String color, String modelo, int velocidad, Motor motor, Rueda[] ruedas) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.motor = motor;
		this.ruedas = ruedas;
	}
	
	public AutoRelacion(String marca, String color, String modelo, int velocidad, int cilindrada, int caballos, String combustible) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.motor = new Motor(cilindrada, caballos, combustible);
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
		return "AutoRelacion [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", velocidad=" + velocidad
				+ ", motor=" + motor + ", ruedas=" + Arrays.toString(ruedas) + "]";
	}
	
	
	
}
