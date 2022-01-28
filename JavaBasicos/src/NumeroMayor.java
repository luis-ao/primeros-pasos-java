import java.util.Scanner;

public class NumeroMayor {
	
	public static void main(String[] args) {
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */
		
		System.out.println("Introduce  el primer numero entero");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("Introduce  el segundo numero entero");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		
		System.out.println("Introduce  el tercer numero entero");
		Scanner sc3 = new Scanner(System.in);
		int n3 = sc3.nextInt();
		
		if(n1 >= n2) {
			System.out.println("El numero mayor es " + n1);
		} else if(n2 >= n3) {
			System.out.println("El numero mayor es " + n2);
		} else {
			System.out.println("El numero mayor es " + n3);
		}
		

	}
	

}
