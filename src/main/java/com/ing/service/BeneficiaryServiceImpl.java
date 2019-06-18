package com.ing.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.BeneficiaryDTO;
import com.ing.entity.Account;
import com.ing.entity.Beneficiary;
import com.ing.entity.User;
import com.ing.repository.AccountRepository;
import com.ing.repository.BeneficiaryRepository;
import com.ing.repository.UserRepository;

@Service
public class BeneficiaryServiceImpl implements IBeneficiaryService {
	@Autowired
	BeneficiaryRepository beneficiaryRepository;

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AccountRepository accountRepo;

	public BeneficiaryDTO addBeneficiary(BeneficiaryDTO beneficiaryDTO) {

		Beneficiary beneficiary = new Beneficiary();
		Optional<User> user = userRepo.findById(beneficiaryDTO.getUserDTO().getId());
		
		Account account = accountRepo.findByAccountNumber(beneficiaryDTO.getAccountNumber());
		BeanUtils.copyProperties(beneficiaryDTO, beneficiary);
		beneficiary.setUser(user.get());
		beneficiary.setAccount(account);
		beneficiary = beneficiaryRepository.save(beneficiary);
		BeanUtils.copyProperties(beneficiary, beneficiaryDTO);

		return beneficiaryDTO;
	}

}
