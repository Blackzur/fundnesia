package com.fundnesia.api.fundnesia.service;

import com.fundnesia.api.fundnesia.dto.LoanInput;
import com.fundnesia.api.fundnesia.dto.Response;

public interface LoanService {
	public Response insertLoan(LoanInput data);
	
}
