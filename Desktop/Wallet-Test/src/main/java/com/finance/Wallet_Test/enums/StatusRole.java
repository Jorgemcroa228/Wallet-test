package com.finance.Wallet_Test.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum StatusRole {
  PENDIENTE(1L),
  CONFIRMADO(2L),
  RECHAZADO(3L);

  private final Long id;
}
