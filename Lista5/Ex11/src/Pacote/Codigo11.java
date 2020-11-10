package Pacote;

import javax.swing.*;
import java.util.*;

public class Codigo11 {

	public static void main(String[] args) {
		
		int n1,n2,val;
		String opera;
		char op[];
		
		try {
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		opera = JOptionPane.showInputDialog("Escolha o operador para o calculo: + , - , * ou / ");
		
		op = opera.toCharArray();
		
		switch (op[0]) {
		case '+':
			
			val = n1+n2;
			JOptionPane.showMessageDialog(null, n1+ " + "+ n2 +" = " + val);
			
			break;
		case '-':
			
			val = n1-n2;
			JOptionPane.showMessageDialog(null, n1+ " - "+ n2 +" = " + val);
			
			break;
		case'*':
			val = n1*n2;
			JOptionPane.showMessageDialog(null, n1+ " * "+ n2 +" = " + val);
			
			break;
		case'/':
			val = n1/n2;
			JOptionPane.showMessageDialog(null, n1+ " / "+ n2 +" = " + val);
			
			break;
		default:
			break;
		}
		
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos