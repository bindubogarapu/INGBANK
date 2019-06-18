package com.ing.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="beneficiary")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Beneficiary implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4020860157378124948L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long beneficiaryId;
	private String beneficiaryName;
	private String ifscCode;
	private String bankName;
	private long accountNumber;
	private double balance;
	private String branchName;
	private Date creationDate;
	private Account account;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	
	
}
