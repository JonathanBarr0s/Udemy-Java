package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		System.out.println();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println();

		System.out.print("VALORES = ");

		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			System.out.print(numeros[i] + " ");
		}

		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + soma / numeros.length);

		sc.close();

	}

}
