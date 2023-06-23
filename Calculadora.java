package ejemplo;

import java.util.Scanner;

public class Calculadora {
	public static float suma(float a, float b ) {
		return a + b;
		
	}
	public static float resta(float a, float b) {
		return a - b; 
			}
	public static float division(float a, float b) {
		return a / b;
	}
	public static float multiplicacion(float a, float b) {
		return a * b;
	}
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Ingrese primer numero: ");
		float numero1 =  en.nextFloat();
		
		System.out.println("Ingrese segundo numero: ");
		float numero2 = en.nextFloat();
		
		System.out.println("suma = " + suma(numero1, numero2));
		System.out.println("resta = " + resta(numero1, numero2));
		System.out.println("division = " + division(numero1, numero2));
		System.out.println("multiplicacion = " + multiplicacion(numero1, numero2));
	}
}
