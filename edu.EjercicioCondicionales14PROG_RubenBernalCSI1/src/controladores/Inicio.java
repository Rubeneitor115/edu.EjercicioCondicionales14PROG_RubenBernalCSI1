/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 071024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 071024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero1, numero2, numero3;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito los números por consola y los guardo en sus variables
		System.out.println("Introduzca el primer número: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		numero2 = sc.nextInt();
		System.out.println("Introduzca el tercer número: ");
		numero3 = sc.nextInt();
		
		//Ordenos los números de menor a mayor
		if(numero1<numero2 && numero1<numero3 && numero2 < numero3) {
			System.out.println("Orden de menor a mayor: " + numero1 + ", " + numero2 + ", " + numero3);
		}else if(numero1<numero2 && numero1<numero3 && numero2>numero3) {
			System.out.println("Orden de menor a mayor: " + numero1 + ", " + numero3 + ", " + numero2);
		}else if(numero2<numero1 && numero2<numero3 && numero1<numero3) {
			System.out.println("Orden de menor a mayor: " + numero2 + ", " + numero1 + ", " + numero3);
		}else if(numero2<numero1 && numero2<numero3 && numero1>numero3) {
			System.out.println("Orden de menor a mayor: " + numero2 + ", " + numero3 + ", " + numero1);
		}else if(numero3<numero1 && numero3<numero2 && numero1<numero2) {
			System.out.println("Orden de menor a mayor: " + numero3 + ", " + numero1 + ", " + numero2);
		}else if(numero3<numero1 && numero3<numero2 && numero1>numero2) {
			System.out.println("Orden de menor a mayor: " + numero3 + ", " + numero2 + ", " + numero1);
		}

	}

}