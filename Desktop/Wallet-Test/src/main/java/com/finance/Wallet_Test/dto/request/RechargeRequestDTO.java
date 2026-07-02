package com.finance.Wallet_Test.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RechargeRequestDTO {
  
    @NotBlank(message = "Document is required.")
    private String document;

    @NotBlank(message = "Phone is required.")
    private String phone;

    @NotNull(message = "The value is required.")
    @Positive(message = "The value most be grater than 0.")
    private BigDecimal valor;
}
