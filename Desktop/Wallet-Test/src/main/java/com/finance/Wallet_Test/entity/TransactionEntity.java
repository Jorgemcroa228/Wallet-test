package com.finance.Wallet_Test.entity;

import java.time.LocalDateTime;

import com.finance.Wallet_Test.enums.RoleType;
import com.finance.Wallet_Test.enums.StatusRole;

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
@Table(name = "transaction")
public class TransactionEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_transaction")
  private Long idTransaction;

  @Column(name = "type")
  private RoleType roleType;

  @Column(name = "value")
  private Long value;

  @Column(name = "status")
  private StatusRole statusRole;

  @Column(name = "token")
  private String token;

  @Column(name = "date")
  private LocalDateTime date;

  @ManyToOne 
  @JoinColumn(name = "id_user", nullable = false)
  private UsersEntity user;
}
