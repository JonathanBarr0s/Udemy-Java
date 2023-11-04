import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para N:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			double teste = n % i;
			
			if (teste == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
