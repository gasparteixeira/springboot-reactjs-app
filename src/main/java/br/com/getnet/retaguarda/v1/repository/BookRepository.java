package br.com.getnet.retaguarda.v1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.getnet.retaguarda.v1.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
	List<Book> findByTitle(String title);
	Optional<Book> findOne(long id);
}
