import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número:");
		
		int A = sc.nextInt();
		
		System.out.println("Insira o segundo número:");
		
		int B = sc.nextInt();
		
		System.out.printf("SOMA = %d", A + B);
				
		sc.close();

	}

}
