import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 1;
		int y = 1;

		while (x != 0 && y != 0) {

			System.out.println("Digite o valor de X:");
			x = sc.nextInt();

			System.out.println("Digite o valor de Y:");
			y = sc.nextInt();

			if (x >= 0 && y >= 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y >= 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x >= 0 && y < 0) {
				System.out.println("quarto");
			}

		}

		sc.close();

	}

}
