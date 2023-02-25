package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Entity;

import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name= "TB_EXEMPLAR_OBRA")
@PrimaryKeyJoinColumn(name = "idObra")
public abstract class ObraDigital extends Obra {
	
	protected String url;

	public ObraDigital() {
		
	}

	public ObraDigital(Long id, String titulo, Date dataPublicacao, String url) {
		super(id, titulo, dataPublicacao);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

}

