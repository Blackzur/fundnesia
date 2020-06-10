package com.fundnesia.api.fundnesia.dto;

import java.math.BigDecimal;

public class LoanInput {
	private Integer tenure;
	private BigDecimal ticketSize;
	
	public LoanInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public BigDecimal getTicketSize() {
		return ticketSize;
	}

	public void setTicketSize(BigDecimal ticketSize) {
		this.ticketSize = ticketSize;
	}
	
	
	
}
