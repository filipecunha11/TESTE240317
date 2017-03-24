package model;

public class Obra {
	
	String artista, titulo, categoria, tipo, data;
	
	public Obra(String artista,String titulo,String categoria,String tipo,String data){
		super();
		this.artista = artista;
		this.titulo = titulo;
		this.categoria = categoria;
		this.tipo = tipo;
		this.data = data;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
