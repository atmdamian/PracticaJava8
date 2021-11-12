package com.mx.practica;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mx.practica.FilterAndPredicated.FiltroYPredicado;
import com.mx.practica.dto.LibroDto;

@SpringBootApplication
public class AppJava8Application {

	public static void main(String[] args) {
		SpringApplication.run(AppJava8Application.class, args);
		filtroYPredicadoTest3();
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

}
