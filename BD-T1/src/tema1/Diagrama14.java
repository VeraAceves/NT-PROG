package tema1;

import java.util.Scanner;

public class Diagrama14 {

	public static void main(String[] args) {
		
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
		
			if (num1 == num2) {
				System.out.println("Son iguales");
				
			} else if (num1 > num2){
				System.out.println("El mayor es " + num1);
				
			} else {
				System.out.println("El mayor es " + num2);
				
			}
		
		sc.close();
	}
	

}
