package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// Entity transforma uma classe em uma entidade no BD
@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {
    String nome;
    String email;
    int idade;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
