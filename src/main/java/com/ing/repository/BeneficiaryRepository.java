package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.entity.Beneficiary;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
