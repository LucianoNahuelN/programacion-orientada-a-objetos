package ar.com.educacionit.test;

import java.util.Iterator;

import ar.com.educacionit.entidades.Alumno;
import ar.com.educacionit.entidades.Curso;
import ar.com.educacionit.entidades.Docente;
import ar.com.educacionit.entidades.Materia;
import ar.com.educacionit.entidades.Persona;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 04");
		
		//CLASES ABSTRACTAS
		//Le indicamos a otro desarrollador q la clase persona no es instanciable
		//Persona p1 = new Persona("Maxi", 22);
		
		Alumno alum1 = new Alumno("Juan", 22);
		System.out.println(alum1);
		alum1.setLegajo(22222);
		System.out.println(alum1);
		
		Alumno alum2 = new Alumno("Ana", 21, 33333);
		System.out.println(alum2);
		
		Docente d1 = new Docente("Roberto", 40, "Programacion");
		System.out.println(d1);
		
		Docente d2 = new Docente("Sabrina", 38, "Ingles");
		System.out.println(d2);
		
		//Materias
		Materia m1 = new Materia("Java Basico", d1);
		Materia m2 = new Materia("Ingles tecnico", d1);
		System.out.println(m1);
		System.out.println(m2);
		
		//Curso
		Curso curso = new Curso("Carrega de programacion");
		System.out.println(curso);
		
		curso.agregarAlumno(alum1);
		curso.agregarAlumno(alum2);	
		curso.agregarMateria(m1);
		curso.agregarMateria(m2);
		
		System.out.println(curso);
		
		for (Alumno alumno : curso.getAlumnos()) {
			System.out.println(alumno);
		}
		System.out.println("-------------------");
		for (Materia materia : curso.getMaterias()) {
			System.out.println(materia);
		}
		System.out.println("-------------------");
		
		for (Alumno alumno : curso.getAlumnos()) {
			System.out.println(alumno.getNombre());
			System.out.println(alumno.getEdad());
			System.out.println(alumno.getLegajo());
			System.out.println(alumno.getRol());
			System.out.println("---");
		}
		System.out.println("-------------------");
		
		System.out.println(Persona.getContadorPersona()); // 4
		
		Alumno alum3 = new Alumno("Juan", 33, 33333);
		System.out.println(alum3);
		System.out.println(Persona.getContadorPersona());
		System.out.println("-------------------");
		System.out.println(Alumno.getContadorAlumno());
		
		
	}
}
