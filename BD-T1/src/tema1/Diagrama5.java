package tema1;

import java.util.Scanner;

public class Diagrama5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		int radio;
		double longCir;
		double area;
		double vol;
		final double PI = 3.14;

		Scanner sc = new Scanner(System.in);

		// Leer input
		System.out.println("Dime el radio del circulo");
		radio = sc.nextInt();

		// Operaciones
		longCir = 2 * PI * radio;
		area = PI * radio * radio;
		vol = 4 / 3 * PI * Math.pow(radio, 3);

		// Imprimir por pantalla

		System.out.println("La longitud de la circunferencia es " + longCir);
		System.out.println("El area es " + area);
		System.out.println("El volumen es " + vol);

		sc.close();

	}

}
