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
public class TransactionDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long transactionId;
	private long fromAccountNumber;
	private long toAccountNumber;
	private Date transactionDate;
	private double amount;
	private String transactionType;

	private UserDTO userDTO;
}
