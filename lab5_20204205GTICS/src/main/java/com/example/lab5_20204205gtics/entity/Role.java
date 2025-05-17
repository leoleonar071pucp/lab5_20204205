package com.example.lab5_20204205gtics.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;

    @Column(nullable = false, unique = true)
    private String nombre; // "ADMIN" o "USER"



}
