package application;

import java.util.Locale;
import java.util.Scanner;

import Util.ConverterMoeda;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o valor do dólar? ");
		double valorDolar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double montante = sc.nextDouble();
		double resultado = ConverterMoeda.dolarParaReal(montante, valorDolar);
		System.out.printf("Valor a ser pago em reais = R$ %.2f%n", resultado);
		
		sc.close();

	}

}
