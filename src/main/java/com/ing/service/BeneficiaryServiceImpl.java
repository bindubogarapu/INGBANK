package com.ing.service;

import java.util.ArrayList;
import java.util.List;
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
		Optional<User> user = userRepo.findById(beneficiaryDTO.getUserDTO().getUserId());
		
		Account account = accountRepo.findByAccountNumber(beneficiaryDTO.getAccountNumber());
		BeanUtils.copyProperties(beneficiaryDTO, beneficiary);
		beneficiary.setUser(user.get());
		beneficiary.setAccount(account);
		beneficiary = beneficiaryRepository.save(beneficiary);
		BeanUtils.copyProperties(beneficiary, beneficiaryDTO);

		return beneficiaryDTO;
	}
	
	public List<BeneficiaryDTO> getAllBeneficiaryByUserId(String userId) {
		// TODO Auto-generated method stub
		List<Long> userIdList =  new ArrayList<Long>();
		userIdList.add(Long.parseLong(userId));
		User user = new User();
		user.setUserId(Long.parseLong(userId));
		List<Beneficiary>benefiaryList =  beneficiaryRepository.getAllBeneficiaryByUser(user);
		List<BeneficiaryDTO> beneficiaryDTOs = new ArrayList<BeneficiaryDTO>();
		for (Beneficiary beneficiery :benefiaryList) {
			BeneficiaryDTO beneficiaryDTO1 = new BeneficiaryDTO();
			beneficiaryDTO1.setAccountNumber(beneficiery.getAccountNumber());
			beneficiaryDTO1.setBeneficiaryName(beneficiery.getBeneficiaryName());
			beneficiaryDTO1.setBalance(beneficiery.getBalance());
			beneficiaryDTO1.setBankName(beneficiery.getBankName());
			beneficiaryDTO1.setBranchName(beneficiery.getBranchName());
			beneficiaryDTO1.setIfscCode(beneficiery.getIfscCode());
			beneficiaryDTOs.add(beneficiaryDTO1);
			
		}
	
		return beneficiaryDTOs;
	}

}
