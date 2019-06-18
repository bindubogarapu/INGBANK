package com.ing.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="account")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long accountId;
	private String accountHolderName;
	private double closingBalance;
	private String ifscCode;
	private String bankname;
	private String branchName;

	@OneToOne
	@JoinColumn(name="userId")
	private User user;
}
