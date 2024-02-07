package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorResultante = new int[n];

		System.out.println();

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
			vetorResultante[i] = vetorA[i] + vetorB[i];
		}

		System.out.println();
		System.out.println("Vetor Resultante: ");

		for (int i = 0; i < vetorResultante.length; i++) {
			System.out.println(vetorResultante[i]);
		}
	}

}
