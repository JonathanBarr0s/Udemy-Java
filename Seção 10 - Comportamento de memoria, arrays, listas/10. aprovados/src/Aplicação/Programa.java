package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		double[] notaPrimeiroSemestre = new double[n];
		double[] notaSegundoSemestre = new double[n];

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			notaPrimeiroSemestre[i] = sc.nextDouble();
			notaSegundoSemestre[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < nome.length; i++) {

			if ((notaPrimeiroSemestre[i] + notaSegundoSemestre[i]) / 2 > 6) {

				System.out.println(nome[i]);
			}
		}

		sc.close();

	}

}
