package br.com.getnet.retaguarda.v1.repository;

import br.com.getnet.retaguarda.v1.model.Author;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author, Long> {
	List<Author> findAll();
	List<Author> findByFirstName(String firstName);
}
