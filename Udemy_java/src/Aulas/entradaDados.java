package Aulas;

import javax.swing.JOptionPane;

public class entradaDados {

	public static void main(String[] args) {

     /*entrada de dados*/
	String carros = JOptionPane.showInputDialog("informe a quantidade de carros: ");
	String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas: ");
	
	/* convertendo String em numeros (no caso double)*/
	double carroNumero  = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	 
	/* fazendo a divisão e casting de double para int*/
	int divisao = (int) (carroNumero / pessoaNumero);/* aqui obtemos apenas a parte inteira da divisão*/
	
	/* aqui obtemos apenas o resto da divisão*/
	double resto = carroNumero % pessoaNumero; 
	
	/*caixa de confirmação de dados*/
	int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado da divisão?");
	      
	/* condição*/    
	     if(resposta==0) {
	    	 JOptionPane.showMessageDialog(null,"a divisão deu " + divisao);
	     }else{
	    	 JOptionPane.showMessageDialog(null,"Não quis ver o resuldado da divisão");
	     }
	     
	 resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado do resto da divisão?");
	     
	        if(resposta==0) {
	        	JOptionPane.showMessageDialog(null,"o resultado do resto da divisão é  " + resto);
	        	}else {
	        		
	        		JOptionPane.showMessageDialog(null,"Nao quis ver o resto da divisão");
	        	}
	     
	     /*imprimindo mensagem na tela*/
	
	  JOptionPane.showMessageDialog(null,"a divisão deu"  + divisao + 
			  "carros e sobrou"  + resto +   "carros!");
	
	
	
	}

}
