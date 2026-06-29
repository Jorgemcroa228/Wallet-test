package com.finance.Wallet_Test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.finance.Wallet_Test.constants.ApiConstants;

@Configuration
public class RestTemplateConfig {
  @Bean 
    public RestTemplate restTemplate() { 
        HttpComponentsClientHttpRequestFactory factory 
            = new HttpComponentsClientHttpRequestFactory(); 
        factory.setConnectTimeout(ApiConstants.CONNECT_TIMEOUT); 
        factory.setReadTimeout   (ApiConstants.READ_TIMEOUT); 
        return new RestTemplate(factory); 
    } 
}
