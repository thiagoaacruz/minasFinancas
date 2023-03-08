package com.thiago.minhasfinancas.model.repository;

import com.thiago.minhasfinancas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email); //Irá buscar na base de dados de existe



}
