package com.mx.practica.dto;

import java.util.function.Predicate;

public class LibrosUtil {
	
	public static Predicate<LibroDto> filtrarCategoria (String categoria){
		return (LibroDto l) ->{return l.getCategoria().equals(categoria);};
	}

	public static boolean filtrarBuenosLibros(LibroDto libro) {
		Predicate<LibroDto> p1 = (LibroDto l) -> l.getCategoria().equals("Terror");
		Predicate<LibroDto> p2 = (LibroDto l) -> l.getPagina() < 10000;
		Predicate<LibroDto> p3 = (LibroDto l) -> l.getCategoria().equals("Romance");
		
		Predicate<LibroDto> pTotal = p1.and(p3).or(p2);
		return pTotal.test(libro);
		
	}
}
