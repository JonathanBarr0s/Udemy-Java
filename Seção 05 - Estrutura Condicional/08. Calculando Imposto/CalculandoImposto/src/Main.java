import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário:");
		
		double salario = sc.nextDouble();
		double imposto = 0;
		
		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario > 2000 && salario <= 3000) {
			imposto = salario * 0.08;
			System.out.printf("R$ %.2f", imposto);
		} else if (salario > 3000 && salario <= 4500) {
			imposto = (salario - 3000) * 0.18;
			System.out.printf("R$ %.2f", imposto + 80);
		} else if (salario > 4500) {
			imposto = (salario - 4500) * 0.28;
			System.out.printf("R$ %.2f", imposto + 350);
		}
		
		sc.close();

	}

}
