package br.com.confeitaria.confeitaria.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome informado não é válido")
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    @NotBlank
    private String senha;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
