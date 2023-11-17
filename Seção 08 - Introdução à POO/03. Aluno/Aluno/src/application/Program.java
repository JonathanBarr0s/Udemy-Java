package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.nome = sc.nextLine();
		student.nota1 = sc.nextInt();
		student.nota2 = sc.nextInt();
		student.nota3 = sc.nextInt();
		
		System.out.println();
		System.out.println(student);
		
		sc.close();

	}

}
