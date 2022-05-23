package entities;

import java.util.ArrayList;

public class AuthUser extends Pessoa{
	private String passwordhash;
	private ArrayList<Doacao> doacoes = new ArrayList<>();
	
	public AuthUser(String nome, String passwordhash) {
		super(nome);
		this.passwordhash = passwordhash;
	}
	
	public void doar(Doacao doacao){
		doacoes.add(doacao);
		doacao.setPessoa(this);
	}; 
	 
	public ArrayList<Doacao> mostrarDoacoes() {
		return doacoes;
	};
	
	public void logar() {}

	public String getPasswordhash() {
		return passwordhash;
	}

	public void setPasswordhash(String passwordhash) {
		this.passwordhash = passwordhash;
	}

	public ArrayList<Doacao> getDoacoes() {
		return doacoes;
	}; 
	
	public void removerDoacao(Doacao doacao) {
		doacoes.remove(doacao);
	}
	
}

