package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorExposicoes;
import model.Exposicao;
import model.Obra;

public class InserirObras {
	public InserirObras(int id, ArrayList<Exposicao> exposicoes){
		String titulo, artista, categoria, tipo, data;
		
		int opc = 1;
		Obra obra = null;
		
		while (opc == 1){
			System.out.print("Insira o nome da obra: ");
			titulo = new Scanner(System.in).nextLine();
			System.out.print("Insira o nome do artista: ");
			artista = new Scanner(System.in).nextLine();
			System.out.print("Insira a categoria da obra: ");
			categoria = new Scanner(System.in).nextLine();
			System.out.print("Insira o tipo de obra: ");
			tipo = new Scanner(System.in).nextLine();
			System.out.print("Insira a data de realização da obra: ");
			data = new Scanner(System.in).nextLine();
			
			obra = new Obra(artista, titulo, categoria, tipo, data);

			GestorExposicoes ge = new GestorExposicoes(exposicoes);
			ge.addObras(id, obra);
			
			System.out.print("Pretende inserir mais obras? \n> ");
			opc = new Scanner(System.in).nextInt();
		}

	}
}
