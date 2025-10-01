package tema1;

import java.util.Scanner;

public class Diagram18 {

	public static void main(String[] args) {

		// Variables
		String nombre;
		int hhT;
		int tarN;
		double sN;
		double sB;
		double tasas = 0;

		Scanner sc = new Scanner(System.in);

		// Leer input
		System.out.println("Hola! Cómo te llamas?");
		nombre = sc.next();

		System.out.println("Cuántas horas has trabajado esta semana?");
		hhT = sc.nextInt();

		System.out.println("A cuánto cobras la hora?");
		tarN = sc.nextInt();

		// AL lio

		// Si las horas trabajadas son mas de 35,a partir de la hora 36 es tarN*1,5 y si
		// son menos, tarN

		if (hhT <= 35) {
			sB = hhT * tarN;
		} else {
			sB = ((hhT - 35) * (tarN * 1.5)) + 35 * tarN;
		}

		
		//Si sB > 900
		
		if (sB > 900) {
			tasas = (400 * 0.25) + (sB - 400);
		} else {
			if (sB > 500) {
				tasas = (sB - 500) * 0.25;
			}
		}
		
		//Calcular el salario neto
		
		sN = sB - tasas;
		
		//Imprimir resultado por pantalla
		
		System.out.println("Hola " + nombre + ", tu salario bruto es " + sB + "€, y después de " + tasas + "€ de tasas, tu salario neto es " + sN + "€.");
		
		sc.close();
	}

}
