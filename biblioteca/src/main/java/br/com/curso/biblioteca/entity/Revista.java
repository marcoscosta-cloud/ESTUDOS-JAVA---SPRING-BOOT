package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name= "TB_EXEMPLAR_REVISTA")
public class Revista extends ObraFisica {
	
	@Column(nullable = false)
	private Integer numero;

	public Revista() {
		
	}

	public Revista(Long id, String titulo, Date dataPublicacao, String codLocalizacao, Integer numero) {
		super(id, titulo, dataPublicacao, codLocalizacao);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

}

