package tema1;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		
		//Leer
		System.out.println("Introduce un número");
		num = sc.nextInt();
		
		if (num >= 0) 
			
			System.out.println("El numero es positivo");	
				
		else 
			System.out.println("El numero es negativo");
		
		sc.close();
	}

}
