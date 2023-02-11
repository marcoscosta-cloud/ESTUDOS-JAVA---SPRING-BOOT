package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Entity;


@Entity
public class Postagem extends ObraDigital {
	
	private Enum plataforma;
	
	private String conteudo;

	
	public Postagem() {
		
	}

	public Postagem(Long id, String titulo, Date dataPublicacao, String url, Enum plataforma, String conteudo) {
		super(id, titulo, dataPublicacao, url);
		this.plataforma = plataforma;
		this.conteudo = conteudo;
	}

	public Enum getPlataforma() {
		return plataforma;
	}

	public String getConteudo() {
		return conteudo;
	}

}

