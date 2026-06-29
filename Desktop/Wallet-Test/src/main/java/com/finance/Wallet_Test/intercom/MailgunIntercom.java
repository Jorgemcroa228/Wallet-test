package com.finance.Wallet_Test.intercom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;



import com.finance.Wallet_Test.dto.request.EmailRequestDTO;
import com.finance.Wallet_Test.dto.response.EmailResponseDTO;

@FeignClient(
  name  = "mailgun-client", 
  url   = "${mailgun.base-url}" 
)
public interface MailgunIntercom {
  @PostMapping( 
        value    = "/{domain}/messages", 
        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE 
    ) 
    EmailResponseDTO enviarCorreo( 
        @RequestHeader("Authorization") String authorization, 
        @PathVariable("domain") String domain, 
        @SpringQueryMap EmailRequestDTO request 
    ); 
}
