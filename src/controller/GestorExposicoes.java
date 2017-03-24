package controller;

import java.util.ArrayList;

import model.Exposicao;
import model.Obra;

public class GestorExposicoes {
	
	private ArrayList<Exposicao> exposicoes;

	public GestorExposicoes(ArrayList<Exposicao> exposicoes){
		this.exposicoes = exposicoes;
	}
	
	public void addExposicao(String nome, String dataIni, String dataFim, int quantVisitantes, float preco, ArrayList<Obra> obras){
		Exposicao expo = new Exposicao(nome, dataIni, dataFim, quantVisitantes, preco, obras);
		exposicoes.add(expo);
		exposicoes.get(exposicoes.size()-1).setId(exposicoes.size()-1);
	}
	
	public int verificarLucro(){
		int max = 0;
		for (int i = 1 ; i < exposicoes.size() ; i++){
			if (exposicoes.get(i).getPreco() * exposicoes.get(i).getQuantVisitantes() > exposicoes.get(max).getPreco() * exposicoes.get(max).getQuantVisitantes()){
				max = i;
			}
		}
		return exposicoes.get(max).getId();
	}
	
	public void addObras(int id, Obra obra){
		exposicoes.get(id).getObras().add(obra);
	}
	
	public void addVisitantes(int id, int quantidade){
		exposicoes.get(id).setQuantVisitantes(exposicoes.get(id).getQuantVisitantes() + quantidade);
	}
	
}
