package com.bytecode.startcms.model;

public class UsuarioMetadata {

	private int idUsuarioMetadata;
	
	private int idUsuario;
	
	private String clave;
	
	private String valor;
	
	private String tipo;

	public int getIdUsuarioMetadata() {
		return idUsuarioMetadata;
	}

	public void setIdUsuarioMetadata(int idUsuarioMetadata) {
		this.idUsuarioMetadata = idUsuarioMetadata;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
