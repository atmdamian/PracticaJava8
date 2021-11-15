package com.mx.practica.referenciaMetocccdosYConstructores;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvaluarNumeroPrimo {

	public static boolean evaluaNumeroPrimo(int numero) {
		IntPredicate esDivisible = i -> numero % i ==0;
		return numero > 1 && IntStream.range(2,numero).noneMatch(esDivisible);
	}
	
	public static boolean esPar(Integer numero) {
		return true;
	}
	
	public static boolean esPositivo() {
		return false;
	}
	public static void isRange() {
		 IntStream stream = IntStream.range(6, 10);

	        stream.forEach(System.out::println);
	}
}