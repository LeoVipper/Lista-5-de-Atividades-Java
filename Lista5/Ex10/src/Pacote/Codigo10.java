package Pacote;

import javax.swing.JOptionPane;

public class Codigo10 {

	public static void main(String[] args) {
		
		int sal,vend,com, saltotal;
		
		try {
			
			sal = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario:"));
			vend = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de vendas"));
			
			if(vend <=1500) {
				com = vend*3/100;
				saltotal = sal + com;
				JOptionPane.showMessageDialog(null, "Valor do salario R$:"+sal+
													"\nValor das vendas R$"+vend+
													"\nValor da comissao R$"+com+
													"\nValor total do salario R$"+saltotal);
				
			}else if(vend > 1500) {
				com = vend*5/100;
				saltotal = sal + com;
				JOptionPane.showMessageDialog(null, "Valor do salario R$:"+sal+
													"\nValor das vendas R$"+vend+
													"\nValor da comissao R$"+com+
													"\nValor total do salario R$"+saltotal);
				
				
				
			}
			
		}catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Valor invalido");
			
		}
		
	}

}
//Leonardo Henrique Marcondes de Almeida Ramos