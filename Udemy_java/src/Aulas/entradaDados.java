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
	 
	/* fazendo a divis�o e casting de double para int*/
	int divisao = (int) (carroNumero / pessoaNumero);/* aqui obtemos apenas a parte inteira da divis�o*/
	
	/* aqui obtemos apenas o resto da divis�o*/
	double resto = carroNumero % pessoaNumero; 
	
	/*caixa de confirma��o de dados*/
	int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado da divis�o?");
	      
	/* condi��o*/    
	     if(resposta==0) {
	    	 JOptionPane.showMessageDialog(null,"a divis�o deu " + divisao);
	     }else{
	    	 JOptionPane.showMessageDialog(null,"N�o quis ver o resuldado da divis�o");
	     }
	     
	 resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado do resto da divis�o?");
	     
	        if(resposta==0) {
	        	JOptionPane.showMessageDialog(null,"o resultado do resto da divis�o �  " + resto);
	        	}else {
	        		
	        		JOptionPane.showMessageDialog(null,"Nao quis ver o resto da divis�o");
	        	}
	     
	     /*imprimindo mensagem na tela*/
	
	  JOptionPane.showMessageDialog(null,"a divis�o deu"  + divisao + 
			  "carros e sobrou"  + resto +   "carros!");
	
	
	
	}

}
