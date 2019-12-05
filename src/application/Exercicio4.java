package application;

import java.util.Locale;
import java.util.Scanner;

import Util.ConverterMoeda;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual � o valor do d�lar? ");
		double valorDolar = sc.nextDouble();
		System.out.print("Quantos d�lares ser�o comprados? ");
		double montante = sc.nextDouble();
		double resultado = ConverterMoeda.dolarParaReal(montante, valorDolar);
		System.out.printf("Valor a ser pago em reais = R$ %.2f%n", resultado);
		
		sc.close();

	}

}
