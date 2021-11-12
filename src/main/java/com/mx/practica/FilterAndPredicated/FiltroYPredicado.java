package com.mx.practica.FilterAndPredicated;

import java.util.Arrays;
import java.util.List;

import com.mx.practica.dto.LibroDto;
import com.mx.practica.dto.LibrosUtil;

public class FiltroYPredicado {
	
	
	List<LibroDto> libros;

	public FiltroYPredicado() {
		super();
		LibroDto l= new LibroDto("Osos cariñosos", "caricatura", 1000);
		LibroDto l2= new LibroDto("Hallowen Kills", "Terror", 20000);
		LibroDto l3= new LibroDto("Lobos y Vampiros", "Romance", 30000);
		LibroDto l4= new LibroDto("Mil sombras de Gry", "Romance", 30000);
		LibroDto l5= new LibroDto("Manzana y Sebollin", "caricatura", 1000);


		libros = Arrays.asList(l,l2,l3);	
	}
	
	
	public void Test1() {
		//filtran usando una expresión lambda de una forma directa. No tiene una gran capacidad de reutilización.
		libros.stream().filter(libro -> libro.getPagina() > 100)
		.map(libro -> libro.getTitulo()).forEach(System.out::println);
	}
	
	public void TestUtil() {
		//lo más habitual en muchos casos es generar expresiones funcionales complejas y luego ligarlas
		//a través de métodos de referencia
		libros.stream().filter(LibrosUtil.filtrarCategoria("caricatura"))
		.map(libro ->libro.getTitulo()).forEach(System.out::println);
		
	}
	
	public void TestUtil2() {
		//lo más habitual en muchos casos es generar expresiones funcionales complejas y luego ligarlas
		//a través de métodos de referencia
		libros.stream().filter(LibrosUtil::filtrarBuenosLibros)
		.map(LibroDto::getTitulo).forEach(System.out::println);
		
	}
}
