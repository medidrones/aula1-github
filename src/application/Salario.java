package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		// PARTE 1 - LEITURA DE DADOS:

		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			list.add(new Empregado(id, nome, salario));
		}

		// PARTE 2 - ATUALIZA��O DO SAL�RIO DO FUNCION�RIO:

		System.out.println();
		System.out.print("Digite o ID do funcion�rio que ter� aumento salarial: ");
		int id = sc.nextInt();
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este ID n�o existe!");
		} else {
			System.out.print("Digite a porcentagem: ");
			double percentual = sc.nextDouble();
			emp.aumentarSalario(percentual);
		}

		// PARTE 3 - LISTA DE FUNCION�RIOS:

		System.out.println();
		System.out.println("Lista de funcion�rios:");
		for (Empregado obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
