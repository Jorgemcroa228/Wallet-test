package com.finance.Wallet_Test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "wallet")
public class WalletEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_wallet")
  private Long idWallet;

  @ManyToOne 
  @JoinColumn(name = "id_user", nullable = false)
  private UsersEntity user;

  @Column(name = "balance")
  private Long balance;
}
