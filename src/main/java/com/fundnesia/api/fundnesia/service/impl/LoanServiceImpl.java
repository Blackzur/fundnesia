package com.fundnesia.api.fundnesia.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.fundnesia.api.fundnesia.dto.LoanInput;
import com.fundnesia.api.fundnesia.dto.Response;
import com.fundnesia.api.fundnesia.model.Loan;
import com.fundnesia.api.fundnesia.service.LoanService;

@Component
public class LoanServiceImpl implements LoanService {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;	
	
	@Override
	public Response insertLoan(LoanInput data) {
		// TODO Auto-generated method stub
		Response res = new Response();
		
		BigDecimal percent = new BigDecimal(0.02);
		BigDecimal fee = percent.multiply(new BigDecimal(data.getTenure())).multiply(data.getTicketSize());
		BigDecimal totaLoan = fee.add(data.getTicketSize());
		BigDecimal installmentPerMonth = totaLoan.divide(new BigDecimal(data.getTenure()), 2, RoundingMode.HALF_UP);
		
		Loan dataLoan = new Loan(data.getTenure(),data.getTicketSize(), fee,  totaLoan,  installmentPerMonth, "SUBMITTED");
		
		int saveData = save(dataLoan);
		if(saveData == 1) {
			res.setResponseCode("200");
			res.setResponseMsg("Sukses");		
		}else {
			res.setResponseCode("500");
			res.setResponseMsg("Gagal");	
		}		
		
		return res;
	}
	
	public int save(Loan data) {
        return jdbcTemplate.update(
                "insert into loan (tenure, ticketSize, fee, totaLoan, installmentPerMonth, status) values(?,?,?,?,?,?)",
                data.getTenure(), data.getTicketSize(), data.getFee(), data.getTotaLoan(), data.getInstallmentPerMonth(), data.getStatus());
    }
	
}


