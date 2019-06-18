package com.ing.service;

import java.util.List;

import com.ing.dto.BeneficiaryDTO;

public interface IBeneficiaryService {

	public BeneficiaryDTO addBeneficiary(BeneficiaryDTO beneficiaryDTO);
	public List<BeneficiaryDTO> getAllBeneficiaryByUserId(String userId);

}
