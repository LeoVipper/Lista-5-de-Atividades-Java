package Pacote;

import javax.swing.*;

public class Codigo8 {

	public static void main(String[] args) {

		int h1,h2,fim;
		
		try {
		h1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio da partida:"));
		h2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do termino da partida"));
			
		if(h1 == h2) {
			
			JOptionPane.showMessageDialog(null, "A partida teve inicio as " + h1+"hs e terminou no dia seguinte as " + h2+"hs");
			
		}else if(h1 != h2) {
			fim = h2-h1;
			JOptionPane.showMessageDialog(null, "A partida teve uma duração de " +fim+"hs");
			
		}
		
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
		
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos