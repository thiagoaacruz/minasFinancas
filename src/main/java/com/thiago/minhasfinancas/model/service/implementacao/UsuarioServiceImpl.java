package com.thiago.minhasfinancas.model.service.implementacao;

import com.thiago.minhasfinancas.model.entity.Usuario;
import com.thiago.minhasfinancas.model.exception.RegraNegocioException;
import com.thiago.minhasfinancas.model.repository.UsuarioRepository;
import com.thiago.minhasfinancas.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service //Com essa notação estou dizendo ao Sprinbbot que genrencie uma instancia dessa classe
public class UsuarioServiceImpl implements UsuarioService {


    private UsuarioRepository repository; //Criando uma dependencia, para poder persistir os dados, porque o UsuarioService não tem acesso a base de dados

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository repository) { //Para o UsuarioService funcionar, tenho que criar um contrutor do UsuarioRepository.
        this.repository = repository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
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
            throw new RegraNegocioException("Já existe um usuário cadastrado com esete email.");
        }


    }
}
