package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula03_EntradaeSaidadedados {

	public static void main(String[] args) {
         
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double  salario1, salario2;
		String nome1 , nome2;
		int idade1 , idade2;
		char sexo1 , sexo2;
		
		System.out.print("digite o nome da primeira pessoa:  ");
		nome1 = sc.nextLine();
		System.out.print("digite o salário da primeira pessoa:  ");
		salario1 = sc.nextDouble();
	    System.out.print("digite o nome da segunda pessoa: ");
		sc.nextLine();//--------limpeza de buffer
		nome2 = sc.nextLine();
		System.out.print("digite o salário da segunda pessoa: ");
		salario2 = sc.nextDouble();
		System.out.print("idade da primeira pessoa: ");
		idade1 = sc.nextInt();
		System.out.print("idade da segunda pessoa: ");
		idade2 = sc.nextInt();
		System.out.print("sexo da primeira pessoa 'F/M': ");
		sexo1 = sc.next().charAt(0);
		System.out.print("sexo da segunda pessoa 'F/M': ");
		sexo2 = sc.next() .charAt(0);
		System.out.println();
		System.out.println("nome: " + nome1);
		System.out.println("salário: " + String.format("%.2f", salario1));
		System.out.println("idade: " + idade1);
		System.out.println("sexo: " + sexo1);
		System.out.println();
		System.out.println("nome: " + nome2);
		System.out.println("salário: " + salario2);
		System.out.println("idade: " + idade2);
		System.out.println("sexo: " + sexo2);
		
		sc.close();
	}

}
