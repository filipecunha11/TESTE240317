package application;

import java.util.ArrayList;

import misc.MData;
import model.Exposicao;
import view.Menu;

public class App {
	static ArrayList<Exposicao> exposicoes = new ArrayList<Exposicao>();
	public static void main(String[] args) {
		new MData(exposicoes);
		new Menu(exposicoes);
	}

}
