package com.ing.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user")
@Setter @Getter @NoArgsConstructor @ToString
public class User implements Serializable{
	
	private static final long serialVersionUID = 1506821667278027860L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String username;
	private String password;	
	private String status;
	@OneToOne(mappedBy = "user")
	private Account account;
	@JsonManagedReference
	@OneToMany(mappedBy = "user")
	private List<Beneficiary> beneficiaries;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "user")
	private List<Transaction> transactions;
}
