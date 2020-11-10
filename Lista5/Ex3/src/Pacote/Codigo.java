package Pacote;

import javax.swing.JOptionPane;

public class Codigo {

	public static void main(String[] args) {
		
		double n,resul;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de maçãs"));
		
		if(n<12) {
			
			resul = n*1.3;
			
			JOptionPane.showMessageDialog(null, "Valor a ser pago " + resul);
			
		}else {
			
			resul = n*1;
			
			JOptionPane.showMessageDialog(null, "Valor a pagar " + resul);
			
		}
		

	}

}
//Leonardo Henrique Marcondes de Almeida Ramos