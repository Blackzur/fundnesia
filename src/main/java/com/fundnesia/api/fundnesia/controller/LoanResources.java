package com.fundnesia.api.fundnesia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fundnesia.api.fundnesia.dto.LoanInput;
import com.fundnesia.api.fundnesia.dto.Response;
import com.fundnesia.api.fundnesia.service.LoanService;

@RestController
public class LoanResources {
	
	@Autowired
	private LoanService service;
	
	@PostMapping("/insert-loan")
	public Response insertLoan(@RequestBody LoanInput loan) {
		return service.insertLoan(loan);
	}
	
	
	
}