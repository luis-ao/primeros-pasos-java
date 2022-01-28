import java.util.Scanner;

public class ValorCompra {
	
	public static void main(String[] args) {

		// si la cuenta es de menos de 1000
		// sila cuenta es de 1000 - 4999 10%
		// si la cuenta es de 5000 a 9999 20%
		// si la copra es de 10000 o más 30%

		
		System.out.println("Introduce  el valor de la compra");
		Scanner scn = new Scanner(System.in);
		double valorCompra = scn.nextDouble();
		
		
		if(valorCompra >= 1000 && valorCompra <= 4999) {
			double valorFinal1 = valorCompra * 0.9;
			System.out.println("El descuento del 10%  a " + valorCompra + " es " + valorFinal1);
		} else if(valorCompra >= 5000 && valorCompra <= 9999) {
			double valorFinal2 = valorCompra * 0.8;
			System.out.println("El descuento del 20% a " + valorCompra + " es " + valorFinal2);
		} else if (valorCompra >= 10000) {
			double valorFinal3 = valorCompra * 0.7;
			System.out.println("El descuento del 30% a " + valorCompra + " es " + valorFinal3);
		} else {
			System.out.println("Lo sentimos no aplica descuento");
		}	
	}
}
