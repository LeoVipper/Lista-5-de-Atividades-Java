package Pacote;

import javax.swing.*;

public class Codigo9 {

	public static void main(String[] args) {
		
		int ho,hoes,din,sal,acres;
		try {
		ho = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
		din = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser pago por hora"));
		
		sal = ho*din;
		
		if(ho>40) {
			hoes = ho-40;
			acres = sal*50/100;
			sal = sal+acres;
			
			JOptionPane.showMessageDialog(null, "Valor da hora " + din + 
												"\nHoras trabalhadas " + ho + 
												"\nHoras extras " + hoes + 
												"\nAcrescimo ao salario R$"+acres + 
												"\nValor do salario R$"+sal);
			
		}else if(ho<=40) {
			JOptionPane.showMessageDialog(null, "Horas trabalhadas " + ho + 
					"\nValor do salario R$"+sal);
			
		}
		
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos