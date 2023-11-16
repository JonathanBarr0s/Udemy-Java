import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangle calculate = new Rectangle();

		System.out.println("Enter rectangle width and height:");

		calculate.width = sc.nextDouble();
		calculate.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", calculate.area());
		System.out.printf("PERIMETER = %.2f%n", calculate.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", calculate.diagonal());

		sc.close();
	}

}
