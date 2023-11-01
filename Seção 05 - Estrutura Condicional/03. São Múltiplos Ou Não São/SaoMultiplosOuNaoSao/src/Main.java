import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número inteiro para A:");
		int A = sc.nextInt();
		System.out.println("Digite o número inteiro para B:");
		int B = sc.nextInt();

		String maior = "";
		double teste = 0;

		if (A > B) {
			maior = "A";
		} else {
			maior = "B";
		}

		if (maior == "A") {
			teste = A % B;
		} else {
			teste = B % A;
		}

		if (teste == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();

	}

}
