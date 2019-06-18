package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.entity.Transaction;

@Repository
public interface TransactionRepossitory extends JpaRepository<Transaction, Long>{

}
