package br.com.curso.biblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.curso.biblioteca.entity.Estudante;
import br.com.curso.biblioteca.entity.Livro;
import br.com.curso.biblioteca.entity.Postagem;
import br.com.curso.biblioteca.entity.Professor;
import br.com.curso.biblioteca.entity.Revista;
import br.com.curso.biblioteca.repository.EstudanteRepository;
import br.com.curso.biblioteca.repository.LivroRepository;
import br.com.curso.biblioteca.repository.PostagemRepository;
import br.com.curso.biblioteca.repository.ProfessorRepository;
import br.com.curso.biblioteca.repository.RevistaRepository;

@SpringBootApplication

public class BibliotecaApplication {

	public static final Logger log = LoggerFactory.getLogger(BibliotecaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);

	}
//		@Bean
//		public CommandLineRunner executar(LivroRepository livroRepository) {
//			return(args) -> {
//				//Apagando todos os livros
//				livroRepository.deleteAll();
//				
//				String titulo = "Dom Casmurro";
//				String autor = "Machado de Assis";
//				String codLocalizacao = "ABC123";
//				String isbn = "123456789";
//				Date dataPublicacao = (new SimpleDateFormat("dd/MM/yyyy")).parse("12/03/1879");
//				
//				Livro livro = new Livro(null, titulo, dataPublicacao, codLocalizacao, autor, isbn);
//				livro = livroRepository.save(livro);
//				log.info("Livro Cadastrado:");
//				log.info(livro.toString());
//				
//				log.info("Pesquisando um livro pelo ISBN...");
//				livro = livroRepository.findByIsbn(isbn);
//				log.info(livro.toString());
//				
//			};
//		}

//			@Bean
//			public CommandLineRunner executar(EstudanteRepository estudanteRepository) {
//				return(args) -> {
//			//Apagando todos os estudantes
//			estudanteRepository.deleteAll();
//			
//			String nome = "Marcos Costa";
//			String rg = "MG7148267";
//			String email = "mmarcospc@yahoo.com.br";
//			String matricula = "21091980";
//			
//			Estudante estudante = new Estudante(null, nome, rg, email, matricula);
//			estudante = estudanteRepository.save(estudante);
//		
//			log.info("Estudante Cadastrado:");
//			log.info(estudante.toString());
//			
//			log.info("Pesquisando um Estudante pelo RG e Matricula...");
//			estudante = estudanteRepository.findByRgAndMatricula(rg, matricula);
//			log.info(estudante.toString());
//			
//		};
//	}

//			@Bean
//			public CommandLineRunner executar(ProfessorRepository professorRepository) {
//				return(args) -> {
//			//Apagando todos os professores
//			professorRepository.deleteAll();
//			
//			String nome = "Alessandra Patriarca";
//			String rg = "MG6037156";
//			String email = "alessandra.p@yahoo.com.br";
//			String titulacao = "Professora de Java";
//			
//			Professor professor = new Professor(null, nome, rg, email, titulacao);
//			professor = professorRepository.save(professor);
//	
//		
//			log.info("Professor Cadastrado:");
//			log.info(professor.toString());
//			
//			log.info("Pesquisando um Estudante pela titulação...");
//			professor = professorRepository.findByTitulacao(titulacao);
//			log.info(professor.toString());
//			
//			
//		};
//}

//	@Bean
//	public CommandLineRunner executar(RevistaRepository revistaRepository) {
//		return (args) -> {
//			// Apagando todas as revistas
//			revistaRepository.deleteAll();
//
//			String titulo = "National Geographic";
//			Date dataPublicacao = (new SimpleDateFormat("dd/MM/yyyy")).parse("13/04/1980");
//			String codLocalizacao = "DEF456";
//			Integer numero = 22;
//
//			Revista revista = new Revista(null, titulo, dataPublicacao, codLocalizacao, numero);
//			revista = revistaRepository.save(revista);
//
//			log.info("Revista Cadastrada:");
//			log.info(revista.toString());
//
//			log.info("Pesquisando uma Revista pelo Título...");
//			revista = revistaRepository.findByNumero(numero);
//			log.info(revista.toString());
//
//		};
//	}

	@Bean
	public CommandLineRunner executar(PostagemRepository postagemRepository) {
		return (args) -> {
			// Apagando todas as Postagens
			postagemRepository.deleteAll();

			String titulo = "Veja Online";
			Date dataPublicacao = (new SimpleDateFormat("dd/MM/yyyy")).parse("07/03/2023");
			String url = "www.vejaonline.com.br";
			String conteudo = "notícias";
			Enum plataforma = "Web";

			Postagem postagem = new Postagem(null, titulo, dataPublicacao, url, plataforma, conteudo);
			postagem = postagemRepository.save(postagem);

			log.info("Postagem Cadastrada");
			log.info(postagem.toString());

			log.info("Pesquisando uma postagem pelo Conteúdo...");
			postagem = postagemRepository.findByConteudo(conteudo);
			log.info(postagem.toString());

		};
	}
}
