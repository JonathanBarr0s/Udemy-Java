import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para N:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int linha = i;
			int quadrado = i * i;
			int cubo = i * i * i;

			System.out.println(linha + " " + quadrado + " " + cubo);
		}

		sc.close();

	}

}
