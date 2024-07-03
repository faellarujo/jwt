package com.pt.jwt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
