package tema1;

import java.util.Scanner;

public class Libro4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		String texto = "";

		System.out.print("Introduce un número entre 1 y 99: ");
		numero = sc.nextInt();

		if (numero <= 15) {
			switch (numero) {
			case 1:
				texto = "uno";
				break;
			case 2:
				texto = "dos";
				break;
			case 3:
				texto = "tres";
				break;
			case 4:
				texto = "cuatro";
				break;
			case 5:
				texto = "cinco";
				break;
			case 6:
				texto = "seis";
				break;
			case 7:
				texto = "siete";
				break;
			case 8:
				texto = "ocho";
				break;
			case 9:
				texto = "nueve";
				break;
			case 10:
				texto = "diez";
				break;
			case 11:
				texto = "once";
				break;
			case 12:
				texto = "doce";
				break;
			case 13:
				texto = "trece";
				break;
			case 14:
				texto = "catorce";
				break;
			case 15:
				texto = "quince";
				break;
			}
		} else if (numero < 20) {
			int unidad = numero - 10;
			switch (unidad) {
			case 1:
				texto = "dieciuno";
				break;
			case 2:
				texto = "diecidos";
				break;
			case 3:
				texto = "diecitres";
				break;
			case 4:
				texto = "diecicuatro";
				break;
			case 5:
				texto = "diecicinco";
				break;
			case 6:
				texto = "dieciseis";
				break;
			case 7:
				texto = "diecisiete";
				break;
			case 8:
				texto = "dieciocho";
				break;
			case 9:
				texto = "diecinueve";
				break;
			}
		} else if (numero == 20) {
			texto = "veinte";
		} else if (numero < 30) {
			int unidad = numero - 20;
			switch (unidad) {
			case 1:
				texto = "veintiuno";
				break;
			case 2:
				texto = "veintidos";
				break;
			case 3:
				texto = "veintitres";
				break;
			case 4:
				texto = "veinticuatro";
				break;
			case 5:
				texto = "veinticinco";
				break;
			case 6:
				texto = "veintiseis";
				break;
			case 7:
				texto = "veintisiete";
				break;
			case 8:
				texto = "veintiocho";
				break;
			case 9:
				texto = "veintinueve";
				break;
			}
		} else {
			int decena = numero / 10;
			int unidad = numero % 10;

			switch (decena) {
			case 3:
				texto = "treinta";
				break;
			case 4:
				texto = "cuarenta";
				break;
			case 5:
				texto = "cincuenta";
				break;
			case 6:
				texto = "sesenta";
				break;
			case 7:
				texto = "setenta";
				break;
			case 8:
				texto = "ochenta";
				break;
			case 9:
				texto = "noventa";
				break;
			}

			if (unidad != 0) {
				texto += " y ";
				switch (unidad) {
				case 1:
					texto += "uno";
					break;
				case 2:
					texto += "dos";
					break;
				case 3:
					texto += "tres";
					break;
				case 4:
					texto += "cuatro";
					break;
				case 5:
					texto += "cinco";
					break;
				case 6:
					texto += "seis";
					break;
				case 7:
					texto += "siete";
					break;
				case 8:
					texto += "ocho";
					break;
				case 9:
					texto += "nueve";
					break;
				}
			}
		}

		System.out.println("Número en letras: " + texto);
		sc.close();

	}

}
