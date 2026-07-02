package com.finance.Wallet_Test.service;

import org.springframework.stereotype.Service;

import com.finance.Wallet_Test.dto.response.WalletResponseDTO;
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

  public WalletResponseDTO recharge()
}
