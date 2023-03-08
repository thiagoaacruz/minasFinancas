package com.thiago.minhasfinancas.service.implementacao;

import com.thiago.minhasfinancas.exception.RegraNegocioException;
import com.thiago.minhasfinancas.model.entity.Usuario;
import com.thiago.minhasfinancas.model.repository.UsuarioRepository;
import com.thiago.minhasfinancas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UsuarioServiceImplementacao implements UsuarioService {

    private UsuarioRepository repository; //Criando um instancia do UsuarioRepository, para poder ter acesso a base de dados

    @Autowired
    public UsuarioServiceImplementacao(UsuarioRepository repository) {//Criando um construtor para UsuarioRepository para poder ter acesso a base de daados
        super();
        this.repository = repository;
    }

    @Override
    public Usuario autenticar(String email, String Senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {

       boolean existe = repository.existsByEmail(email);


        if (existe){
            throw new RegraNegocioException("Já existe um usuáro cadastrado com este email.");
        }

    }
}
