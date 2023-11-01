import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double x, y;
		
		System.out.println("Digite o valor de X:");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de Y:");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x >= 0 && y >= 0) {
			System.out.println("Q1");
		} else if (x < 0 && y >= 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x >= 0 && y < 0) {
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
