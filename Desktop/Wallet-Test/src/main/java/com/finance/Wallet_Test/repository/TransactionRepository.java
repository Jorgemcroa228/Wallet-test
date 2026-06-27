package com.finance.Wallet_Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.Wallet_Test.entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long>{

}
