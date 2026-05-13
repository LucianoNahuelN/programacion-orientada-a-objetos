package ar.com.educacionit.test;

import ar.com.educacionit.entidad.Auto;
import ar.com.educacionit.entidad.AutoRelacion;
import ar.com.educacionit.entidad.Cliente;
import ar.com.educacionit.entidad.Motor;
import ar.com.educacionit.entidad.Rueda;
//import ar.com.educacionit.entidad.*;  TODO EN ENTIDADES ESTA IMPORTADO


public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 02");
		
		Cliente c1 = null;
		System.out.println(c1);
		c1 = new Cliente();
		
		System.out.println(c1.toString());
		
		c1.presentarse();
		
		Cliente c2 = new Cliente(1, "MAxi", "max@gmail.com", true);
		Cliente c3 = new Cliente(2, "Juliana", "juli@gmail.com", false);
		
		System.out.println(c2);
		System.out.println(c3);
		
		System.err.println("---------------------------");
		//Autos
		Auto a1 = new Auto("Toyota", "Rosa", "Corolla", 0);
		Auto a2 = new Auto("Nissan", "Negro", "Kait", 0);
		Auto a3 = new Auto("Volkswagen", "Gris", "Gol", 0);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.acelerar();
		System.out.println(a1); //10
		a1.acelerar(20);
		System.out.println(a1); //20
		a1.acelerar(30, true);
		System.out.println(a1); //60
		
		System.err.println("---------------------------");
		
		//Motor m1 = new Motor();
		Motor m2 = new Motor(3, 300, "Nafta");
		
		AutoRelacion ar1 = new AutoRelacion("Ferrari", "Roja", "Testatossa", 0, m2);
		AutoRelacion ar2 = new AutoRelacion("Porsche", "Amarilla", "Carrera 911", 0, 4, 280, "Nafta");
		System.out.println(ar1);
		System.out.println(ar2);
		
		System.err.println("---------------------------");
		Motor m3 = new Motor(2, 150, "Nafta");
		Rueda r1 = new Rueda("Michelin", 30);
		Rueda r2 = new Rueda("Michelin", 29);
		Rueda r3 = new Rueda("Michelin", 28);
		Rueda r4 = new Rueda("Michelin", 31);
		
		Rueda[] ruedas = {r1, r2, r3, r4};
		AutoRelacion ar3 = new AutoRelacion("Honda", "Negro Mate","Civic", 0, m3, ruedas);
		System.out.println(ar3);
	}

}
