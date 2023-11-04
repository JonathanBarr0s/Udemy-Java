import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 1 e 1000:");
		int entrada = sc.nextInt();

		while (entrada < 1) {
			System.out.println("Entrada inválida, digite novamente:");
			entrada = sc.nextInt();
		}
		
		while (entrada > 1000) {
			System.out.println("Entrada inválida, digite novamente:");
			entrada = sc.nextInt();
		}
		
		int teste = 1;
		
		while (teste <= entrada) {
			System.out.println(teste);
			teste = teste + 2;
		}

		sc.close();

	}

}
