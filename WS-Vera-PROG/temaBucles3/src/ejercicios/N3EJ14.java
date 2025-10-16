package ejercicios;

import java.util.Scanner;

public class N3EJ14 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que dada una cantidad de euros que el usuario introduce
		 * por teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán
		 * necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200,
		 * 100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible.
		 */
		// Variables
		int total;
		int numBill;
		int billete = 500;

		Scanner sc = new Scanner(System.in);

		// Entrada

		System.out.println("Dime el total de euros (divisible entre 5) y te daré el cambio");
		total = sc.nextInt();

		// Bucle

		while (total > 0) {
			numBill = total / billete;
			total = total % billete;

			if (numBill > 0) {
				System.out.println(numBill + " billetes de " + billete);
			}

			switch (billete) {
			case 500:
				billete = 200;
				break;
			case 200:
				billete = 100;
				break;
			case 100:
				billete = 50;
				break;
			case 50:
				billete = 20;
				break;
			case 20:
				billete = 10;
				break;
			case 10:
				billete = 5;
				break;
			default:
				break;
			}

		}

		// Salida

		sc.close();

	}

}
