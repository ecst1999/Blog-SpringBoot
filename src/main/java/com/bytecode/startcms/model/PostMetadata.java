package com.bytecode.startcms.model;

public class PostMetadata {

	private int idPostMetadata;
	
	private int idPost;
	
	private String clave;
	
	private String valor;
	
	private String tipo;

	public int getIdPostMetadata() {
		return idPostMetadata;
	}

	public void setIdPostMetadata(int idPostMetadata) {
		this.idPostMetadata = idPostMetadata;
	}

	public int getIdPost() {
		return idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
