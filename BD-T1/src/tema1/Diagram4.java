package tema1;

import java.util.Scanner;

public class Diagram4 {

	public static void main(String[] args) {
		// Variables
		int x;
		int y;
		int suma;
		int resta;
		int mult;
		double div;
		
		Scanner sc = new Scanner(System.in);		//sc = scanner
		
		
		//Leer el input
		System.out.println("Dame x");
		x = sc.nextInt();
		
		System.out.println("Dame y");
		y = sc.nextInt();
		
		
		//Operaciones
		suma = x + y;
		resta = x - y;
		mult = x * y;
		div = x / y;
		
		
		//Mostrar resultados
		
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		System.out.println("La multiplicacion es " + mult);
		System.out.println("La división es " + div);

		//Cerrar escaner
		sc.close();

	}

}
