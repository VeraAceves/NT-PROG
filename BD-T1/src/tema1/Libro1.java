package tema1;

import java.util.Scanner;

public class Libro1 {

	public static void main(String[] args) {
		// numero entre 1000 y 9999 capicua
		// Variables
		int numInput;
		int millar, centena, decena, unidad;

		Scanner sc = new Scanner(System.in);

		// Leer input
		System.out.println("Dime un numero entre 1000 y 9999. Pulsa -1 para salir");
		numInput = sc.nextInt();

		// Bucle con condicion
		
		while (numInput != -1) {
			
			if (numInput >= 1000 && numInput <= 9999) {

				millar = numInput / 1000;
				centena = (numInput / 100) % 10;
				decena = (numInput / 10) % 10;
				unidad = numInput % 10;

				if (millar == unidad && centena == decena) {
					System.out.println(numInput + " es un número capicúa.");
				} else {
					System.out.println(numInput + " no es un número capicúa.");
				}

			} else {
				System.out.println("El número no es válido");
			}
			System.out.println("Dime otro número");
			numInput = sc.nextInt();
		}
		

		// Cerrar
		System.out.println("Hasta luego!");
		sc.close();
	}

}
