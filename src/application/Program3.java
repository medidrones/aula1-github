package application;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculadora;

public class Program3 {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.circunferencia(raio);		
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);
		
		sc.close();
	}		

}
