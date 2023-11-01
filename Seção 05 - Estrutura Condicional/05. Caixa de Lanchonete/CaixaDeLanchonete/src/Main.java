import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double cachorroQuente = 4;
		double xSalada = 4.5;
		double xBacon = 5;
		double torradaSimples = 2;
		double refrigerante = 1.5;

		System.out.println("Digite o código do produto:");
		int a = sc.nextInt();

		System.out.println("Digite a quantidade:");
		int b = sc.nextInt();

		if (a == 1) {
			double total = cachorroQuente * b;
			System.out.printf("Total: R$ %.2f", total);
		} else if (a == 2) {
			double total = xSalada * b;
			System.out.printf("Total: R$ %.2f", total);
		} else if (a == 3) {
			double total = xBacon * b;
			System.out.printf("Total: R$ %.2f", total);
		} else if (a == 4) {
			double total = torradaSimples * b;
			System.out.printf("Total: R$ %.2f", total);
		} else if (a == 5) {
			double total = refrigerante * b;
			System.out.printf("Total: R$ %.2f", total);
		}

		sc.close();

	}

}
