package br.com.curso.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.biblioteca.entity.Revista;

@Repository
public interface RevistaRepository extends JpaRepository<Revista, Long> {
	//Pesquisando por palavras-chaves
	public Revista findByNumero(Integer numero);

}
