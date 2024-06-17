package br.com.erudio.response;

import java.io.Serializable;
import java.util.Objects;

public class Cambio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String from;
	private String to;
	private Double conversionFactor;
	private Double conversionValue;
	private String environment;

	public Cambio() {

	}	
	
	public Cambio(Long id, String from, String to, Double conversionFactor, Double conversionValue, String environment) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.conversionValue = conversionValue;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public Double getConversionValue() {
		return conversionValue;
	}

	public void setConversionValue(Double conversionValue) {
		this.conversionValue = conversionValue;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversionFactor, conversionValue, environment, from, id, to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cambio other = (Cambio) obj;
		return Objects.equals(conversionFactor, other.conversionFactor)
				&& Objects.equals(conversionValue, other.conversionValue)
				&& Objects.equals(environment, other.environment) && Objects.equals(from, other.from)
				&& Objects.equals(id, other.id) && Objects.equals(to, other.to);
	}
}
