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
public class UsersResponsetDTO {
  
  private Long IdUser;
  private String name;
  private String email;
  private String document;
  private String phone;
}
