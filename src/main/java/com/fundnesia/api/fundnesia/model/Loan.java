package com.fundnesia.api.fundnesia.model;

import java.math.BigDecimal;

public class Loan {
	private Integer tenure;
	private BigDecimal ticketSize;
	private BigDecimal fee;
	private BigDecimal totaLoan;
	private BigDecimal installmentPerMonth;
	private String status;
	
	public Loan(Integer tenure, BigDecimal ticketSize, BigDecimal fee, BigDecimal totaLoan,
			BigDecimal installmentPerMonth, String status) {
		super();
		this.tenure = tenure;
		this.ticketSize = ticketSize;
		this.fee = fee;
		this.totaLoan = totaLoan;
		this.installmentPerMonth = installmentPerMonth;
		this.status = status;
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
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	public BigDecimal getTotaLoan() {
		return totaLoan;
	}
	public void setTotaLoan(BigDecimal totaLoan) {
		this.totaLoan = totaLoan;
	}
	public BigDecimal getInstallmentPerMonth() {
		return installmentPerMonth;
	}
	public void setInstallmentPerMonth(BigDecimal installmentPerMonth) {
		this.installmentPerMonth = installmentPerMonth;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
