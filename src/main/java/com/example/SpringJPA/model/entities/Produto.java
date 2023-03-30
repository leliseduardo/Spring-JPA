package com.example.SpringJPA.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.mapping.PrimaryKey;

@Entity
public class Produto {

    @Id
    private int id;
    private String nome;
}
