import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int umAlcool = 0;
		int doisGasolina = 0;
		int tresDiesel = 0;

		int entrada = 1;

		while (entrada != 4) {
			System.out.println("Digite o código do combustível:");
			entrada = sc.nextInt();

			if (entrada == 1) {
				umAlcool += entrada;
			} else if (entrada == 2) {
				doisGasolina += 1;
			} else if (entrada == 3) {
				tresDiesel += 1;
			} else if (entrada == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d%n", umAlcool);
				System.out.printf("Gasolina: %d%n", doisGasolina);
				System.out.printf("Diesel: %d%n", tresDiesel);
			}
		}

		sc.close();

	}

}
