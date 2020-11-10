package Pacote;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		
		int cod,val;
		double frete,valfim;
		
		try {
			
			cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de origem: "));
			val = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto:"));
			
			if(cod == 1) {
				frete = val*10/100;
				valfim = val+frete;
				
				JOptionPane.showMessageDialog(null, "Codigo " + cod +
													"\nValor do produto: R$"+val +
													"\nProcedencia: Norte\nFrete: R$"+frete+
													"\nValor a pagar: R$"+valfim);
			}else if(cod == 2 || cod == 5 || cod == 9) {
				frete = val*3/100;
				valfim = val+frete;
				
				JOptionPane.showMessageDialog(null, "Codigo " + cod +
													"\nValor do produto: R$"+val +
													"\nProcedencia: Sul\nFrete: R$"+frete+
													"\nValor a pagar: R$"+valfim);
			}else if(cod == 3 || cod >= 10 && cod <= 15 ) {
				frete = val*1.2/100;
				valfim = val+frete;
				
				JOptionPane.showMessageDialog(null, "Codigo " + cod +
													"\nValor do produto: R$"+val +
													"\nProcedencia: Leste\nFrete: R$"+frete+
													"\nValor a pagar: R$"+valfim);
				
			}else if(cod == 7 || cod == 20) {
				frete = val*7.3/100;
				valfim = val+frete;
				
				JOptionPane.showMessageDialog(null, "Codigo " + cod +
													"\nValor do produto: R$"+val +
													"\nProcedencia: Oeste\nFrete: R$"+frete+
													"\nValor a pagar: R$"+valfim);
				
			}else {
				frete = val*22.2/100;
				valfim = val+frete;
				
				JOptionPane.showMessageDialog(null, "Codigo " + cod +
													"\nValor do produto: R$"+val +
													"\nProcedencia: Importado\nFrete: R$"+frete+
													"\nValor a pagar: R$"+valfim);
				
			}
			
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
		
		

	}

}
//Leonardo Henrique Marcondes de Almeida Ramos