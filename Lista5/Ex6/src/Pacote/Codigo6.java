package Pacote;

import javax.swing.JOptionPane;

public class Codigo6 {

	public static void main(String[] args) {
		
		int v1,v2;
		
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		if(v1 > v2) {
			
			JOptionPane.showMessageDialog(null, "O primeiro valor: " + v1 + " é maior que o segundo valor: " + v2);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O segundo valor: " + v2 + " é maior que o primeiro valor: " + v1);
			
			
		}
		
		
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos