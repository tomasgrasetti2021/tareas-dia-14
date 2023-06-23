package tareaCirculo;

import java.util.Scanner;


public class AreaCirculo {
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = AreaCirculo(radio);
        System.out.println("El área del círculo es: " + area);
    }

    public static double AreaCirculo(double radio) {
        double area = 3.14159 * radio * radio;
        return area;
        
    }
}
