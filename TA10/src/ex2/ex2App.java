package ex2;

import Excepciones.miExcepcion;

public class ex2App {

	public static void main(String[] args) {
		
		try {
			System.out.println("Mensaje mostrado por pantalla");
			System.out.print("Excepcion capturada con mensaje: ");
			throw new miExcepcion(0);
		}catch(miExcepcion e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Programa terminado");
		

	}

}
