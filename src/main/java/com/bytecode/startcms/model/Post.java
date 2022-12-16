package com.bytecode.startcms.model;

public class Post {

	private int idPost;
	
	private String titulo;
	
	private String slug;
	
	private String extracto;
	
	private int idUsuario;
	
	private int categoria;
	
	private String imagenDestacada;
	
	private String tipo;

	public int getIdPost() {
		return idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getExtracto() {
		return extracto;
	}

	public void setExtracto(String extracto) {
		this.extracto = extracto;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getImagenDestacada() {
		return imagenDestacada;
	}

	public void setImagenDestacada(String imagenDestacada) {
		this.imagenDestacada = imagenDestacada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
