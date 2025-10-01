package tema1;

import java.util.Scanner;

public class PrepExamen1V3 {

	public static void main(String[] args) {
		// Variables + scanner
		double num1;
		double num2;
		int opcion;
		boolean repNum = true;

		Scanner sc = new Scanner(System.in);

		// bucle 1
		do {
			System.out.println("Bienvenido a la Calculadora Simple.");

			System.out.println("Dame el número 1");
			num1 = sc.nextInt();

			System.out.println("Dame el número 2");
			num2 = sc.nextInt();

			System.out.println("Qué quieres hacer ahora: Suma -> 1, Resta -> 2, Multiplicación -> 3, División -> 4.");
			System.out.println("Pulsa -1 para volver al principio");
			opcion = sc.nextInt();

			// Menú con bucle

			do {
				switch (opcion) {
				case 1:
					System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));
					break;

				case 2:
					System.out.println("La resta de " + num1 + " - " + num2 + " = " + (num1 - num2));
					break;

				case 3:
					System.out.println("La multiplicación de " + num1 + " * " + num2 + " = " + (num1 * num2));
					break;

				case 4:
					if (num2 == 0) {
						System.out.println("No se puede dividir entre 0");
					} else {
						System.out.println("La división de " + num1 + " / " + num2 + " = " + (num1 / num2));
					}
					break;

				default:
					System.out.println("Opción no válida");
					break;
				}

				System.out.println(
						"Qué otra opción quieres hacer: Suma -> 1, Resta -> 2, Multiplicación -> 3, División -> 4.");
				System.out.println("Pulsa -1 para volver al principio");
				opcion = sc.nextInt();

			} while (opcion != -1);

		} while (repNum);
		
		// Cerrar
		System.out.println("Hasta luego!");
		sc.close();

	}

}
