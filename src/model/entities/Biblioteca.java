package model.entities;

import model.enums.StatusLivro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<StatusLivro> emprestimos = new ArrayList<>();
    private List<Clientes> clientes = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public List<Livro> listarLivros() {
        return livros;
    }
    public void adicionarAutores(Autor autor) {
        autores.add(autor);
    }
    public List<Autor> listarAutores() {
        return autores;
    }
    public void adicionarStatus(StatusLivro statusLivro) {
        emprestimos.add(statusLivro);
    }
    public List<StatusLivro> listarStatusLivro() {
        return emprestimos;
    }
    public void adicionarCliente(Clientes cliente) {
        clientes.add(cliente);
    }
    public List<Clientes> listarClientes() {
        return clientes;
    }

    /*
    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro == StatusLivro()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }*/

    public void exibirClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Clientes cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
    public void exibirAutores() {
        if (autores.isEmpty()) {
            System.out.println("Nenhum autor cadastrado.");
        } else {
            for (Autor autor : autores) {
                System.out.println(autor);
            }
        }
    }
    public Autor buscarIdAutor(int idBuscado){
        for (Autor autor : listarAutores()){
            if (autor.getId() == idBuscado){
                System.out.println("Autor encontrado!");
                return autor;
            }
        }
        System.out.println("Autor não encontrado");
        return null;
    }

}

