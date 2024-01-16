package aula;

import java.util.Arrays;
import java.util.Scanner;

public class StartAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		Aula aula=new Aula(5);
		System.out.println(aula);
		
		 Alumnos alumno = new Alumnos("Juan");
		 System.out.println(alumno);
		 aula.agregarAlumnos();
		 
		 
		 Alumnos alumno2=new Alumnos("Sergio");
		 System.out.println(alumno2);
		 aula.agregarAlumnos();
		 
		 Alumnos alumno3=new Alumnos("Julian");
		 System.out.println(alumno3);
		 aula.agregarAlumnos();
		 
		 Alumnos alumno4=new Alumnos("María");
		 System.out.println(alumno4);
		 aula.agregarAlumnos();
		 
		 Alumnos alumno5=new Alumnos("Carla");
		 System.out.println(alumno5);
		 aula.agregarAlumnos();
		 
		 Alumnos alumno6=new Alumnos("Paula");
		 System.out.println(alumno6);
		 aula.agregarAlumnos();
		 
		 
		 
		 
		 
		 
        
        
		
	}

	}


