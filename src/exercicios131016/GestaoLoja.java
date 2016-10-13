package exercicios131016;
import java.util.ArrayList;




public class GestaoLoja {
	private ArrayList _transaccoes;
	private ArrayList _animal;
	private ArrayList _clientes;
	
	
	public GestaoLoja(){
		
		Cliente c;
		
		_transaccoes 	= new ArrayList<>();
		_animal			= new ArrayList<>();
		_clientes		= new ArrayList<>();
		
		
		Animais newAnim = addAnimal();
		Cliente newClie = criarCliente();
		_animal.add(newAnim);
		_clientes.add(newClie);
		
		Transaccao Dobe = new Transaccao(Transaccao.COMPRA, 
				newAnim,
				newClie, 
				 1000.0);
		
		_transaccoes.add(Dobe);
		
	}

	public Animais addAnimal() {
	
		Animais ani = new Animais(
				250.0, 
				0.2, 
				"Dorberman", 
				"M", 
				"Cão", 
				"Castanho Escuro",
				"Medio");
		return ani;
	}
	
	public Cliente criarCliente() {
		Cliente c = new Cliente(
				"Alberto Matos",
				"Sesimbra",
				"963 543 846",
				876543129);
		
		return c;
	}
	public Transaccao comprarAnimal(Animais animal, Cliente c) {
		return null;
	}
	
	public Transaccao venderAnimal(Animais animal, Cliente c) {
		return null;
	}
	
	public ArrayList get_transaccoes() {
		return _transaccoes;
	}
}
