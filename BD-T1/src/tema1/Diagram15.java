package tema1;

import java.util.Scanner;

public class Diagram15 {

	public static void main(String[] args) {

		// Variables

		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);

		// Leer input

		System.out.println("Dame el numero 1");
		num1 = sc.nextInt();

		System.out.println("Dame el numero 2");
		num2 = sc.nextInt();

		System.out.println("Dame el numero 3");
		num3 = sc.nextInt();


		// Condicion

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El mayor es " + num1);
			} else {
				System.out.println("El mayor es " + num3);
			}
		} else {
			if (num2 > num3) {
				System.out.println("El mayor es " + num2);
			} else {
				System.out.println("El mayor es " + num3);
			}
			
			
			
		}
		

		sc.close();
	}

}
