package org.example.nfmongodbdevapp.model.entity;

import lombok.With;

@With
public record Student(String firstName, String lastName, int age ) {
}
