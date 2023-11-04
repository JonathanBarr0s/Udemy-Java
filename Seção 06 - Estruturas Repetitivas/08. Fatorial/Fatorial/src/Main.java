import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para N");
		int entrada = sc.nextInt();
		int n = entrada;
		int fatorial = 1;

		if (entrada == 0 || entrada == 1) {
			System.out.println(1);
		} else {
			while (n > 1) {
				fatorial *= n;
				n--;
			}
			System.out.println(fatorial);
		}

		sc.close();
	}
}
