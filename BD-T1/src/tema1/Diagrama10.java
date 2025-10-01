package tema1;

import java.util.Scanner;

public class Diagrama10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int num1;
		int num2;

		
		Scanner sc = new Scanner(System.in);
		
		//Leer input
		System.out.println("Dame un numero");
		num1 = sc.nextInt();
		
		System.out.println("Dame otro numero");
		num2 = sc.nextInt();
		
		//Condicion
		
		if (num2 == 0) {
			System.out.println("No se puede dividir entre 0");			
		}

		else {
			int suma;
			int resta;
			int mult;
			float div;
			
			//Operaciones
			suma = num1 + num2;
			resta = num1 - num2;
			mult = num1 * num2;
			div = num1 / num2;
			
			//Imprimir
			System.out.println("La suma es " + suma);
			System.out.println("La resta es " + resta);
			System.out.println("La multiplicacion es " + mult);
			System.out.println("La división es " + div);
			
		}
			
		
		sc.close();
	}

}
