package ar.com.educacionit.test;

import ar.com.educacionit.entidades.Alumno;
import ar.com.educacionit.entidades.Pizza;

public class Test {

	public static void main(String[] args) {
		// Punto de entrada de la aplicacion JAVA
		System.out.println("Hola mundo");
		
		//a partir de una clase creo un objeto, instancio una clase
		Alumno a1 = new Alumno("Luis", "2-44343-6");
		System.out.println(a1.toString());
		
		System.out.println(new Alumno("Pedro", "5-434243-6"));
		
		Alumno a2;
		a2 = new Alumno("Laura", "4-343673-6");
		System.out.println(a2.toString());
		
		Alumno a3 = new Alumno("Ailen", "3-44343-3");
		System.out.println(a3.toString());
		
		Alumno a4;
		a4 = new Alumno("Roberto", "6-343673-7");
		System.out.println(a4.toString());
		
		// constructor por defecto devuelve null o lo que le diga como vacio
		Alumno a5 = new Alumno();
		System.out.println(a5.toString());
		
		a1.saludar();
		a2.saludar();
		a3.saludar();
		
		//PIZZA
		//Creo dos objetos a partir de la clase
		Pizza p1 = new Pizza(); 
		Pizza p2 = new Pizza(); 
		
		System.out.println(p1);
		System.out.println(p2);
		
		Pizza p3 = new Pizza("Muzza", "Grande", "Harina, Agua, Sal, Salsa de tomate, Queso, Aceitunas, Oregano, Aceite","18.000");
		System.out.println(p3);
	}

}
