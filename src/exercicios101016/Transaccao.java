package exercicios101016;

public class Transaccao {
	public static final int COMPRA = 0;
	public static final int VENDA = 1;
		
	private int tipo;
	private Automovel	carro;
	private Cliente		cliente;
	private double 		preco;
	
	public Transaccao(int tipo, Automovel carro, Cliente cliente, double preco) {
		super();
		this.tipo = tipo;
		this.carro = carro;
		this.cliente = cliente;
		this.preco	= preco;
	}
	
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Automovel getCarro() {
		return carro;
	}
	public void setCarro(Automovel carro) {
		this.carro = carro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getPreco() {
		if (this.tipo == Transaccao.VENDA)
			return preco + 500;
		
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}				
}
