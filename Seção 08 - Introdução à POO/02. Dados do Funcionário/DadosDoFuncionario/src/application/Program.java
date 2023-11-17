package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee data = new Employee();

		System.out.print("Name: ");
		data.name = sc.nextLine();
		System.out.print("Gross salary: ");
		data.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		data.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + data);
		System.out.println();

		System.out.print("Which percentage to increase salary? ");
		data.increaseSalary(sc.nextDouble());

		System.out.println("Update: " + data);

		sc.close();

	}

}
