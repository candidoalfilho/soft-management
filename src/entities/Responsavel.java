package entities;

import java.util.ArrayList;

public class Responsavel extends Pessoa {
	
	private String localDeResidencia;
	private String numero;
	private String imageUrl;
	
	private ArrayList<Crianca> criancas = new ArrayList<>();

	public Responsavel(String nome, String localDeResidencia, String numero, String imageUrl) {
		super(nome);
		this.localDeResidencia = localDeResidencia;
		this.numero = numero;
		this.imageUrl = imageUrl;
	}

	public String getLocalDeResidencia() {
		return localDeResidencia;
	}

	public void setLocalDeResidencia(String localDeResidencia) {
		this.localDeResidencia = localDeResidencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public ArrayList<Crianca> getCriancas() {
		return criancas;
	}
	
	public void adicionarCrianca(Crianca crianca) {
		criancas.add(crianca);
	}
	
	public void removerCrianca(Crianca crianca) {
		criancas.remove(crianca);
	}

}
