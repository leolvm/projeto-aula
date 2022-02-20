package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
	  double base, altura, area , perimetro, diagonal;
	    

	  System.out.print("Base do retangulo: ");
	  base = sc.nextDouble();
	  
	  System.out.print("altura do retangulo: ");
	  altura = sc.nextDouble();	
	  
	  area = base * altura;
	  
	  perimetro = 2 * (base + altura);
	  
	  diagonal = Math.sqrt(Math.pow(base , 2.0) + Math.pow(altura, 2.0));
	  //acima está a função de raiz quadrada e potenciação em java
	  
	  
	  System.out.println("area = " +  String.format("%.4f", area));
	  System.out.println("perimetro = " +  String.format("%.4f", perimetro));
	  System.out.println("diagonal = " +  String.format("%.4f", diagonal));
	   
	   sc.close();
	}
	
	
	

}
