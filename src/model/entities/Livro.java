package model.entities;

import model.enums.StatusLivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Livro {
    private int idLivro;
    private String titulo;
    private Autor autor;
    private LocalDate dataCadastro;
    private StatusLivro statusLivro;
    private static int contadorIdLivro = 0;

    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Livro(String nome, String autorLivro, String data) {
    }

    public Livro(String titulo, Autor autor,
                 LocalDate dataCadastro) {
        this.idLivro =++contadorIdLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.dataCadastro = dataCadastro;
        this.statusLivro = StatusLivro.DISPONIVEL;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public StatusLivro getStatusLivro() {
        return statusLivro;
    }

    public void setStatusLivro(StatusLivro statusLivro) {
        this.statusLivro = statusLivro;
    }
    public boolean isDisponivel(){
        return this.statusLivro == StatusLivro.DISPONIVEL;
    }

    @Override
    public String toString() {
        return "Autor{"+
                "id= " + idLivro +
                ", nome: " + autor.getNomeAutor() +
                ", titulo: " +titulo+
                ", data de lançamento: " + dataCadastro +
                ", status livro: " + statusLivro+
                "}";
    }
}
