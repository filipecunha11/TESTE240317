package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Exposicao;

public class Menu {
	public Menu(ArrayList<Exposicao> exposicoes){
		int menu = -1, id;
		while (menu != 0) {
			System.out.println("\n\nMENU");
			System.out.println("1. Inserir Exposição");
			System.out.println("2. Adicionar Obras a Exposição");
			System.out.println("3. Listar Exposição&Obras");
			System.out.println("4. Procurar Exposição");
			System.out.println("5. Verificar Lucros");
			System.out.println("6. Nova entrada visitantes");
			System.out.print("0. Sair\n> ");
			menu = new Scanner(System.in).nextInt();
			
			switch (menu){
			case 1: new InserirExposicao(exposicoes);
				break;
			case 2:
				System.out.print("\nInsira o ID da exposicao: ");
				id = new Scanner(System.in).nextInt();
				new InserirObras(id, exposicoes);
				break;
			case 3: new ListarExposicao(0, exposicoes.size(), exposicoes);
				break;
			case 4:
				System.out.print("\nInsira o ID da exposição: ");
				id = new Scanner(System.in).nextInt();
				new ListarExposicao(id, id+1, exposicoes);
				break;
			case 5: new VerificarLucros(exposicoes);
				break;
			case 6: 
				System.out.print("\nInsira o ID da exposição: ");
				id = new Scanner(System.in).nextInt();
				new EntradaVisitantes(id, exposicoes);
				break;
			}
		}
	}
}
