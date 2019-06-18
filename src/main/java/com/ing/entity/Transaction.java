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
@Table(name="transactions")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Transaction implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -540913337307682132L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long transactionId;
	private long fromAccountNumber;
	private long toAccountNumber;
	private Date transactionDate;
	private double amount;
	private String transactionType;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

}
