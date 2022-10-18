package ex3;
import java.util.Random;

import Excepciones.miExcepcion;
public class ParImpar {
	
	public static final Random rdm= new Random();
	private int random;
	
	public ParImpar() {
		this.random= generaRandom();
	}

	private int generaRandom() {
		//m�todo que genera n�mero aleatorio
		int rand=rdm.nextInt(999);
		System.out.println("Generando numero aleatorio...");
		System.out.println("El n�mero aleatorio generado es: "+rand);
		
		return rand;
	}

	public void ejecutaPrograma() {
		// M�todo que ejecuta el programa que comprueba si es par o impar
		
		try {
			if(this.random%2==0) throw new miExcepcion(1);
			else throw new miExcepcion(2);
		}catch(miExcepcion e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
