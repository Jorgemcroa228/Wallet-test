package com.finance.Wallet_Test.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum RoleType {
  RECARGA(1L),
  PAGO(2L);

  private final Long id;
}
