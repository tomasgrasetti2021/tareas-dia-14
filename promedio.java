package ejemplo;

import java.util.Scanner;

public class promedio {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Ingrese nota 1: ");
		float nota1 = en.nextInt();
		System.out.println("Ingrese nota 2: ");
		float nota2 = en.nextInt();
		System.out.println("Ingrese nota 3: ");
		float nota3 = en.nextInt();
		System.out.println("Ingrese nota 4: ");
		float nota4 = en.nextInt();
		
		float promedio;
		promedio = (nota1 + nota2 + nota3 + nota4)/4;

		System.out.println("PROMEDIO: " + promedio) ;

}}
