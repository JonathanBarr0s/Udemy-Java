package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorIdade = 0;
		String nomeMaiorIdade = "";

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		System.out.println();

		for (int i = 0; i < nome.length; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa: ");

			System.out.print("Nome: ");
			nome[i] = sc.next();

			System.out.print("Idade: ");
			idade[i] = sc.nextInt();

			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				nomeMaiorIdade = nome[i];
			}

		}

		System.out.println();
		System.out.println("PESSOA MAIS VELHA: " + nomeMaiorIdade);

		sc.close();

	}

}
