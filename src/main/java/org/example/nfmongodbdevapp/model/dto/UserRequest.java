package org.example.nfmongodbdevapp.model.dto;

import lombok.Builder;

import java.util.List;

//Eingehendes DTO
@Builder
public record UserRequest(String username,
                          List<String> shoppingCart,
                          List<String> orderHintory) {
}
