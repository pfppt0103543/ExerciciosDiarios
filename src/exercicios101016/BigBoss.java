package exercicios101016;

import java.util.ArrayList;

public class BigBoss {
	ArrayList<GestaoStand> _stands; 
	
	
	public BigBoss() {
		_stands = new ArrayList<GestaoStand>();
		
		GestaoStand raminhos = new GestaoStand();
		
		_stands.add(raminhos);
		
		relatorioStand(raminhos);
	}
	
	private void relatorioStand(GestaoStand stand) {
		ArrayList tr = stand.get_transaccoes();
		
		int totalTransaccoes = tr.size();
		
		System.out.println("O stand teve " + totalTransaccoes + " de transaccoes");
		
		double lucro = lucrosStand(stand);
		System.out.println("e lucrou " + lucro + " de transaccoes");
	}
	
	private double lucrosStand(GestaoStand stand) {
		ArrayList tr = stand.get_transaccoes();
		
		double lucro = 0, 
				vendas= 0, 
				compras = 0;
		
		for (int i=0; i < tr.size(); i++) {
			Transaccao t = (Transaccao) tr.get(i);
			
			if (t.getTipo() == Transaccao.COMPRA)
				compras = compras + t.getPreco();
			else if ( t.getTipo() == Transaccao.VENDA)
				vendas = vendas + t.getPreco();			
		}
		
		lucro = vendas - compras;
		
		return lucro;
	}
}
