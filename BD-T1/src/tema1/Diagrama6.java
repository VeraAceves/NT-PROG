package tema1;

import java.util.Scanner;

public class Diagrama6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		double precioPagado;
		double precioOriginal;
		double precioDescuento;
		double porcentaje;
		
		Scanner sc = new Scanner(System.in);
		
		//Leer input
		System.out.println("Dame el precio del articulo que has pagado");
		precioPagado = sc.nextDouble();
		
		System.out.println("Dime el precio original articulo");
		precioOriginal = sc.nextDouble();
		
		//Operaciones
		precioDescuento = precioPagado - precioOriginal;
		porcentaje = (100 * precioDescuento) / precioPagado;		
		
		//Imprimir pantalla
		System.out.println("El descuento que se ha aplicado es del " + Math.abs(porcentaje) + "%");
		
		sc.close();
		
	}

}
