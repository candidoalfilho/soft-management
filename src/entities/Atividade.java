package entities;

import java.util.ArrayList;
import java.util.Date;

public class Atividade {
	private String nome;
	private String local;
	private Date horario;
	
	private ArrayList<Crianca> criancas = new ArrayList<>();
	private ArrayList<Voluntario> voluntarios = new ArrayList<>();
	
	public Atividade(String nome) {
		this.nome = nome;
	}
	
	public Atividade(String nome, String local, Date horario) {
		super();
		this.nome = nome;
		this.local = local;
		this.horario = horario;
	}
	
	public ArrayList<Voluntario> mostrarVoluntarios(){
		return voluntarios;
	}
	
	public ArrayList<Crianca> mostrarCriancas(){
		return criancas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	public void adicionarCrianca(Crianca crianca) {
		criancas.add(crianca);
		crianca.adicionarAtividade(this);
	}
	
	public void removerCrianca(Crianca crianca) {
		criancas.remove(crianca);
		crianca.removerAtividade(this);
	}
	
	public void adicionarVoluntario(Voluntario voluntario) {
		voluntarios.add(voluntario);
	}
	
	public void removerVoluntario(Voluntario voluntario) {
		voluntarios.remove(voluntario);
	}
	
	
}
