package com.ing.dto;

import java.io.Serializable;
import java.util.List;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @NoArgsConstructor @ToString
public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1343084553422854072L;
	private Long id;
	private String username;
	private String password;
	private boolean isActive;
	
	private AccountDTO account;
	
	private List<BeneficiaryDTO> beneficiaries;
	private List<TransactionDTO> transactions;

}
