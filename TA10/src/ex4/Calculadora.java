package ex4;
import java.util.Scanner;

import Excepciones.miExcepcion;

public class Calculadora {
	private double operador1;
	private double operador2;
	private double resultado;
	
	public Calculadora() {
	}
	
	public void ejecutaPrueba() {
		int option=0;
		Scanner sc= new Scanner(System.in);
		do {
			generaMenu();
			System.out.print("Escoge una opcion: ");
			option=Integer.parseInt(sc.nextLine());
			
			switch(option) {
				case 1:
					pideOperandos(sc);
					suma();
					break;
				case 2:
					pideOperandos(sc);
					resta();
					break;
				case 3:
					pideOperandos(sc);
					multiplica();
					break;
				case 4:
					pideOperandos(sc);
					divide();
					break;
				case 5:
					pideOperandos(sc);
					potencia();
					break;
				case 6:
					pideOperando(sc);
					raizcuadrada();
					break;
				case 7:
					pideOperando(sc);
					raizcubica();
					break;
				case 8:
					System.out.println("Saliendo....");
					break;
				default:
					System.out.println("Valor no válido.");
					break;
			}
			
		}while(option!=8);
		sc.close();
	}



	private void raizcubica() {
		//Método que calcula la raiz cubica
		try {
			System.out.println("Raiz cubica de "+this.operador1+" es igual a "+(Math.cbrt(this.operador1)));
		}catch(ArithmeticException e) {
			System.out.println("ERROR: "+e.getMessage());
		}
	}

	private void raizcuadrada() {
		//Método que calcula la raiz cuadrada
		
		try {
			if(this.operador1<0)  throw new ArithmeticException();
			this.resultado=Math.sqrt(this.operador1);
			System.out.println("Raiz cuadrada de "+this.operador1+" es igual a "+resultado);
		}catch(ArithmeticException e) {
			System.out.println("ERROR: no se puede hacer una raiz cuadrada de un numero negativo");
		}
	}

	private void potencia() {
		// Método que calcula la potencia de un valor respecto al otro
		try {
			this.resultado=Math.pow(this.operador1,this.operador2);
			System.out.println(this.operador1+"^"+this.operador2+"="+this.resultado);
		}catch(ArithmeticException e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		
	}

	private void divide() {
		// divide los valores
		try {
			if (this.operador2 == 0) {
	            throw new ArithmeticException();
	        }
			this.resultado=this.operador1/this.operador2;
			System.out.println(this.operador1+"/"+this.operador2+"="+this.resultado);
		}catch(ArithmeticException e) {
			System.out.println("ERROR: no se puede dividir por 0 ");
		}
		
	}

	private void multiplica() {
		// Multiplica los valores
		this.resultado=this.operador1*this.operador2;
		System.out.println(this.operador1+"*"+this.operador2+"="+this.resultado);
		
	}

	private void resta() {
		// Hace la resta de los valores
		System.out.println(this.operador1+"-"+this.operador2+"="+(this.operador1-this.operador2));
		
	}

	private void suma() {
		//Hace la suma de los valores
		System.out.println(this.operador1+"+"+this.operador2+"="+(this.operador1+this.operador2));
		
	}
	
	private void pideOperando(Scanner sc) {
		// Método que pide un solo operando
		boolean comp=true;
		do {
			try {
				System.out.print("Entra el operando 1: ");
				this.operador1=Double.parseDouble(sc.nextLine());
				comp=false;
			}catch(NullPointerException e) {
				System.out.println("Error: "+e.getMessage());
			}
			
		}while(comp);
	}

	private void pideOperandos(Scanner sc) {
		//método que pide por terminal los operandos para la operacion
		boolean comp=true;
		do {
			try {
				System.out.print("Entra el operando 1: ");
				this.operador1=Double.parseDouble(sc.nextLine());
				comp=false;
			}catch(NullPointerException e) {
				System.out.println("Error: "+e.getMessage());
			}
			
		}while(comp);
		comp=true;
		do {
			try {
				System.out.print("Entra el operando 2: ");
				this.operador2=Double.parseDouble(sc.nextLine());
				comp=false;
			}catch(NullPointerException e) {
				System.out.println("Error: "+e.getMessage());
			}
			
		}while(comp);
		
	}

	private void generaMenu() {
		// método que imprime el menú por pantalla
		
		System.out.println("--------------------MENU--------------------");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("5. Potencia");
		System.out.println("6. Raiz cuadrada");
		System.out.println("7. Raiz cubica");
		System.out.println("8. Salir");
	}
	
}
