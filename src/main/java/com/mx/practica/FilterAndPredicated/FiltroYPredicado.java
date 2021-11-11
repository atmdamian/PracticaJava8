package com.mx.practica.FilterAndPredicated;

import java.util.Arrays;
import java.util.List;

import com.mx.practica.dto.LibroDto;

public class FiltroYPredicado {

	public FiltroYPredicado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void Test1() {
		LibroDto l= new LibroDto("Osos cariñosos", "caricatura", 1000);
		LibroDto l2= new LibroDto("Hallowen Kills", "Terror", 2000);
		LibroDto l3= new LibroDto("Lobos y Vampiros", "Romance", 3000);
		
		List<LibroDto> libros = Arrays.asList(l,l2,l3);
		libros.stream().filter(libro -> libro.getPagina() > 100)
		.map(libro -> libro.getTitulo()).forEach(System.out::println);
	}
	
}
