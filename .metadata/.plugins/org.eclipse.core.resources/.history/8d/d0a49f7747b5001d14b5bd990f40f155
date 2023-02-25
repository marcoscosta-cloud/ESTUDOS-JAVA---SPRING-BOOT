package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name= "TB_EXEMPLAR_OBRA")
@PrimaryKeyJoinColumn(name = "idObra")
public abstract class ObraFisica extends Obra {

	protected String codLocalizacao;

	public ObraFisica() {
	}

	public ObraFisica(Long id, String titulo, Date dataPublicacao, String codLocalizacao) {
		super(id, titulo, dataPublicacao);
		this.codLocalizacao = codLocalizacao;
	}

	public String getCodLocalizacao() {
		return codLocalizacao;
	}

}


