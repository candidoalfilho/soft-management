package entities;

import java.util.ArrayList;

public class UnloggedUser extends Pessoa{
	private ArrayList<Doacao> doacoes = new ArrayList<>();
	
	private void doar(Doacao doacao){
		doacoes.add(doacao);
		doacao.setPessoa(this);
	};
	
	private void registrar(){};
	
	public UnloggedUser(String nome) {
		super(nome); 
		}
	
	
	}
