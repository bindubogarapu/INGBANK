package com.ing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.ing.entity.Beneficiary;
import com.ing.entity.User;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

	public List<Beneficiary> getAllBeneficiaryByUser(@RequestParam User user);
	
}
