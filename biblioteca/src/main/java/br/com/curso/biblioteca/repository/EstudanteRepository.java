package br.com.curso.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.biblioteca.entity.Estudante;


@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

	//Pesquisando por palavras-chaves
		public Estudante findByRgAndMatricula(String rg, String matricula);
}
