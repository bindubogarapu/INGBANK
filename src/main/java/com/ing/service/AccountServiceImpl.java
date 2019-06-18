package com.ing.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.AccountDTO;
import com.ing.entity.Account;
import com.ing.repository.AccountRepository;

@Service
public class AccountServiceImpl implements IAccountService{
	
	@Autowired
	AccountRepository accountRepository;

	
	public AccountDTO getUserAccout(long userId) {
		AccountDTO accountDTO= new AccountDTO();
		Account userAccount = accountRepository.findById(userId).get();
		BeanUtils.copyProperties(userAccount, accountDTO);
		return accountDTO;
	}

}
