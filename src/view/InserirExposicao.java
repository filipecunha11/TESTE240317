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
		System.out.print("Insira o nome da exposição: ");
		nome = new Scanner(System.in).nextLine();
		System.out.print("Insira a data de inicio da exposição: ");
		dataIni = new Scanner(System.in).nextLine();
		System.out.print("Insira a data de fim da exposição: ");
		dataFim = new Scanner(System.in).nextLine();
		System.out.print("Insira o preço da exposição: ");
		preco = new Scanner(System.in).nextFloat();
		System.out.print("Insira a quantidade de visitantes da exposição: ");
		quantVisitantes = new Scanner(System.in).nextInt();
		
		System.out.print("Pretende inserir obras à exposição? [1 - sim]:\n");
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
			System.out.print("Insira a data de realização da obra: ");
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
