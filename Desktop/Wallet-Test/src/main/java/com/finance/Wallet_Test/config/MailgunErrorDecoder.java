package com.finance.Wallet_Test.config;

import org.springframework.stereotype.Component;

import feign.codec.ErrorDecoder;

@Component
public class MailgunErrorDecoder {
  private final ErrorDecoder defaultDecoder = new Default(); 
  
    @Override 
    public Exception decode(String methodKey, Response response) { 
        return switch (response.status()) { 
            case 401 -> new RuntimeException("Credenciales inválidas"); 
            case 400 -> new RuntimeException("Petición inválida"); 
            case 429 -> new RuntimeException("Límite de peticiones excedido"); 
            default -> defaultDecoder.decode(methodKey, response); 
        }; 
    } 
}
