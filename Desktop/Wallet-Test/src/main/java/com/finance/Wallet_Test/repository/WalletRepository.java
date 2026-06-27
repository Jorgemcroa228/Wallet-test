package com.finance.Wallet_Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.Wallet_Test.entity.WalletEntity;

public interface WalletRepository extends JpaRepository<WalletEntity, Long>{

  
}
