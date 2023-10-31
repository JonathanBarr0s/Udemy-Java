import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		
		pi = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");

		a = sc.nextDouble();

		System.out.println("Digite o segundo valor:");

		b = sc.nextDouble();

		System.out.println("Digite o terceiro valor:");

		c = sc.nextDouble();
		
		triangulo = a * c/2;
		
		circulo = pi * c * c;
		
		trapezio = ((a*b)*c)/2;
		
		quadrado = b * b;
		
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();

	}

}
