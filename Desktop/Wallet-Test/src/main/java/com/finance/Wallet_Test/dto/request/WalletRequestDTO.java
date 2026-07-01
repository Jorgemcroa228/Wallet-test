package com.finance.Wallet_Test.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class WalletRequestDTO {

  @NotBlank(message = "User id is required")
  private Long user;

  @NotBlank(message = "Product id is required")
  @Column(name = "balance")
  private Long balance;
  
}