package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante estudante = new Estudante();

		estudante.nome = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();

		System.out.printf("NOTA FINAL: %.2f%n", estudante.notaFinal());
		
		if (estudante.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTOU %.2f PONTOS%n", estudante.pontosQueFalta());
		} else {
			System.out.println("APROVADO");
		}
		
		sc.close();

	}

}
