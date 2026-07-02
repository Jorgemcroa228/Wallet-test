package com.finance.Wallet_Test.service;

import java.math.BigDecimal;

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

    log.info("Succesfull recharge. documento={} valor={}", request.getDocument, request.getValor());

    return WalletResponseDTO.builder()
                .idWallet(wallet.getIdWallet())
                .user(user.getIdUser())
                .balance(wallet.getBalance())
                .build();
  }

  public UsersEntity buscarCliente(String documento, String celular) {
        return usersRepository.findByDocumentAndPhone(documento, celular)
                .orElseThrow(() -> new ClienteNoEncontradoException(
                        "No se encontró un cliente con el documento y celular indicados."));
  }

  public WalletEntity buscarWallet(UsersEntity cliente) {
        return walletRepository.findByUser(cliente)
                .orElseThrow(() -> new ClienteNoEncontradoException(
                        "El cliente no tiene una billetera asociada."));
  }

  public void acreditar(WalletEntity wallet, BigDecimal valor) {
        wallet.setBalance(wallet.getBalance().add(valor));
        walletRepository.save(wallet);
    }
}
