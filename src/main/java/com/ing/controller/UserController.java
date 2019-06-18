package com.ing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.AccountDTO;
import com.ing.dto.UserDTO;
import com.ing.exception.UserNotFoundException;
import com.ing.service.IAccountService;
import com.ing.service.UserService;



@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders={"*", "*/"}, origins={"*", "*/"})
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	IAccountService iAccountService;
	
	
	@PostMapping("/login")
	public ResponseEntity<UserDTO> login(@RequestBody UserDTO  userDTO){
		LOGGER.debug("");
		 if(userDTO.getUserName().length() == 0 || userDTO.getPassword().length() ==0){
			 throw new UserNotFoundException(userDTO.getUserName()); }	
		userDTO= userService.login(userDTO.getUserName(), userDTO.getPassword());
		return new ResponseEntity<>(userDTO, HttpStatus.OK);
	}
	
	@GetMapping("/accountsummary/{userId}")
	public ResponseEntity<AccountDTO>getUserAccout(@PathVariable long userId) {
	AccountDTO accountDTO = iAccountService.getUserAccout(userId);
	return new ResponseEntity<AccountDTO>(accountDTO,HttpStatus.OK);
	}
}
