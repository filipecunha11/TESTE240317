package view;

import java.util.ArrayList;

import model.Exposicao;

public class ListarExposicao {
	public ListarExposicao(int startId, int endId, ArrayList<Exposicao> exposicoes){

		for (int i = startId; i < endId; i++){
			Exposicao expo = exposicoes.get(i);
			if (expo != null){
				System.out.println("\nID: " + expo.getId());
				System.out.println("Nome: " + expo.getNome());
				System.out.println("Data Início: " + expo.getDataIni());
				System.out.println("Data Fim:    " + expo.getDataFim());
				System.out.println("Preço: " + expo.getPreco());
				System.out.println("Quantidade Visitantes: " + expo.getQuantVisitantes());
				if (expo.getObras().size() > 0){
					System.out.println("Obras: ");
					for (int j = 0 ; j < expo.getObras().size() ; j++ ){
						System.out.println(" - Título: " + expo.getObras().get(j).getTitulo());
						System.out.println(" - Artista: " + expo.getObras().get(j).getArtista());
						System.out.println(" - Categoria: " + expo.getObras().get(j).getCategoria());
						System.out.println(" - Tipo: " + expo.getObras().get(j).getTipo());
						System.out.println(" - Data: " + expo.getObras().get(j).getData() + "\n");
					}
				}
				else
					System.out.println("Obras: Esta exposição não tem obras");
			}
			else{
				System.out.println("Não existem exposições com esse ID.");
			}
			
			
		}
	}
}
