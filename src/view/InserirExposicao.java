package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorExposicoes;
import model.*;

public class InserirExposicao {
	
	private String nome, dataIni, dataFim;
	private int quantVisitantes, opc; private float preco;
	private ArrayList<Obra> obras = new ArrayList<Obra>();
	
	String titulo, artista, categoria, tipo, data;
	
	public InserirExposicao(ArrayList<Exposicao> exposicoes){
		System.out.print("Insira o nome da exposi��o: ");
		nome = new Scanner(System.in).nextLine();
		System.out.print("Insira a data de inicio da exposi��o: ");
		dataIni = new Scanner(System.in).nextLine();
		System.out.print("Insira a data de fim da exposi��o: ");
		dataFim = new Scanner(System.in).nextLine();
		System.out.print("Insira o pre�o da exposi��o: ");
		preco = new Scanner(System.in).nextFloat();
		System.out.print("Insira a quantidade de visitantes da exposi��o: ");
		quantVisitantes = new Scanner(System.in).nextInt();
		
		System.out.print("Pretende inserir obras � exposi��o? [1 - sim]:\n");
		opc = new Scanner(System.in).nextInt();
		while (opc == 1){
			System.out.print("Insira o nome da obra: ");
			titulo = new Scanner(System.in).nextLine();
			System.out.print("Insira o nome do artista: ");
			artista = new Scanner(System.in).nextLine();
			System.out.print("Insira a categoria da obra: ");
			categoria = new Scanner(System.in).nextLine();
			System.out.print("Insira o tipo de obra: ");
			tipo = new Scanner(System.in).nextLine();
			System.out.print("Insira a data de realiza��o da obra: ");
			data = new Scanner(System.in).nextLine();
			
			Obra obra = new Obra(artista, titulo, categoria, tipo, data);
			obras.add(obra);
			
			System.out.print("Pretende inserir mais obras? \n> ");
			opc = new Scanner(System.in).nextInt();
		}
		
		 GestorExposicoes gerExpo = new GestorExposicoes(exposicoes);
		 gerExpo.addExposicao(nome, dataIni, dataFim, quantVisitantes, preco, obras);
	}
}
