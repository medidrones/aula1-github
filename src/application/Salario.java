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

		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			list.add(new Empregado(id, nome, salario));
		}

		// PARTE 2 - ATUALIZAÇÃO DO SALÁRIO DO FUNCIONÁRIO:

		System.out.println();
		System.out.print("Digite o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este ID não existe!");
		} else {
			System.out.print("Digite a porcentagem: ");
			double percentual = sc.nextDouble();
			emp.aumentarSalario(percentual);
		}

		// PARTE 3 - LISTA DE FUNCIONÁRIOS:

		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Empregado obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
