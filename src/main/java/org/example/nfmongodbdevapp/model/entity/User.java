package org.example.nfmongodbdevapp.model.entity;

import java.util.List;

//Entität / Domain-Objekt
public record User(String username,
                   String password,
                   String address,
                   String mail,
                   List<String> shoppingCart,
                   List<String> orderHintory) {
}
