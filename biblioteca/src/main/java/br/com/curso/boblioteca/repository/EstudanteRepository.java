package br.com.curso.boblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.biblioteca.entity.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
