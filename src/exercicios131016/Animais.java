package exercicios131016;

public class Animais {
	
	double preco,idade;
	String raca,sexo,tipo,cor, porte;

	public Animais(double preco, double idade, String raca, String sexo, String tipo, String cor, String porte) {
		super();
		this.preco = preco;
		this.idade = idade;
		this.raca = raca;
		this.sexo = sexo;
		this.tipo = tipo;
		this.cor = cor;
		this.porte = porte;
	}

	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getIdade() {
		return idade;
	}


	public void setIdade(double idade) {
		this.idade = idade;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}

}
