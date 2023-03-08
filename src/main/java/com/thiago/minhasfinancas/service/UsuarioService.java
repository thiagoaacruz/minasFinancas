package com.thiago.minhasfinancas.service;

import com.thiago.minhasfinancas.model.entity.Usuario;
import org.springframework.stereotype.Service;


public interface UsuarioService {

    Usuario autenticar(String email, String Senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);



}
