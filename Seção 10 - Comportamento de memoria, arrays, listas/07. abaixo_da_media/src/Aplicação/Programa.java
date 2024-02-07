package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];
		double somaVetor = 0;

		System.out.println();

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			somaVetor += vetor[i];
		}

		double mediaVetor = somaVetor / n;

		System.out.println();

		System.out.printf("Média do vetor = %.3f%n", mediaVetor);
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}

	}

}
