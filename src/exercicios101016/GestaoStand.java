package exercicios101016;

import java.util.ArrayList;

public class GestaoStand {
	private ArrayList _transaccoes;
	private ArrayList _automoveis;
	private ArrayList _clientes;
	
	public GestaoStand() {
		_transaccoes 	= new ArrayList<>();
		_automoveis		= new ArrayList<>();
		_clientes		= new ArrayList<>();
		
		
		Automovel newAuto = criarCarro();
		
		
		_automoveis.add(newAuto);
		
		Cliente c = new Cliente("Alberto Matos", "Seixal", "967123654", 987654321);
		Cliente c2 = new Cliente("Amilcar Alho", "Setubal", "932876345", 123456765);
		_clientes.add(c);
		_clientes.add(c2);
		
		Transaccao crenault = new Transaccao(Transaccao.COMPRA, 
				newAuto, 
				c, 2300.0);
		
		_transaccoes.add(crenault);
		
		Transaccao vrenault = new Transaccao(Transaccao.VENDA, 
				newAuto, 
				c2, 
				2700.0);
		
		_transaccoes.add(vrenault);
	}
	
	public Automovel criarCarro() {
		Automovel a = new Automovel(2500.00, 
				1600, 
				"Renault", 
				"Megane", 
				120000, 
				2002);
		return a;
	}
	
	public Cliente criarCliente() {
		Cliente c = new Cliente("Alberto Matos", "Sesimbra", "963 543 846", 876543129);
		
		return c;
	}
	
	public Transaccao comprarCarro(Automovel carro, Cliente c) {
		return null;
	}
	
	public Transaccao venderCarro(Automovel carro, Cliente c) {
		return null;
	}

	public ArrayList get_transaccoes() {
		return _transaccoes;
	}
	
	
}
