package Aulas;

import java.util.Locale;

import java.util.Scanner;
import java.util.Scanner;
public class vetores {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    int N;    /* <----variavel*/
		
		System.out.print("Quantos numeros voce vai digitar?: ");
	     N = sc.nextInt();                                        /* <--lendo variavel N */
	     
	     double[] vet = new double [N];  /* <----criando um vetor na memoria */
	     
	     for (int i = 0; i < N; i++) {
	           System.out.print("Digite um numero: ");	/* <--lógica para percorrer o vetor*/ 
	           vet[i] = sc.nextDouble();
	     
	        }
	           
	            System.out.println();
	            System.out.println("numeros digitados: ");
	             for (int i = 0; i < N; i++) {             /* <--percorrendo e imprimindo vetor na tela*/ 
	            	System.out.println(String.format("%.1f", vet[i])); 
	            	 
	       }
	             
	    	sc.close();
	    	
	    	
	     }

}
