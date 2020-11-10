package Pacote;

import java.awt.JobAttributes;
import java.util.*;
import javax.swing.JOptionPane;

public class Codigo4 {
	
	public static void main (String args[]) {
		
		int n1,n2,med;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
	
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
		
		med = (n1+n2)/2;
		
		if(med < 6) {
			
			JOptionPane.showMessageDialog(null,"Nota " + med + " Reprovado");
		
		}else if(med >=6) {
			
			JOptionPane.showMessageDialog(null,"Nota " + med + " Aprovado");
			
		}
		
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos