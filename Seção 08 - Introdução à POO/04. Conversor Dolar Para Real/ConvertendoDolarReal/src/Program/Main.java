package Program;

import java.util.Scanner;

import Entities.ConversorDeMoeda;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual é o preço do dolar? ");
		double preco = sc.nextDouble();

		System.out.println();

		System.out.print("Quantos dólares serão comprados? ");
		double dolar = sc.nextDouble();

		System.out.println();

		double resultado = ConversorDeMoeda.conversor(preco, dolar);

		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);

		sc.close();

	}

}
