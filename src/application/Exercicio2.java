package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salario Liquido: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		System.out.print("Qual percentual para o aumentar o salario? ");
		double porcentagem = sc.nextDouble();
		emp.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + emp);
		
		sc.close();

	}

}
