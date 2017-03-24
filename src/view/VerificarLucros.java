package view;

import java.util.ArrayList;

import controller.GestorExposicoes;
import model.Exposicao;

public class VerificarLucros {
	public VerificarLucros(ArrayList<Exposicao> exposicoes){
		GestorExposicoes ge = new GestorExposicoes(exposicoes);
		if (exposicoes.size() > 0){
			System.out.print("\nA exposi��o que mais lucrou foi: ");
			int id = ge.verificarLucro();
			new ListarExposicao(exposicoes.get(id).getId(), exposicoes.get(id).getId()+1, exposicoes);
			System.out.print("\nLucro: " + exposicoes.get(id).getPreco() * exposicoes.get(id).getQuantVisitantes() + "�");
		}
		else
			System.out.println("\nN�o existem exposi��es.");
		
	}
}
