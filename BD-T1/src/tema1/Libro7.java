package tema1;

import java.util.Scanner;

public class Libro7 {

	public static void main(String[] args) {
		// suma de numeros aleatorios entre 1 y 99

		// Variables

		int sumaCorrecta;
		int sumaUsuario;
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);

		// Generar numeros aleatorios
		
		num1 = (int) (Math.random() * 99) + 1;
		num2 = (int) (Math.random() * 99) + 1;

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
