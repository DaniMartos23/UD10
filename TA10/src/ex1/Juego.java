package ex1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Juego {
	private int random;
	private int contador;
	public Juego() {
		this.random=generaRandom();
		this.contador=0;
	}
	public void ejecutaJuego() {
		// método que ejecuta el juego de adivinar
		int aux=0;
		Scanner sc= new Scanner(System.in);
		boolean comp=true;
		do {
			try {
				System.out.println("Intento número "+(this.contador+1));
				System.out.print("Escribe un número entre 1 y 500: ");
				aux=sc.nextInt();
				this.contador++;
				if(aux>this.random) {
					System.out.println("El número aleatorio es menor.");
				}
				else if(aux==this.random) {
					System.out.println("FELICIDADES! HAS ACERTADO!");
					comp=false;
				}
				else {
					System.out.println("El número aleatorio es mayor.");
				}
			}catch(InputMismatchException e){
				System.out.println("El valor entrado no es númerico.");
				this.contador++;
				sc.nextLine();
			}

			
		}while(comp);
		sc.close();
		System.out.println("El número de intentos totales es de: "+this.contador);
		
	}

	private static int generaRandom() {
		// método que genera un número aleatorio entre 1 y 500
		return (int)(Math.random()*(500-1+1)+1);
	}

}
