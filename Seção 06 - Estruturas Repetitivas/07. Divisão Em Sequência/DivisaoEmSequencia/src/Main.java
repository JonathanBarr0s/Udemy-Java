import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para N");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite o numerador:");
			double numerador = sc.nextDouble();

			System.out.println("Digite o denominador:");
			double denominador = sc.nextDouble();

			if (denominador == 0) {
				System.out.println("divisao impossivel");
			} else {
				double resultado = numerador / denominador;
				System.out.println(resultado);
			}
		}

		sc.close();

	}

}
