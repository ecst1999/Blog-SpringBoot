package com.bytecode.startcms.model;

import java.util.Date;

public class Categoria {

	private int idCategoria;

	private String nombre;

	private String descripcion;

	private Date fecha;

	private int categoriaSuperior;

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCategoriaSuperior() {
		return categoriaSuperior;
	}

	public void setCategoriaSuperior(int categoriaSuperior) {
		this.categoriaSuperior = categoriaSuperior;
	}
	
	
}
