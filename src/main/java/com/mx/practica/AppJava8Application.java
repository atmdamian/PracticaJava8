package com.mx.practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mx.practica.FilterAndPredicated.FiltroYPredicado;

@SpringBootApplication
public class AppJava8Application {

	public static void main(String[] args) {
		SpringApplication.run(AppJava8Application.class, args);
		FiltroYPredicado obj1= new FiltroYPredicado();
		obj1.Test1();
	}

}
