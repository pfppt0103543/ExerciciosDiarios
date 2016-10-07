package exercicios061016;

public class clube {
	String nome;
	int numJogos,pontosFora,pontosCasa;
	
	public clube(){
		
	}

	public clube(String nome, int numJogos, int pontosFora, int pontosCasa) {
		super();
		this.nome = nome;
		this.numJogos = numJogos;
		this.pontosFora = pontosFora;
		this.pontosCasa = pontosCasa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumJogos() {
		return numJogos;
	}

	public void setNumJogos(int numJogos) {
		this.numJogos = numJogos;
	}

	public int getPontosFora() {
		return pontosFora;
	}

	public void setPontosFora(int pontosFora) {
		this.pontosFora = pontosFora;
	}

	public int getPontosCasa() {
		return pontosCasa;
	}

	public void setPontosCasa(int pontosCasa) {
		this.pontosCasa = pontosCasa;
	}
	
}
