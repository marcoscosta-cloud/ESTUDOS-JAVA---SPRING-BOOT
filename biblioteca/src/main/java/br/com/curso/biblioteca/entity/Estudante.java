package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;


@Entity
public class Estudante extends Usuario {
	
	private String matricula;

	public Estudante() {
		
	}

	public Estudante(Long id, String nome, String rg, String email, String matricula) {
		super(id, nome, rg, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	

}
