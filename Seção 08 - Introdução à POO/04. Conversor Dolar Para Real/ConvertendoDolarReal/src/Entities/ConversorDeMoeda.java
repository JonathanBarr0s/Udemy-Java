package Entities;

public class ConversorDeMoeda {

	public static final double IOF = 0.06;

	public static double conversor(double preco, double dolar) {
		return preco * dolar * (1.0 + IOF);
	}

}
