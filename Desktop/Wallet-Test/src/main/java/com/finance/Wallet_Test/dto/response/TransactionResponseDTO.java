package com.finance.Wallet_Test.dto.response;

import java.time.LocalDateTime;

import com.finance.Wallet_Test.enums.RoleType;
import com.finance.Wallet_Test.enums.StatusRole;

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
public class TransactionResponseDTO {
  
  private Long idTransaction;
  private RoleType roleType;
  private Long value;
  private StatusRole statusRole;
  private String token;
  private LocalDateTime date;
  private Long user;
}
