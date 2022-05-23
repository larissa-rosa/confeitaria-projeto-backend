package br.com.confeitaria.confeitaria.controller;

import br.com.confeitaria.confeitaria.domain.Usuario;

import java.time.LocalDate;

public class UsuarioController {

    public Usuario criarUsuario(){
        Usuario user = Usuario.builder()
                .nome("Larissa")
                .dataNascimento(LocalDate.of(1993, 03, 07))
                .email("larissa_rosa7@hotmail.com")
                .endereco("Rua Garibaldi, 1231/404")
                .senha("marshmallows")
                .telefone("513981065087").build();

    }
}
