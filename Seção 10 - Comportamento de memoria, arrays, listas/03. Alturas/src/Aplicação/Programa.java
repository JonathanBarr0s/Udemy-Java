package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double alturaMedia = 0;
		double porcentual = 0;

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		System.out.println();

		for (int i = 0; i < nome.length; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa: ");

			System.out.print("Nome: ");
			nome[i] = sc.next();

			System.out.print("Idade: ");
			idade[i] = sc.nextInt();

			if (idade[i] < 16) {
				porcentual++;

			}

			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			alturaMedia += altura[i];

			System.out.println();

		}

		sc.close();

		System.out.println("Altura média: " + alturaMedia / nome.length);
		System.out.println("Pessoas com menos de 16 anos: " + (porcentual / nome.length * 100) + "%");
		System.out.println();

		for (int i = 0; i < idade.length; i++) {

			if (idade[i] < 16) {

				System.out.println(nome[i]);

			}

		}

	}

}
