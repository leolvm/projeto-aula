package Aulas;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int L , C;     /* <---- variaveis*/
		
		System.out.print("Quantas linhas vai ter a matriz?: ");
		L = sc.nextInt();                                          /* <----entrada e saida de dados*/
	    System.out.print("Quantas colunas vai ter a matriz?: ");
		C = sc.nextInt();
		
		int[][] mat = new int[L][C];    /* <----- criando  matriz na memoria do computador*/ 
		
		for (int i = 0; i < L; i++) {  /* <---percorrendo as linhas da matriz*/
			for (int j = 0; j < C; j++) {  /* <----percorrendo as colunas da matriz*/
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				
			}
			
		}
			
		System.out.println();
        System.out.println("Matriz Digitada: ");
        for (int i = 0; i < L; i++) {                /* <---imprimindo os elementos da matriz*/
        	for(int j = 0; j < C; j++) {
        		System.out.print(mat[i][j] + " ");
        	}
            System.out.println(); 
        }
				   
		
		
		sc.close();
		
		
	}

}
