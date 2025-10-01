package tema1;

import java.util.Scanner;

public class Libro8 {

	public static void main(String[] args) {
		// suma resta o producto de numeros aleatorios entre 1 y 99

		// Variables

		int operacion;
		int sumaCorrecta;
		int sumaUsuario;
		int restaCorrecta;
		int restaUsuario;
		int productoCorrecto;
		int productoUsuario;
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);

		// Generar numeros aleatorios

		num1 = (int) (Math.random() * 99) + 1;
		num2 = (int) (Math.random() * 99) + 1;

		// Generar operaciones

		operacion = (int) (Math.random() * 3);
		switch (operacion) {
			case 1:

				break;
	
			case 2:

				break;
			case 3:
				
				break;
			default:
				break;
		}
		// Operaciones

		sumaCorrecta = num1 + num2;

		System.out.println("Suma estos dos numeros: " + num1 + " + " + num2);
		sumaUsuario = sc.nextInt();

		// Bucle con condicion

		while (sumaUsuario != sumaCorrecta) {

			System.out.println("Sorry, no has acertado. Inténtalo otra vez: " + num1 + " + " + num2 + " =");
			sumaUsuario = sc.nextInt();
		}

		System.out.println("Congrats! Has acertado");

		// Cierre
		sc.close();

	}

}
