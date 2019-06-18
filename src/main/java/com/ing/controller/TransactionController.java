package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.BeneficiaryDTO;
import com.ing.service.IBeneficiaryService;

@RestController
@RequestMapping("/api")
public class TransactionController {
	
	@Autowired
	IBeneficiaryService beneficiaryService;
	
	@GetMapping("/beneficiaries/{userId}")
	public ResponseEntity<List<BeneficiaryDTO>> getBeneficiaryDetails(@PathVariable String userId) {
		List<BeneficiaryDTO> listBeneficiaryDTO = beneficiaryService.getAllBeneficiaryByUserId(userId);
		return new ResponseEntity<List<BeneficiaryDTO>>(listBeneficiaryDTO, HttpStatus.OK);
	}

	

}
	