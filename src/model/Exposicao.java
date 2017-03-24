package model;

import java.util.ArrayList;

public class Exposicao {
	
	String nome, dataIni, dataFim;
	int id, quantVisitantes;
	float preco;
	ArrayList<Obra> obras = new ArrayList<Obra>();
	
	public Exposicao(String nome, String dataIni, String dataFim, int quantVisitantes, float preco, ArrayList<Obra> obras){
		super();
		this.nome = nome;
		this.dataIni = dataIni;
		this.dataFim = dataFim;
		this.quantVisitantes = quantVisitantes;
		this.preco = preco;
		this.obras = obras;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataIni() {
		return dataIni;
	}

	public void setDataIni(String dataIni) {
		this.dataIni = dataIni;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public int getQuantVisitantes() {
		return quantVisitantes;
	}

	public void setQuantVisitantes(int quantVisitantes) {
		this.quantVisitantes = quantVisitantes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}
	
	
}
