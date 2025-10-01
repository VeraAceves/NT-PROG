package tema1;

import java.util.Scanner;

public class Libro5 {

	public static void main(String[] args) {

		// Variables
		int base, altura;

		Scanner sc = new Scanner(System.in);

		// Input
		System.out.println("Dime la base");
		base = sc.nextInt();

		System.out.println("Dime la altura");
		altura = sc.nextInt();

		// Condicion
		if (altura <= 0 || base <= 0) {

			System.out.println("No se puede operar con números negativos");

		} else {
			System.out.println("El área del triángulo es " + base * altura);

		}
		//Cerrar
		sc.close();
	}

}
