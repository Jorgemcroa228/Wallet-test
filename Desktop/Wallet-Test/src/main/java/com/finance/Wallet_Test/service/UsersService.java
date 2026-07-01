package com.finance.Wallet_Test.service;

import org.springframework.stereotype.Service;

import com.finance.Wallet_Test.dto.request.UsersRequestDTO;
import com.finance.Wallet_Test.dto.response.UsersResponsetDTO;
import com.finance.Wallet_Test.entity.UsersEntity;
import com.finance.Wallet_Test.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersService {
  
  private final UsersRepository usersRepository;

  public UsersResponsetDTO createUser(UsersRequestDTO request) {

    UsersEntity users = new UsersEntity();

    users.setName(request.getName());
    users.setEmail(request.getEmail());
    users.setDocument(request.getDocument());
    users.setPhone(request.getPhone());

    UsersEntity saveUsers = usersRepository.save(users);
    return toResponse(saveUsers);
  }

  public UsersResponsetDTO toResponse(UsersEntity users) {
    return UsersResponsetDTO.builder()
            .IdUser(users.getIdUser())
            .name(users.getName())
            .email(users.getEmail())
            .document(users.getDocument())
            .phone(users.getPhone())
            .build();
  }
}
