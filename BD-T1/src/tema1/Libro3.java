package tema1;

import java.util.Scanner;

public class Libro3 {

	public static void main(String[] args) {
		// Calcular comida para animales
		// Variables
		double comidaDiaria;
		int numAnimales;
		double kgAnimal;

		Scanner sc = new Scanner(System.in);

		// Input
		System.out.println("Cuánta comida compras?");
		comidaDiaria = sc.nextDouble();

		System.out.println("Cuántos animales tienes?");
		numAnimales = sc.nextInt();

		System.out.println("Cuánto come cada animal?");
		kgAnimal = sc.nextDouble();
		
		// Condicion
		if (comidaDiaria >= numAnimales * kgAnimal) {
			System.out.println("Sí, tienes suficiente comida");
		} else {
			if (comidaDiaria != 0) {
				System.out.println("Tienes para darle " + (comidaDiaria / numAnimales) + " Kg de comida a cada animal");
			} else {
				System.out.println("No se puede dividir entre  0");
			}
		}
		
		// Cierre
		sc.close();

	}

}
