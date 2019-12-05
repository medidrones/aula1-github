package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Existe depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Entre com valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizado:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor de retirada: ");
		double valorRetirada = sc.nextDouble();
		conta.retirada(valorRetirada);
		System.out.println("Dados da conta atualizado:");
		System.out.println(conta);
		
		sc.close();

	}

}
