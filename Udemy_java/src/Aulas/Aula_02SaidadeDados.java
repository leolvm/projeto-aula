package Aulas;

public class Aula_02SaidadeDados {

	public static void main(String[] args) {
		
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 40;
		salario = 5000.50;
		nome = "Rejane Ramos";
		sexo = 'f';
		
		System.out.println("A funcionaria " + nome + ", sexo " + sexo + ", ganha "
				+ String.format("%.2f", salario) + " e tem " + idade + " anos!!! ");
	
		
	}

}
