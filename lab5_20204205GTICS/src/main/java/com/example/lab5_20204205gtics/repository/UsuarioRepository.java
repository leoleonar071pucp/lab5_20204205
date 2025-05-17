package com.example.lab5_20204205gtics.repository;


import com.example.lab5_20204205gtics.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String email);

}

