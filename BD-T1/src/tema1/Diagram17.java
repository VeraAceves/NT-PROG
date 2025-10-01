package tema1;

import java.util.Scanner;

public class Diagram17 {

	public static void main(String[] args) {

		// Variables

		int hh;
		int min;
		int ss;

		Scanner sc = new Scanner(System.in);

		// Leer input

		System.out.println("Dime la hora");
		hh = sc.nextInt();

		System.out.println("Dime los minutos");
		min = sc.nextInt();

		System.out.println("Dime los segundos");
		ss = sc.nextInt();

		// Añado un segudo y anido las condiciones

		ss++;

		if (ss >= 60) {
			ss = 00;
			min++;
			if (min >= 60) {
				min = 00;
				hh++;
				if (hh >= 24) {
					hh = 00;
					System.out.println("La hora más un segundo es " + hh + ":" + min + ":" + ss);
				} else {
					System.out.println("La hora más un segundo es " + hh + ":" + min + ":" + ss);
				}
			} else {
				System.out.println("La hora más un segundo es " + hh + ":" + min + ":" + ss);
			}
		} else {
			System.out.println("La hora más un segundo es " + hh + ":" + min + ":" + ss);
		}

		sc.close();

	}

}
