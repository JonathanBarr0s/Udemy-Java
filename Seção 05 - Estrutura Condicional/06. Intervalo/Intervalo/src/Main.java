import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 25;
		int c = 50;
		int d = 75;
		int e = 100;

		System.out.println("Digite um número:");
		double entrada = sc.nextDouble();

		if (entrada >= a && entrada <= b) {
			System.out.println("Intervalo [0,25]");
		} else if (entrada > b && entrada <= c) {
			System.out.println("Intervalo [25,50]");
		} else if (entrada > c && entrada <= d) {
			System.out.println("Intervalo [50,75]");
		} else if (entrada > d && entrada <= e) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();

	}

}
