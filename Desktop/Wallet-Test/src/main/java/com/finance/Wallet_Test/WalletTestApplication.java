package com.finance.Wallet_Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WalletTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletTestApplication.class, args);
	}

}
