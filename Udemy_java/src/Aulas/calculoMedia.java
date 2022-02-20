package Aulas;

import javax.swing.JOptionPane;

public class calculoMedia {

	public static void main(String[] args) {
      
		/*entrando com dados*/
     String nota1 = JOptionPane.showInputDialog("informe a nota 1:");
     String nota2 = JOptionPane.showInputDialog("informe a nota 2:");
     String nota3 = JOptionPane.showInputDialog("informe a nota 3:");
     String nota4 = JOptionPane.showInputDialog("informe a nota 4:");
		
     /*convetendo string em double*/
     double dnota1 = Double.parseDouble(nota1);		
     double dnota2 = Double.parseDouble(nota2);	 
     double dnota3 = Double.parseDouble(nota3);	 	
     double dnota4 = Double.parseDouble(nota4);	 
     
     double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;    /*calculo da média das notas*/
     
     /*média para aprovação é 70*/
     
     if(media >= 50) {
    	 
    	 if(media >= 70) {
    		 JOptionPane.showMessageDialog(null,"aluno esta aprovado com media: " + media);
    	 } 
    	 
    	 else { 
    		 JOptionPane.showMessageDialog(null,"aluno em recuperação com media: " + media);
    	 }
    	 
           }else { 
    		 JOptionPane.showMessageDialog(null,"se ferrou...esta reprovado com média: " + media);
    	   }
	}
     
}	   
     
     
     
     
	
	


