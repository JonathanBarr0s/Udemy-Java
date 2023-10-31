import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A, B;
		
		double C, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário:");
		
		A = sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas:");
		
		B = sc.nextInt();
		
		System.out.println("Digite valor da hora trabalhada:");
		
		C = sc.nextDouble();
		
		resultado = B * C;
		
		System.out.println("NUMBER = " + A);
		System.out.printf("SALARY = R$ %.2f", resultado);
		
		sc.close();

	}

}
