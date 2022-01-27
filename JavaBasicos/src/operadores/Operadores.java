package operadores;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritméticos
		//+, -, /, *, %
		int a = 10;
		int b = 20;
		double d = 10.0; 
		
		int c = a + b;
		System.out.println(c);
		
		//Concatenando
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + c);
		
		System.out.println("El resultado de la resta: " + (a - b));
		
		int division = a / b;
		System.out.println("El resultado de la división es: " + division);
		// el resultado debería ser 0.5 pero java nos da numeros enteros
		
		double division2 = (double) a / b; // "10.0 / 20 = 0.5"
		// para obtener decimales por lo menos uno de los datos debe ser double
		System.out.println("El resultado de la divición es: " + division2);
		
		double multiplicacion = c * d;
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);
		
		double modulo = a % d;
		System.out.println("El resulado del módulo es: " + modulo);
		
		// Operador de Asignación "="
		
		int e, f; //Inicializar las variables vacias
		e = 5;
		f = 6;
		System.out.println(e + "-" + f);// Mostar el valor de ambas
		
		// Operadores de declaración compuesta
		// +=, -=, *=, /=, %=
		
		int g = 0, h = 5;
		
		g += 5;
		//g = g + 5;
		System.out.println(g);
		
		//Operadores relacionales
		//*<, >, <=, >=, == Igualdad, != diferencia
		
		int i = 15, j = 25;
		String k = "Hola";
		
		System.out.println(i > j);
		// System.out.println(j != h); son valores distintos y no se pueden comparar
		
		//Operador unario
		// ++, --, 
		// preasignación ++l Se le asigna un valor antes de usarse 
		// postasignación l++ Primer lee el valor y despues le suma 1
		
		int l=0, m=0;
		l++;
		System.out.println(l);
		System.out.println(--m);
		
		// Precedencia de operadores
		int operacion = 4 + 5 * 6 / 3;
		//5 * 6 = 30
		//30 / 3 = 10
		// 4 + 10= 14
		System.out.println (operacion);// 14
		
		int operacion2 = (4 + 5) * 6 / 3;
		System.out.println (operacion2);// 18
		
		int n=0, o=0;
		int operacion3 = ++n + o--;
		// n = 1, o = 0;
		System.out.println(operacion3);// 1
		
		// Oerador Ternario = Elvis 
		int edad = 19, valor1 = 0, valor2 = 1;
		
		//paréntesis son opcionales
		// int resultado = (edad <= 18)? valor1 : valor2;
		
		// String resultado2 = (edad <= 18)? "uno" : "dos";
		int valor = (edad<=18) ? 2:1;
		
		// Aquí es obligatorio
		int resultado3 = (edad <= 18)? (valor1 = 2) : (valor1 = 3);
		
		System.out.println(resultado3);
		
		// Operadores Lógicos
		// and - &&
		// or - ||
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);//true
		System.out.println(true && !false);//true
	}
}
