package com.mx.practica.referenciaMetodosYConstructores;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvaluarNumeroPrimo2 {
	
	private int numero;
	
	public EvaluarNumeroPrimo2(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean evaluaNumeroPrimo(int numero) {
		IntPredicate esDivisible = i -> numero % i ==0;
		return numero > 1 && IntStream.range(2,numero).noneMatch(esDivisible);
	}
}
