package Pacote;

import javax.swing.*;

public class Codigo5 {
	
	public static void main (String args[]) {
		
		
		int nas,ano,eleicao;
		
		nas = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
		
		eleicao = ano-nas;
		
		if(eleicao >= 16 && eleicao <= 17 || eleicao > 70) {
			
			JOptionPane.showMessageDialog(null,"Eleitor facultativo");
		
		}else if(eleicao >= 18 && eleicao <=70) {
			
			JOptionPane.showMessageDialog(null, "Eleitor obrigatorio");
		
		}
		
		
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos