package exercicios131016;

import java.util.ArrayList;




public class BigBoss {
	ArrayList<GestaoLoja> _lojas; 
	public BigBoss() {
		
		
		_lojas = new ArrayList<GestaoLoja>();
		GestaoLoja raminhos = new GestaoLoja();
		_lojas.add(raminhos);
		relatorioLoja(raminhos);
		
	}
	
	private void relatorioLoja(GestaoLoja loja) {
		ArrayList tr = loja.get_transaccoes();
		
		int totalTransaccoes = tr.size();
		
		System.out.println("A lojo teve " + totalTransaccoes + " de transaccoes");
		
		double lucro = lucrosStand(loja);
		System.out.println("e lucrou " + lucro + " de transaccoes");
	}
	
	private double lucrosStand(GestaoLoja loja) {
		ArrayList tr = loja.get_transaccoes();
		
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
		
		lucro = vendas + compras;
		
		return lucro;
	}
}
