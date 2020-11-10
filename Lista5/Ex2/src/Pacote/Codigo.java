package Pacote;

import java.util.*;
import javax.swing.JOptionPane;

public class Codigo {
	
	public static void main (String args[]) {
	
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		if(num <0) {
			
			JOptionPane.showMessageDialog(null, "Numero negativo");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Numero positivo");
		}
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos