package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorExposicoes;
import model.Exposicao;

public class EntradaVisitantes {
	public EntradaVisitantes(int id, ArrayList<Exposicao> exposicoes){
		System.out.print("Insira a quantidade de visitantes que entraram: ");
		int quantVis = new Scanner(System.in).nextInt();
		GestorExposicoes ge = new GestorExposicoes(exposicoes);
		ge.addVisitantes(id, quantVis);
		
		System.out.println("\nVisitantes adicionados com sucesso!\nA Exposicao " + exposicoes.get(id).getNome() + " agora tem: ");
		System.out.println(exposicoes.get(id).getQuantVisitantes() + " visitantes");
		System.out.println("Lucro: " + exposicoes.get(id).getQuantVisitantes() * exposicoes.get(id).getPreco() + "€");
	}
}
