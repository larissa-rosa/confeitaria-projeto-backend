package br.com.confeitaria.confeitaria.service;

import br.com.confeitaria.confeitaria.domain.Usuario;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UsuarioService {

    public void criarUsuario(String nomeRequisicao, LocalDate dataNascimento, String endereco, String telefone, String email, String senha){
        Usuario user = Usuario.builder()
                .nome(nomeRequisicao)
                .dataNascimento(dataNascimento)
                .endereco(endereco)
                .telefone(telefone)
                .email(email)
                .senha(senha)
                .build();
        System.out.println("Usuário criado com sucesso: " + user.toString());
    };

    public Usuario listarUsuario(){
        Usuario user = Usuario.builder()
                .nome("João")
                .dataNascimento(LocalDate.of(1997,12,10))
                .endereco("Sei lá")
                .telefone("5789465556")
                .email("oioi@oi.com")
                .senha("123qwert")
                .build();
        return user;
    }
}
