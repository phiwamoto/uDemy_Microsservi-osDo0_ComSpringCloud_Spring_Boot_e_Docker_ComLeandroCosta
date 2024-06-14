package br.com.erudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.model.Book;
import br.com.erudio.repository.BookRepository;

@RestController
@RequestMapping("book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private BookRepository repository;	
		
	
	// http://localhost:8100/book-service/1/BRL
	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(
			@PathVariable("id") Long id,
			@PathVariable("currency") String currency
			) {
		
		var book = repository.getById(id);
		if (book == null)
			throw new RuntimeException("Book not Found"); 
		
		var port = environment.getProperty("local.server.port");
		book.setEnvironment(port);

		
		return book;
	}
}
