package com.dinesh.exchangeservice.controller.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Exchange_value")
public class ExchangeValue {

	@Id
	@Column(name="id")
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="conversion_multiple")
	private BigDecimal conversionMultiple;
	@Column(name="port")
	private int port;
	
	
	
	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}



	public ExchangeValue() {
		
	}



	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}



	
	public Long getId() {
		return id;
	}



	



	
	public String getFrom() {
		return from;
	}



	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}



	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}



	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}



	/**
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}



	
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
	
	
}
