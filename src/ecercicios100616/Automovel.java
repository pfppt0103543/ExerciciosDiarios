package ecercicios100616;

public class Automovel {
	double preco;
	int cilidrada,
		kms,
		ano;
	String	marca,
			modelo;
	
	public Automovel(double preco, int cilidrada, int kms, int ano, String marca, String modelo) {
		super();
		this.preco = preco;
		this.cilidrada = cilidrada;
		this.kms = kms;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCilidrada() {
		return cilidrada;
	}

	public void setCilidrada(int cilidrada) {
		this.cilidrada = cilidrada;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
}
