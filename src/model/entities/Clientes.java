package model.entities;

import java.time.LocalDate;

public class Clientes {
    private int idCliente;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private static int contadorIdCliente = 0;

    public Clientes() {
    }

    public Clientes(String nome, LocalDate dataNascimento, String email) {
        this.idCliente = ++contadorIdCliente;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{"+
                "id= " + id +
                ", nome: " +nome +
                ", data de nascimento: " + dataNascimento +
                ", email: " + email+
                "}";
    }
}
