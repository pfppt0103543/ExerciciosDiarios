package exercicios131016;

import exercicios131016.Animais;
import exercicios131016.Cliente;

public class Transaccao {
	
	public static final int COMPRA = 0;
	public static final int VENDA = 1;
	
	private int tipo;
	private Animais	animal;
	private Cliente		cliente;
	private double 		preco;
	
	
	public Transaccao(){
		
		
	}


	public Transaccao(int tipo, Animais animal, Cliente cliente, double preco) {
		super();
		this.tipo = tipo;
		this.animal = animal;
		this.cliente = cliente;
		this.preco = preco;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public Animais getAnimal() {
		return animal;
	}


	public void setAnimal(Animais animal) {
		this.animal = animal;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
