package entities;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Pessoa {
	
	private String passwordHash;
	private String imageUrl;
	private Date dataNasc;
	private ArrayList<Voluntario> voluntarios;
	
	public Administrador(String nome) {
		super(nome);
	}

	public Administrador(String nome,String passwordHash, String imageUrl, Date dataNasc) {
		super(nome);
		this.passwordHash = passwordHash;
		this.imageUrl = imageUrl;
		this.dataNasc = dataNasc;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public ArrayList<Voluntario> getVoluntarios() {
		return voluntarios;
	}
	
	public void adicionarVoluntario(Voluntario voluntario) {
		voluntarios.add(voluntario);
	}
	
	public void removerVoluntario(Voluntario voluntario) {
		voluntarios.remove(voluntario);
	}	
	
	public ArrayList<Pessoa> encontrarPessoa(String id){
		return new ArrayList<Pessoa>();
	}
	
	public ArrayList<Crianca> mostrarCriancas(){
		return new ArrayList<Crianca>();
	}
	
	public ArrayList<AuthUser> mostrarUsuarios(){
		return new ArrayList<AuthUser>();
	}
	
	public void delegarAtividade(Voluntario voluntario, Atividade atividade) {
		voluntario.adicionarAtividade(atividade);
		atividade.adicionarVoluntario(voluntario);
	}
	
	public void desvincularPessoa() {
		
	}
	
	public void vincularPessoa() {
			
	}
	
	public void editarPessoa() {
		
	}
	

}
