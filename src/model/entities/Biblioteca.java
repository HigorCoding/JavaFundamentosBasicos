package model.entities;

import model.enums.StatusLivro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Clientes> clientes = new ArrayList<>();
    private List<Emprestimo> livrosEmprestados = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarAutores(Autor autor) {
        autores.add(autor);
    }

    public List<Autor> listarAutores() {
        return autores;
    }

    public void adicionarCliente(Clientes cliente) {
        clientes.add(cliente);
    }

    public List<Clientes> listarClientes() {
        return clientes;
    }

    public Clientes encontrarClientePorId(int idCliente) {
        for (Clientes cliente : listarClientes()) {
            if (cliente.getId() == idCliente) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado!");
        return null;
    }

    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public void exibirClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Clientes cliente : clientes) {
            System.out.println(cliente);
        }
    }


    public void exibirAutores() {
        if (autores.isEmpty()) {
            System.out.println("Nenhum autor cadastrado.");
            return;
        }
        for (Autor autor : autores) {
            System.out.println(autor);
            System.out.println();
        }
    }

    public void exibirLivrosEmprestados(){
        if (livrosEmprestados.isEmpty()){
            System.out.println("Nenhum livro emprestrado!");
            return;
        }
        for (Emprestimo emprestimo : livrosEmprestados){
            System.out.println(emprestimo);
            System.out.println();

        }
    }

    public Autor buscarIdAutor(int idBuscado) {
        for (Autor autor : listarAutores()) {
            if (autor.getId() == idBuscado) {
                System.out.println("Autor encontrado!");
                return autor;
            }
        }
        System.out.println("Autor não encontrado");
        return null;
    }

    public void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro livro : livros) {
            System.out.println(livro);
            System.out.println();
            }
        }

    public void exibirLivrosDisponiveis() {
        List<Livro> disponiveis = listarLivrosDisponiveis();
        if (disponiveis.isEmpty()) {
            System.out.println("Nenhum livro disponivel!");
            return;
        }
        System.out.println("Livros disponíveis:");
        for (Livro livro : disponiveis) {
            System.out.println(livro);
            }
        }

    public void emprestar(int idCliente, int idLivro){
        Clientes cliente = encontrarClientePorId(idCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }
        for (Livro livro : livros){
            if (livro.getId() == idLivro){
                if (livro.isDisponivel()){
                   livro.setStatusLivro(StatusLivro.EMPRESTADO);
                   Emprestimo emprestimo = new Emprestimo(livro, cliente);
                   livrosEmprestados.add(emprestimo);
                   System.out.println("Livro emprestado com sucesso!");
                   return;
                }else {
                    System.out.println("Livro não disponivel!");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

