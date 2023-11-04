import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de N:");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++ ) {
			System.out.println("Digite o valor de X:");
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
