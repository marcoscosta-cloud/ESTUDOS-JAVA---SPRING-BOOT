package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Entity;


@Entity

public class Emprestimo {
	
	private Long id;
	
	private Date date;

	
	public Emprestimo() {
		
	}
	
	
}
