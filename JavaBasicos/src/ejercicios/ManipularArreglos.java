package ejercicios;

public class ManipularArreglos {
	/* Crea una clase llamara ManipularArreglo
	crea un array con los siguientes números enteros:

	1, 6, 45, 53, 80, 102, 145, 326, 450, 892
	Crea un programa que use un ciclo que tome los números de arreglo y 
	devuelva la suma total, la suma de los números pares y la suma de 
	los números impares.*/
	
	public static void main(String[] args) {
		
		int numeros[];
		numeros = new int[10];

		numeros[0]=1;
		numeros[1]=6;
		numeros[2]=45;
		numeros[3]=53;
		numeros[4]=80;
		numeros[5]=102;
		numeros[6]=145;
		numeros[7]=326;
		numeros[8]=450;
		numeros[9]=892;
		
		int suma = 0;
		int sumaPar = 0;
		int sumaImpar = 0;
		
		for(int i=0; i < numeros.length; i++){
			suma += numeros[i];
			if(numeros[i] % 2 == 0) {
				sumaPar += numeros[i];
			} else {
				sumaImpar += numeros[i];
			}
		}
		
		System.out.println("La suma total es " + suma);
		System.out.println("La suma total de los pares es " + sumaPar);
		System.out.println("La suma total de los impares es " + sumaImpar);

	}
}