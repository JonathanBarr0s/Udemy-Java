import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		System.out.println("Digite a senha:");
		int entrada = sc.nextInt();
		
		while (entrada != senha) {
			System.out.println("Senha Inválida, tente novamente:");
			entrada = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
