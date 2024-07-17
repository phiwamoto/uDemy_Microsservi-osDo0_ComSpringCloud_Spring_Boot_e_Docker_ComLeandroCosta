package br.com.erudio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("book-service")
public class FooBarController {
	
	private Logger logger = LoggerFactory.getLogger(FooBarController.class);

	@GetMapping("foo-bar")
	@Retry(name = "for-bar") // Vai tentar a request 3 vezes com nome "defaut", mas criamos no application.yml a properties e definimos 5 vezes
	public String fooBar() {
		logger.info("Request to foo-bar is received!");
		var response = new RestTemplate().getForEntity("http://localhot:8080/foo-bar", String.class);
		return response.getBody();
		
		//return "Foo-Bar!!!";
	}
}
