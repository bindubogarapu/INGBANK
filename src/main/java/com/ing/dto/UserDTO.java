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
	private Long userId;
	private String userName;
	private String password;
	private String status;
	
	private AccountDTO account;
	
	

}
