package misc;

import java.util.ArrayList;

import controller.GestorExposicoes;
import model.Exposicao;
import model.Obra;

public class MData {

		
	public MData(ArrayList<Exposicao> exposicoes){
		GestorExposicoes ge = new GestorExposicoes(exposicoes);
		ArrayList<Obra> obras = new ArrayList<Obra>();
		Obra obra = new Obra("Leonardo DaVinci", "Mona Lisa", "Arte Renascentista", "Pintura", "1503");
		obras.add(obra);
		obra = new Obra("Edvard Munch", "O Grito", "Pintura de G�nero", "Pintura", "1893");
		obras.add(obra);
		obra = new Obra("Desconhecido", "V�nus de Milo", "Arte Renascentista", "Escultura", "Desconhecido");
		obras.add(obra);
		ge.addExposicao("Pinturas da Hist�ria", "24/03/2017", "28/03/2017", 230, 4.50f, obras);
	}
}
