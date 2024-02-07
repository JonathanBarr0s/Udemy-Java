package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];

		double maiorAltura = Double.MIN_VALUE;
		double menorAltura = Double.MAX_VALUE;

		double somaDasAlturasDasMulheres = 0;
		int quantidadeDeMulheres = 0;
		int quantidadeDeHomens = 0;

		System.out.println();

		for (int i = 0; i < altura.length; i++) {

			System.out.print("Altura da " + (i + 1) + "a pessoa: ");

			altura[i] = sc.nextDouble();

			if (maiorAltura < altura[i]) {
				maiorAltura = altura[i];
			}

			if (menorAltura > altura[i]) {
				menorAltura = altura[i];
			}

			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);

			if (genero[i] == 'F' || genero[i] == 'f') {
				somaDasAlturasDasMulheres += altura[i];
				quantidadeDeMulheres++;

			} else if (genero[i] == 'M' || genero[i] == 'm') {
				quantidadeDeHomens++;

			}

			System.out.println();

		}

		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.println("Média das alturas das mulheres = "
				+ String.format("%.2f", somaDasAlturasDasMulheres / quantidadeDeMulheres));
		System.out.println("Numero de homens = " + quantidadeDeHomens);

		sc.close();

	}

}
