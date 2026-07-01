package com.finance.Wallet_Test.service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.finance.Wallet_Test.constants.ApiConstants;
import com.finance.Wallet_Test.dto.request.EmailRequestDTO;
import com.finance.Wallet_Test.dto.response.EmailResponseDTO;
import com.finance.Wallet_Test.intercom.MailgunIntercom;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailService {
    private final MailgunIntercom mailgunIntercom; 
    
    @Value("${mailgun.api-key}") 
    private String apiKey; 
    
    @Value("${mailgun.domain}") 
    private String domain; 
    
    @Value("${mailgun.from}") 
    private String from; 
    
    public void enviarToken(String destinatario, String token) { 
        // Construir credenciales Basic Auth: "api:<apiKey>" en Base64 
        String credentials = "api:" + apiKey; 
        String auth = ApiConstants.BASIC_AUTH_PREFIX 
            + Base64.getEncoder() 
            .encodeToString(credentials.getBytes(StandardCharsets.UTF_8)); 
    
        EmailRequestDTO request = EmailRequestDTO.builder() 
            .from(from) 
            .to(destinatario) 
            .subject("Código de confirmación") 
            .text("Tu código es: " + token) 
            .build(); 
    
        try { 
            EmailResponseDTO resp = mailgunIntercom.enviarCorreo(auth, domain, request); 
            log.info("Correo enviado. ID: {}", resp.getId()); 
        } catch (FeignException e) { 
            log.error("Error Feign al enviar correo: {}", e.getMessage(), e); 
            throw new RuntimeException("No se pudo enviar el correo", e); 
        } 
    } 
}
