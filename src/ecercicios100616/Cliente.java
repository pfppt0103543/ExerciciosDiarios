package ecercicios100616;

public class Cliente {
	String nome,
		morada,
		contacto;
	int nif;
	public Cliente(String nome, String morada, String contacto, int nif) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.contacto = contacto;
		this.nif = nif;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	
}
