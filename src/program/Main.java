package program;

import java.util.ArrayList;

import entities.Atividade;
import entities.Crianca;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Atividade a1 = new Atividade("Desenhar");
		Crianca c1 = new Crianca("João");
		Crianca c2 = new Crianca("Maria");
		
		c1.adicionarAtividade(a1);
		c2.adicionarAtividade(a1);
		
		ArrayList<Crianca> criancas = a1.mostrarCriancas();
		for (Crianca crianca:criancas) {
			System.out.println(crianca.getNome());
		}
		
		ArrayList<Atividade> atividades = c2.getAtividades();
		System.out.println("Atividades da segunda pessoa: ");
		for (Atividade atividade: atividades) {
			System.out.println(atividade.getNome());
		}
	}

}
