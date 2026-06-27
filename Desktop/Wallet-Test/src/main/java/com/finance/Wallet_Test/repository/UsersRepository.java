package com.finance.Wallet_Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.Wallet_Test.entity.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Long>{
  
}
