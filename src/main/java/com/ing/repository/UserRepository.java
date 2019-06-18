package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUserNameLike(String userName);
	
	public User findByUserNameAndPassword(String userName, String password);

}
