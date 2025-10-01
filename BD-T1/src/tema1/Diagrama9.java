package tema1;

import java.util.Scanner;

public class Diagrama9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		//Leer input
		System.out.println("Dame tu edad");
		edad = sc.nextInt();
		
		
		//Condicion
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");			
		}

		else {
			System.out.println("No eres mayor de edad");
		}
			
		
		sc.close();
	}

}
