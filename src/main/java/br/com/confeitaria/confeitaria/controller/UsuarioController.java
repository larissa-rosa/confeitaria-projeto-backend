package br.com.confeitaria.confeitaria.controller;

import br.com.confeitaria.confeitaria.domain.Usuario;
import br.com.confeitaria.confeitaria.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/larissinha")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarUsuario(@RequestBody @Valid Usuario usuario){
        usuarioService.criarUsuario(usuario.getNome(), usuario.getDataNascimento(), usuario.getEndereco(), usuario.getTelefone(), usuario.getEmail(), usuario.getSenha());
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Usuario listarUsuario(){
        return usuarioService.listarUsuario();
    }
}
