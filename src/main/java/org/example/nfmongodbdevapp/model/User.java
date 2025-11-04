package org.example.nfmongodbdevapp.model;

import java.util.List;

public record User(String username,
                   String password,
                   String address,
                   String mail,
                   List<String> shoppingCart,
                   List<String> orderHintory) {
}
