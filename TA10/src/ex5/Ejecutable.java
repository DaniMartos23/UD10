package ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

import Excepciones.miExcepcion;

public class Ejecutable {

	public static void ejecutaDemo() {
		// método que ejecuta la demo
		int contrasena;
		boolean comp=true;
		Password[] contras = null;
		Scanner sc=new Scanner(System.in);
		do {
			try {
				System.out.print("Entra tamano del array de contrasenas: ");
				contrasena=sc.nextInt();
				if(contrasena<=0) throw new miExcepcion(4);
				contras=new Password[contrasena];
				comp=false;
			}catch(miExcepcion e) {
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.out.println("El valor entrado no es numerico");
			}
		}while(comp);
		
		
		visualizaTodo(sc,contras);
		sc.close();
		
		
	}

	private static void visualizaTodo(Scanner sc, Password[] contras) {
		// TODO Auto-generated method stub
		int longitud = 0;
		boolean[] fuerte= new boolean[contras.length];
		boolean comp=true;
		do {
			try {
				System.out.print("Entra longitud de las contrasenas: ");
				longitud=sc.nextInt();
				if(longitud<=0) throw new miExcepcion(4);
				comp=false;
			}catch(miExcepcion e) {
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.out.println("El valor entrado no es numerico");
			}
		}while(comp);
		
		for(int i=0;i<contras.length;i++) {
			contras[i]=new Password(longitud);
			fuerte[i]=contras[i].esFuerte();
			System.out.println(contras[i].getContrasena()+" "+fuerte[i]);
		}
	}

	
	

}
