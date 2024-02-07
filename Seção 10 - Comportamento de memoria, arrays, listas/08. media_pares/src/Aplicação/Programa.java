package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];
		int contagemNumerosPares = 0;
		int somaDePares = 0;

		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				contagemNumerosPares++;
				somaDePares += numeros[i];
			}

		}

		System.out.println();

		if (contagemNumerosPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.println("MEDIA DOS PARES = " + somaDePares / contagemNumerosPares);
		}

		sc.close();

	}

}
