package com.finance.Wallet_Test.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class WalletResponseDTO {
  
  private Long idWallet;
  private Long user;
  private Long balance;
}
