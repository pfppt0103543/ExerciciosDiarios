package ecercicios100616;

import java.util.ArrayList;

public class GestaoStand {
	private ArrayList _transaccoes;
	private ArrayList _automoveis;
	private ArrayList _clientes;
	
	public GestaoStand(){
		_transaccoes = new ArrayList<>();
		_automoveis = new ArrayList<>();
		
		Automovel newAuto = criarCarro();
		_automoveis.add(newAuto);
		
		Cliente newCliente = criarCliente();
		_clientes.add(newCliente);
		
		Transaccao crenaul = new Transaccao(Transaccao.COMPRA, newAuto, newCliente, 2300.00);
		_transaccoes.add(crenaul);
		
		Transaccao vreault = new Transaccao(Transaccao.VENDA, newAuto, newCliente, 2700);
		_transaccoes.add(vreault);
		
	}
	
	
	public Automovel criarCarro(){
		Automovel a = new Automovel(2500.00, 1600, 120000, 2002, "Renault", "Megane");
	//	Automovel a = new Automovel(10000.00, 2000, 68700, 2005, "Renault", "Megane S");
		return a;
	}
	
	public Cliente criarCliente(){
		Cliente c = new Cliente("Pedro", "Sesimbra", "212683136", 19846574);
		return c;
	}
	
	public Transaccao comrparCarro(Automovel carro, Cliente c){
		return null;
	}
	
	public Transaccao venderCarro(Automovel carro, Cliente c){
		return null;
	}


	public ArrayList get_transaccoes() {
		return _transaccoes;
	}

	public void set_transaccoes(ArrayList _transaccoes) {
		this._transaccoes = _transaccoes;
	}
	
}
