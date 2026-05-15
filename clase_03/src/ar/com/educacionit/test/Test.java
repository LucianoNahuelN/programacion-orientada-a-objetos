package ar.com.educacionit.test;

import java.util.ArrayList;

import ar.com.educacionit.entidades.Administrador;
import ar.com.educacionit.entidades.Alumno;
import ar.com.educacionit.entidades.Corazon;
import ar.com.educacionit.entidades.Dinosaurio;
import ar.com.educacionit.entidades.Pata;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 03");
		
		Dinosaurio dino1 = new Dinosaurio("T-Rex", "Saurisquios", true, null, new ArrayList<Pata>());
		
		
		// Pilares del paradigma orientado a objetos(visibilidad) -> encapsulamiento
		//al colocar atributos en privado ya no puedo acceder ni modificar
		/*System.out.println(dino1.nombre);
		System.out.println(dino1.especie);
		System.out.println(dino1.esCarnivoro);
		
		dino1.nombre = "Maxi";
		System.out.println(dino1.nombre);
		System.out.println(dino1); */
		
		System.out.println(dino1);
		System.out.println(dino1.getNombre());
		dino1.setNombre("MAxi", "estandar");
		System.out.println(dino1.isEsCarnivoro());
		dino1.setNombre("MAxi", "Admin");
		System.out.println(dino1);
		
		//corazon (ralacion multiple)
		
		Corazon cora1 = new Corazon(300);
		System.out.println(cora1);
		cora1.latir();
		dino1.setCorazon(cora1);
		System.out.println(dino1);
		//dino1.setPatas(null);
		
		// patas (ralacion multiple)
		
		Pata p1 = new Pata("delantera izquierda", false);
		Pata p2 = new Pata("delantera derecha", false);
		Pata p3 = new Pata("delantera izquierda", true);
		Pata p4 = new Pata("delantera derecha", true);
		
		dino1.agregarPata(p1);
		dino1.agregarPata(p2);
		dino1.agregarPata(p3);
		dino1.agregarPata(p4);
		System.out.println(dino1);
		
		dino1.caminar();
		
		//Herencia
		
		Administrador admin1 = new Administrador("Pedro", "pedro@gmail.com", true);
		Alumno alum1 = new Alumno("Juan", "juan@gmail.com", "5-54547-2");
		System.out.println(alum1);
		
		
		
	}

}
