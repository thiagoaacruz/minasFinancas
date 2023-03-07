package com.thiago.minhasfinancas.model.service;

import com.thiago.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {

    Usuario autenticar(String email, String senha);//Interface de verificação no banco se existe esse email

    Usuario salvarUsuario(Usuario usuario); //Sempre irá salvar no banco um novo usuario, e com persistencia irá atribuir um id

    void validarEmail(String email);//Irá verificar no banco se já existe um email



}
