package com.ing.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BeneficiaryDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long beneficiaryId;
	private String beneficiaryName;
	private String ifscCode;
	private String bankName;
	private long accountNumber;
	private double balance;
	private String branchName;
	private Date creationDate;
	private UserDTO userDTO;
}
