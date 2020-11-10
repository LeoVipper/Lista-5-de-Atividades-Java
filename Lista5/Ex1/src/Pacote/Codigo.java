package Pacote;

import java.util.*;
import javax.swing.JOptionPane;


public class Codigo {
	
	public static void main (String args[]) {
		
		int num =0;
		
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	
		if(num < 10) {
			JOptionPane.showMessageDialog(null, "NÃO E MAIOR QUE 10");
		}else if(num > 10) {
			JOptionPane.showMessageDialog(null, "É MAIOR QUE 10");
		}
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Valor invalido");
		}
		
	}
	
}
//Leonardo Henrique M. de A. Ramos