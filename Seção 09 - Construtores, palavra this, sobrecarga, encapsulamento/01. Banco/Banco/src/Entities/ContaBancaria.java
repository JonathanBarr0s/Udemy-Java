package Entities;

public class ContaBancaria {

	private int numeroConta;
	private String titular;
	private double saldo;

	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public String toString() {
		return "Conta " + getNumeroConta() + ", Titular: " + getTitular() + ", Saldo: R$ " + getSaldo();
	}

}
