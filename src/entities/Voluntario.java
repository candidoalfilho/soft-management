package entities;

import java.util.ArrayList;
import java.util.Date;

public class Voluntario extends Pessoa {
	
	private String passwordHash;
	private Date dataDeVinculo;
	private String imageUrl;
	private Date dataNasc;
	
	private Administrador administrador;
	private ArrayList<Crianca> criancas = new ArrayList<>();
	private ArrayList<Atividade> atividades = new ArrayList<>();


	public Voluntario(String nome,String passwordHash, Date dataDeVinculo, String imageUrl, Date dataNasc, Administrador administrador) {
		super(nome);
		this.passwordHash = passwordHash;
		this.dataDeVinculo = dataDeVinculo;
		this.imageUrl = imageUrl;
		this.dataNasc = dataNasc;
		this.administrador = administrador;
	}
	
	public ArrayList<Crianca> mostrarCriancasVinculadas(){
		return criancas;
	}
	
	public void delegarAtividade(Crianca crianca, Atividade atividade) {
		atividade.adicionarCrianca(crianca);	
		crianca.adicionarAtividade(atividade);
	}
	
	public void removerAtividade(Crianca crianca, Atividade atividade) {
		atividade.removerCrianca(crianca);
		crianca.removerAtividade(atividade);
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Date getDataDeVinculo() {
		return dataDeVinculo;
	}

	public void setDataDeVinculo(Date dataDeVinculo) {
		this.dataDeVinculo = dataDeVinculo;
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

	public ArrayList<Crianca> getCriancas() {
		return criancas;
	}

	public void adicionarCrianca(Crianca crianca) {
		criancas.add(crianca);
		crianca.setVoluntario(this);
	}
	
	public void removerCrianca(Crianca crianca) {
		criancas.remove(crianca);
		crianca.setVoluntario(null);
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}
	
	public void adicionarAtividade(Atividade atividade) {
		atividades.add(atividade);
		atividade.adicionarVoluntario(this);
	}
	
	public void removerAtividade(Atividade atividade) {
		atividades.remove(atividade);
		atividade.removerVoluntario(this);
	}


}
