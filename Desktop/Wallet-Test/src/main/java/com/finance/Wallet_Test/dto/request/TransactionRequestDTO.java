package com.finance.Wallet_Test.dto.request;

import java.time.LocalDateTime;

import com.finance.Wallet_Test.enums.RoleType;
import com.finance.Wallet_Test.enums.StatusRole;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransactionRequestDTO {
  
    @NotBlank(message = "This field is required.")
    @Column(name = "type")
    private RoleType roleType;

    @NotBlank(message = "This field is required.")
    @Column(name = "value")
    private Long value;

    @NotBlank(message = "This field is required.")
    @Column(name = "status")
    private StatusRole statusRole;

    @NotBlank(message = "This field is required.")
    @Column(name = "token")
    private String token;

    @NotBlank(message = "This field is required.")
    @Column(name = "date")
    private LocalDateTime date;

    

}
