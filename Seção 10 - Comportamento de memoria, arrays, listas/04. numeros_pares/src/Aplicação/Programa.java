package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadeDePares = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println();
		
		System.out.print("Números pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print("  " + numeros[i]);
				quantidadeDePares++;
			}
		}

		System.out.println();
		System.out.println("Quantidade de Pares = " + quantidadeDePares);
		
		sc.close();

	}

}
