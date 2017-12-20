package br.com.getnet.retaguarda.v1.api;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.getnet.retaguarda.v1.exception.BookIdMismatchException;
import br.com.getnet.retaguarda.v1.exception.BookNotFoundException;
import br.com.getnet.retaguarda.v1.model.Book;
import br.com.getnet.retaguarda.v1.repository.BookRepository;

@RestController
@RequestMapping(path = "/api/v1/book")
public class BookRestController {

	@Autowired
	private BookRepository repository;

	@GetMapping
	public Collection<Book> listBooks() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Book findOne(@PathVariable long id) {
		return repository.findOne(id).orElseThrow(BookNotFoundException::new);
	}
	
	@GetMapping("/title/{title}")
    public List<Book> findByTitle(@PathVariable String title) {
        return repository.findByTitle(title);
    }


	@PostMapping()
	public Book createBook(@RequestBody Book book) {
		return repository.save(new Book(book.getTitle(), book.getIsbn(), book.getPublisher()));
	}

	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
		if (book.getId() != id) {
			throw new BookIdMismatchException();
		}
		repository.findOne(id.intValue()).orElseThrow(BookNotFoundException::new);
		return repository.save(book);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.findOne(id).orElseThrow(BookNotFoundException::new);
		 repository.delete(id);
	}
}
