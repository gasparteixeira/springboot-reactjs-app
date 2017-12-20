package br.com.getnet.retaguarda.v1.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.getnet.retaguarda.v1.model.Author;
import br.com.getnet.retaguarda.v1.repository.AuthorRepository;

@RestController
@RequestMapping(path = "/api/v1/autor")
public class AuthorRestController {

	@Autowired
	private AuthorRepository repository;
	
	@GetMapping
    public Collection<Author> listAuthors() {
        return repository.findAll();
    }
	
}
