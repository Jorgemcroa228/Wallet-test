package com.finance.Wallet_Test.entity;


import com.finance.Wallet_Test.enums.AccountRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class UsersEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_user")
  private Long IdUser;

  @Column(name = "name")
  private String name;

  @Column(name = "email")
  private String email;

  @Column(name = "document")
  private String document;

  @Column(name = "phone")
  private String phone;
}
