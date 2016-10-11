package exercicios101016;

public class Automovel {
	double preco;
	int cilindrada;
	String marca;
	String modelo;
	int kms;
	int ano;
	
	public Automovel(double preco, int cilindrada, String marca, String modelo, int kms, int ano) {
		super();
		this.preco = preco;
		this.cilindrada = cilindrada;
		this.marca = marca;
		this.modelo = modelo;
		this.kms = kms;
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
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
	
	
	
	
}
