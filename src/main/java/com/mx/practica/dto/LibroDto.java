package com.mx.practica.dto;

public class LibroDto {
	
	private String titulo;
	private String categoria;
	private Integer pagina;
	
	public LibroDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LibroDto(String titulo, String categoria, Integer pagina) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.pagina = pagina;
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
	public Integer getPagina() {
		return pagina;
	}
	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}
}
