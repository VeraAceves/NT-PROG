package tema1;

import java.util.Scanner;

public class Diagram16 {

	public static void main(String[] args) {

		// Variables

		int notas;

		Scanner sc = new Scanner(System.in);

		// Leer input

		System.out.println("Dime tu nota y te responderé");
		notas = sc.nextInt();

		// Condicion

		if (notas >= 9) {
			System.out.println("Congratulaciones, tienes un sobresaliente!");
		} else {
			if (notas >= 6) {
				System.out.println("Bien! Tienes un notable :)");
			} else {
				if (notas >= 5) {
					System.out.println("Bueno, tienes un bien.");
				} else {
					if (notas >= 3) {
						System.out.println("Lo siento, tienes un deficiente");
					} else {
						System.out.println("Muy deficiente!! Que has hecho??");
					}
				}
			}
		}

		sc.close();
	}

}
