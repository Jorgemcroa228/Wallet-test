package com.finance.Wallet_Test.dto.request;

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
public class UsersRequestDTO {
    
    @NotBlank(message = "This field is required.")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "This field is required.")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "This field is required.")
    @Column(name = "document")
    private String document;

    @NotBlank(message = "This field is required.")
    @Column(name = "phone")
    private String phone;
}
