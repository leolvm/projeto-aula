package Aulas;

import java.util.Locale;

public class Aula_01AtribuicaodeVariaveis {
	
       public static void main(String[]args){
         
    	   Locale.setDefault(Locale.US);
    	   
    	   int idade;
    	   double salario , altura;
    	   char genero;
    	   String nome;
    	   
    	   idade = 20;
    	   salario = 2500.20;
    	   altura = 1.75;
    	   genero = 'f';
    	   nome = "Rejane Ramos";
    	   
    	   System.out.println("idade = " + idade);
    	   System.out.println("salario = " + String.format("%.2f", salario));
    	   System.out.println("altura = " + String.format("%.2f", altura));
    	   System.out.println("genero = " + genero);
    	   System.out.println("nome = " + nome);
    	   
       }
    	   
    	   
    	   
   }
