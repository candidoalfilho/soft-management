package entities;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Pessoa {
	
	private String passwordHash;
	private String imageUrl;
	private Date dataNasc;
	private ArrayList<String> voluntarios;
	
	public Administrador(String nome) {
		super(nome);
	}

	public Administrador(String nome,String passwordHash, String imageUrl, Date dataNasc) {
		super(nome);
		this.passwordHash = passwordHash;
		this.imageUrl = imageUrl;
		this.dataNasc = dataNasc;
	}
	
	public Pessoa encontrarPessoa(String id) {
		return new Administrador("teste");
	}
	
	public ArrayList<Crianca> mostrarCriancas(){
		return new ArrayList<Crianca>();
	}
	
	
	
	
	
	

}
