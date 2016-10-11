package ecercicios100616;

import java.util.ArrayList;

public class BigBoss {
	ArrayList<GestaoStand> _stands;
	
	
	public BigBoss(){
	_stands = new ArrayList<GestaoStand>();
	GestaoStand raminhos = new GestaoStand();
	_stands.add(raminhos);
	
	relatorioStand(raminhos);
	
	}
	private void relatorioStand(GestaoStand stand){
		ArrayList tr = stand.get_transaccoes();
		int totalVendas = tr.size();
		double lucro = lucrosStand(stand);
		System.out.println("o Stand teve"+ totalVendas +" de transaccoes");
	}
	

	private double lucrosStand(GestaoStand stand){
		ArrayList tr= stand.get_transaccoes();
		double lucro =0;
		double vendas=0;
		double compras=0;
		
		for (int i = 0; i < tr.size(); i++) {
			Transaccao t = (Transaccao) tr.get(i);
			
			if(t.getTipo()==Transaccao.COMPRA)
				compras=compras +t.getPreco();
			else if (t.getTipo()==Transaccao.VENDA)
				vendas=vendas+t.getPreco();
		}
		lucro = vendas - compras;
		return lucro;
	}
}
