package org.example.nfmongodbdevapp.model;

import lombok.With;

@With
public record Student(String firstName, String lastName, int age ) {
}
