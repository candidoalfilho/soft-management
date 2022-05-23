package entities;

import java.util.ArrayList;
import java.util.Date;

public class Crianca extends Pessoa {
	
	private Date dataDeVinculo;
	private String condicao;
	private Date dataNasc;
	private String imageUrl;
	
	private Voluntario voluntario;
	private ArrayList<Atividade> atividades = new ArrayList<>();
	private Responsavel responsavel;

	public Crianca(String nome) {
		super(nome);
	}
	
	public Crianca(String nome, Date dataDeVinculo, String condicao, Date dataNasc, String imageUrl, Responsavel responsavel) {
		super(nome);
		this.dataDeVinculo = dataDeVinculo;
		this.condicao = condicao;
		this.dataNasc = dataNasc;
		this.imageUrl = imageUrl;
		this.responsavel = responsavel;
	}
	
	public void adicionarAtividade(Atividade atividade) {
		atividades.add(atividade);
		atividade.adicionarCrianca(this);
	}
	
	public void removerAtividade(Atividade atividade) {
		atividades.remove(atividade);
		atividade.removerCrianca(this);
	}

	public Date getDataDeVinculo() {
		return dataDeVinculo;
	}

	public void setDataDeVinculo(Date dataDeVinculo) {
		this.dataDeVinculo = dataDeVinculo;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Voluntario getVoluntario() {
		return voluntario;
	}

	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
		voluntario.adicionarCrianca(this);
	}

	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
		responsavel.adicionarCrianca(this);
	}
	
	
	
	
	
	
	
	

}
