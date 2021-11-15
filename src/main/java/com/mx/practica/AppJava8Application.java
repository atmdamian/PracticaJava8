package com.mx.practica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mx.practica.FilterAndPredicated.FiltroYPredicado;
import com.mx.practica.dto.LibroDto;
import com.mx.practica.referenciaMetodosYConstructores.ConstructorReferencia;
import com.mx.practica.referenciaMetodosYConstructores.EvaluarNumeroPrimo;
import com.mx.practica.referenciaMetodosYConstructores.EvaluarNumeroPrimo2;
import com.mx.practica.referenciaMetodosYConstructores.NumeroPrimo;
import com.mx.practica.referenciaMetodosYConstructores.iConstructorReferencia;

@SpringBootApplication
public class AppJava8Application {

	public static void main(String[] args) {
		SpringApplication.run(AppJava8Application.class, args);
		
		/*List<Integer> nums = Arrays.asList(1,2,3,4,5,34,32,21);
		nums.stream().filter(EvaluarNumeroPrimo::evaluaNumeroPrimo)
		.collect(Collectors.toList())
		.forEach(System.out::println);*/
		
		 constructorReferencia();
		
	}
	
	public static void filtroYPredicadoTest1() {
		FiltroYPredicado obj1= new FiltroYPredicado();
		obj1.Test1();
	}
	public static  void filtroYPredicadoTest2() {
		FiltroYPredicado obj1= new FiltroYPredicado();
		obj1.TestUtil();
	}
	public static  void filtroYPredicadoTest3() {
		FiltroYPredicado obj1= new FiltroYPredicado();
		obj1.TestUtil2();
	}
	public static boolean metodoReferencia(NumeroPrimo n,int numero) {
		return n.isPrimo(numero);
	}
	public static void metodoReferenciaAMetodosIntancia() {
		EvaluarNumeroPrimo2 obj=new EvaluarNumeroPrimo2(19);
		// Aquí, se crea una referencia del método esDivisor() en miNum.
		NumeroPrimo num = obj::evaluaNumeroPrimo;
	     // Ahora, se usa para llamar a esDivisor() a través de prueba().

		if(num.isPrimo(7))
			System.out.println("3 es un divisor de "+obj.getNumero());
	}
	
	public static void constructorReferencia() {
		iConstructorReferencia ref= ConstructorReferencia::new;
		ConstructorReferencia cons =ref.prueba("Damian", 28, "Atanacio");
		
		System.out.println(cons.toString());
	}

}
