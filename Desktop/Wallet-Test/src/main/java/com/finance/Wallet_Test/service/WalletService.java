package com.finance.Wallet_Test.service;

import org.springframework.stereotype.Service;

import com.finance.Wallet_Test.dto.request.RechargeRequestDTO;
import com.finance.Wallet_Test.dto.response.WalletResponseDTO;
import com.finance.Wallet_Test.entity.UsersEntity;
import com.finance.Wallet_Test.entity.WalletEntity;
import com.finance.Wallet_Test.repository.UsersRepository;
import com.finance.Wallet_Test.repository.WalletRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class WalletService {
  
  private final UsersRepository usersRepository;
  private final WalletRepository walletRepository;

  public WalletResponseDTO recharge(RechargeRequestDTO request) {
    UsersEntity user = findUser(request.getDocument(), request.getPhone());
    WalletEntity wallet = findWallet(user);

    certify (wallet, request.getValor());

    log.info("Succesfull recharge. documento={} valor={}");
  }
}
