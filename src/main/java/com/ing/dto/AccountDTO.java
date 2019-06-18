package com.ing.dto;


import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class AccountDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private long accountId;
	private String accountHolderName;
	private double closingBalance;
	private String ifscCode;
	private String bankname;
	private String branchName;
	private UserDTO userDto;
}
