package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorNumero = 0;
		int posicao = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posicao = i;
			}
		}

		System.out.println();

		System.out.println("Maior valor = " + maiorNumero);
		System.out.println("Posição do maior valor = " + posicao);

		sc.close();

	}

}
