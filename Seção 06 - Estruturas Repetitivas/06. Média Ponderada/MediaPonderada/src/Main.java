import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para N:");
		int n = sc.nextInt();
		
		double x = 0;
		double y = 0;
		double z = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite um número decimal para X:");
			x = sc.nextDouble();
			
			System.out.println("Digite um número decimal para Y:");
			y = sc.nextDouble();
			
			System.out.println("Digite um número decimal para Z:");
			z = sc.nextDouble();
			
			double media = (x*2 + y*3 + z*5) / 10;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
