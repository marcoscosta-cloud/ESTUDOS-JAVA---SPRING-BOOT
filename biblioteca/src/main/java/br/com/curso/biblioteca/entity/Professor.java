package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;

@Entity
public class Professor extends Usuario {
	
	private String titulacao;

	public Professor() {
		
	}

	public Professor(Long id, String nome, String rg, String email, String titulacao) {
		super(id, nome, rg, email);
		this.titulacao = titulacao;
		
	}

	public String getTitulacao() {
		return titulacao;
	}
	
	

}

