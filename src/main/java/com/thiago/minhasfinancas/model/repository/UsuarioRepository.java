package com.thiago.minhasfinancas.model.repository;

import com.thiago.minhasfinancas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository  extends JpaRepository <Usuario, Long> { //Nessa parte estou passando a classe e o seu identificador

    /* Optional<Usuario> findAllByEmail(String email); = O comando abaixo é um "query metodo", com esse comando eu não preciso do fazer
        um sql de busca, ele irá automaticamento na base de dados e fazer a consulta
        */

    boolean existsByEmail(String email); //Métod similar ao query metodo comentado acima




}
