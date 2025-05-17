package com.example.lab5_20204205gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String pwd; // debe estar encriptada

    @Column(nullable = false)
    private String dni;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private boolean activo;

    @Column(nullable = false)
    private Integer edad;


    @ManyToOne
    @JoinColumn(name = "idrol")
    private Role role;


}
