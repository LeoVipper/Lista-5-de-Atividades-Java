package Pacote;

import javax.swing.*;

public class Codigo7 {

	public static void main(String[] args) {
		
		int n1,n2;
		
		try {
			
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
			
			if(n1 <n2) {
				
				JOptionPane.showMessageDialog(null, + n1 + "\n" + n2);
				
			}else if(n2 < n1) {
				
				JOptionPane.showMessageDialog(null, + n2 + "\n" + n1);
				
			}
			
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
		
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos