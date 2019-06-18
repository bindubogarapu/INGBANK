package com.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.BeneficiaryDTO;
import com.ing.service.IBeneficiaryService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = {"*","*/"},origins = {"*","*/"})
public class BeneficiaryController {

	@Autowired
	IBeneficiaryService beneficiaryService;
	
	@PostMapping("/account/beneficary")
	public ResponseEntity<BeneficiaryDTO> addBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO ){	
		BeneficiaryDTO beneficiaryDto = beneficiaryService.addBeneficiary(beneficiaryDTO);
		return new ResponseEntity<BeneficiaryDTO>(beneficiaryDto,HttpStatus.CREATED);
				
	} 
}