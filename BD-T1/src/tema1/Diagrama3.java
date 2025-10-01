package tema1;

import java.util.Scanner;

public class Diagrama3 {

	public static void main(String[] args) {

		// Variables
		int lado;
		int area;

		Scanner sc = new Scanner(System.in);

		// Leer escaner
		System.out.println("Dime el lado del cuadrado");
		lado = sc.nextInt();

		// Operaciones
		area = lado * lado;

		// Imprimir

		System.out.println("El area es " + area);

		// Cerrar escaner

		sc.close();

	}

}
