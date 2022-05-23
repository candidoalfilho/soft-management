package entities;

import java.util.ArrayList;
import java.util.Date;

public class Doacao {
	private int id;
	private String quantia;
	private Date date;
	private Pessoa pessoa; 

	public Doacao(int id) {
		this.id = id;
	}
	
	public Doacao(int id, String quantia, Date date) {
		super();
		this.id = id;
		this.quantia = quantia;
		this.date = date;
}

	public String getQuantia() {
		return quantia;
	}

	public void setQuantia(String quantia) {
		this.quantia = quantia;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	} 
	
}

