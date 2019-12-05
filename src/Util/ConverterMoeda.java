package Util;

public class ConverterMoeda {

	public static double IOF = 0.06;

	public static double dolarParaReal(double montante, double valorDolar) {
		return montante * valorDolar * (1.0 + IOF);
	}

}
