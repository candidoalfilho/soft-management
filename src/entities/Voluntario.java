package entities;

import java.util.ArrayList;
import java.util.Date;

public class Voluntario extends Pessoa {
	
	private String passwordHash;
	private Date dataDeVinculo;
	private String imageUrl;
	private Date dataNasc;
	
	private Administrador administrador;
	private ArrayList<Crianca> criancas;
	private ArrayList<Atividade> atividades;


	public Voluntario(String nome,String passwordHash, Date dataDeVinculo, String imageUrl, Date dataNasc) {
		super(nome);
		this.passwordHash = passwordHash;
		this.dataDeVinculo = dataDeVinculo;
		this.imageUrl = imageUrl;
		this.dataNasc = dataNasc;
	}
	
	public ArrayList<Crianca> mostrarCriancasVinculadas(){
		return criancas;
	}
	
	public void delegarAtividade(Crianca crianca, Atividade atividade) {
		atividade.adicionarCrianca(crianca);	
	}
	
	public void removerAtividade(Crianca crianca, Atividade atividade) {
		atividade.removerCrianca(crianca);
	}
	
	

}
