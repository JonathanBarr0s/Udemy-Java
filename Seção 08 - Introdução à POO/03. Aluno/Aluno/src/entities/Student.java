package entities;

public class Student {
	
	public String nome;
	public int nota1, nota2, nota3;
	
	public int calcularMedia() {
		return nota1 + nota2 + nota3;
	}
	
	public String verificarStatus() {
		int somaNotas = nota1 + nota2 + nota3;
		
		if (somaNotas < 60) {
			int pontosNecessariosParaAprovacao = 60 - somaNotas;
			return "FAILED" + "\n" + "MISSING " + pontosNecessariosParaAprovacao + " POINTS";
		} else {
			return "PASS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + calcularMedia() + "\n" + verificarStatus();
	}

}
