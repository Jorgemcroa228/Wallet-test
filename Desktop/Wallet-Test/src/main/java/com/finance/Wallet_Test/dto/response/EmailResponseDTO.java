package com.finance.Wallet_Test.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailResponseDTO {
    @JsonProperty("id") 
    private String id; 
    
    @JsonProperty("message") 
    private String message; 
}
