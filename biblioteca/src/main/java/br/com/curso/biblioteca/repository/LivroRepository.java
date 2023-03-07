package br.com.curso.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.biblioteca.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	//Pesquisando por palavras-chaves
	public Livro findByIsbn(String isbn);

}
