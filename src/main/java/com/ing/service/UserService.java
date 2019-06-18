package com.ing.service;

import com.ing.dto.UserDTO;

public interface UserService {
	
	UserDTO login(String username, String password);
}
