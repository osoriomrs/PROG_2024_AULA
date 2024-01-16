package aula;

import java.io.PrintStream;
import java.util.Arrays;

public class Aula {
	
	private int capacidad;
	private int alumnos[];
	private int cantidadAlumnos;
	
	public Aula(int capacidad) {
		
		this.capacidad=capacidad;
		this.cantidadAlumnos=0;
		this.alumnos=new int[capacidad];
	}
	public void agregarAlumnos() {
		if (cantidadAlumnos < capacidad) {
			cantidadAlumnos++;
			System.out.println("Alumno agregado al aula.");
		} else {
			System.out.println("El aula está llena, no se puede agregar más alumnos.");
		}				
				
				
			
		}
		
	@Override
	public String toString() {
		return "Aula [capacidad=" + capacidad + "]";
	}
		
		
			
		
	
	
	
	
	
	




	
}
