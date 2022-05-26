package br.com.confeitaria.confeitaria.service;

import br.com.confeitaria.confeitaria.domain.Usuario;
import br.com.confeitaria.confeitaria.repository.UsuarioRepository;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    public void criarUsuario(String nomeRequisicao, LocalDate dataNascimento, String endereco, String telefone, String email, String senha){
        try {
            Usuario user = Usuario.builder()
                    .nome(nomeRequisicao)
                    .dataNascimento(dataNascimento)
                    .endereco(endereco)
                    .telefone(telefone)
                    .email(email)
                    .senha(senha)
                    .build();

            usuarioRepository.save(user);
        } catch (Exception e){
            System.out.println("Não foi possível salvar o usuário no banco de dados. Erro: " + e);
        }
    };

    public List<Usuario> listarUsuarios(){

        List<Usuario> usuarios = usuarioRepository.findAll();

        if(usuarios.isEmpty()) {
            System.out.println("Não existem usuários salvos no banco de dados");
        }

        return usuarios;
    }
}
