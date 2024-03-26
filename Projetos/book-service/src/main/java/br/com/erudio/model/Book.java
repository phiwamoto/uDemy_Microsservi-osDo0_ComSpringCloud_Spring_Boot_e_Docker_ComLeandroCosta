package br.com.erudio.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String author;
	private Date lauchDate;
	private Double price;
	private String title;
	private String currency;
	private String environment;
	
	
	public Book() {
		
	}

	public Book(Long id, String author, String title, Date lauchDate, Double price, String currency,
			String environment) {
		this.id = id;
		this.author = author;
		this.lauchDate = lauchDate;
		this.price = price;
		this.title = title;
		this.currency = currency;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getLauchDate() {
		return lauchDate;
	}

	public void setLauchDate(Date lauchDate) {
		this.lauchDate = lauchDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, currency, environment, id, lauchDate, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(currency, other.currency)
				&& Objects.equals(environment, other.environment) && Objects.equals(id, other.id)
				&& Objects.equals(lauchDate, other.lauchDate) && Objects.equals(price, other.price)
				&& Objects.equals(title, other.title);
	}
}
