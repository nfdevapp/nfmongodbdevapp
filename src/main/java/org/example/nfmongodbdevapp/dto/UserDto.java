package org.example.nfmongodbdevapp.dto;

import java.util.List;

public record UserDto(String username,
                      List<String> shoppingCart,
                      List<String> orderHintory) {
}
