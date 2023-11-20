package Program;

import java.util.Scanner;

import Entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroConta;
		String titular;
		String depositoInicial;
		double saldo = 0, saque = 0;
		int taxa = -5;

		System.out.print("Digite o número da conta: ");
		numeroConta = sc.nextInt();

		System.out.print("Digite o titular da conta: ");
		titular = sc.next();

		System.out.print("Existe depósito inicial (s/n)? ");
		depositoInicial = sc.next();

		if (depositoInicial.equals("S") || depositoInicial.equals("s")) {
			System.out.print("Insira o valor do depósito inicial: ");
			saldo = sc.nextDouble();
		}

		ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldo);

		System.out.println();
		System.out.print("Dados da conta: " + conta);

		System.out.println();
		System.out.println();
		System.out.print("Insira um valor de depósito: ");
		conta.setSaldo(sc.nextDouble());

		System.out.println();
		System.out.print("Dados da conta atualizados: " + conta);

		System.out.println();
		System.out.println();
		System.out.println("Insira um valor de saque: ");
		saque -= sc.nextDouble();
		conta.setSaldo(saque + taxa);

		System.out.println();
		System.out.print("Dados da conta atualizados: " + conta);

		sc.close();
	}

}
