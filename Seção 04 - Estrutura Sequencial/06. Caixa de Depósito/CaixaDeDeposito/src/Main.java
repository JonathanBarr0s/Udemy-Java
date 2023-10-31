import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, d, e;

		double c, f, resultado;

		System.out.println("Digite o código da primeira peça:");

		a = sc.nextInt();

		System.out.println("Digite o número de peças:");

		b = sc.nextInt();

		System.out.println("Digite o preço unitário da peça:");

		c = sc.nextDouble();

		System.out.println("Digite o código da segunda peça:");

		d = sc.nextInt();

		System.out.println("Digite o número de peças:");

		e = sc.nextInt();

		System.out.println("Digite o preço unitário da peça:");

		f = sc.nextDouble();
		
		resultado = (b * c + e * f);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", resultado);

		sc.close();

	}

}
