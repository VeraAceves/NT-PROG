package ejercicios;

import java.util.Scanner;

public class N3Ej13V3 {

	public static void main(String[] args) {
		/*
		 * Programa donde el usuario piensa un número del 1 al 100 y el ordenador
		 * intenta adivinarlo. El usuario debe indicar si el número del ordenador es
		 * mayor, menor o igual al número pensado.
		 */

		// Variables
		int min = 1;
		int max = 100;
		int intento;
		int respuesta = 0;
		boolean correcto = true;

		Scanner sc = new Scanner(System.in);

		// Entrada

		System.out.println("Piensa un número del 1 al 100 y lo averiguare.");
		System.out.println("Responde con:");
		System.out.println("1: Tu número es mayor");
		System.out.println("2: Tu número es menor");
		System.out.println("3: He acertado");

		while (correcto) {

			intento = (int) (Math.random() * (max - min + 1)) + min;

			System.out.println("¿Es " + intento + "?");

			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				min = intento + 1;
				break;
			case 2:
				max = intento - 1;
				break;
			case 3:
				correcto = false;
				System.out.println("¡Yay! He adivinado tu número :)");
				break;
			default:
				System.out.println("Entrada no válida. Debes escribir 1, 2 o 3.");
				break;
			}

		}
		sc.close();
	}

}
