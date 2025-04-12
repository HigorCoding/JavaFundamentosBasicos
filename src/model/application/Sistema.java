package model.application;

import model.entities.Autor;
import model.entities.Biblioteca;
import model.entities.Clientes;
import model.entities.Livro;
import model.enums.StatusLivro;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import static model.entities.Livro.formatter;

public class Sistema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int opcaoUsuario = 0;
        String nome;
        String data;
        Biblioteca biblioteca = new Biblioteca();

        do {
            System.out.println("BEM VINDO AO SISTEMA DE LIVRARIA!");
            System.out.println("Selecione uma da opção abaixo: ");
            System.out.println("1 - Cadastro cliente");
            System.out.println("2 - Cadastro autor");
            System.out.println("3 - Cadastro livro");
            System.out.println("4 - Emprestimo de livro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcaoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Cadastro de cliente selecionado.");
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Data de nascimento (dd/MM/yyyy): ");
                    data = scanner.next();
                    LocalDate dataNascimento = LocalDate.parse(data,formatter);
                    System.out.print("Email: ");
                    String email = scanner.next();
                    Clientes clientes = new Clientes(nome, dataNascimento, email);
                    biblioteca.adicionarCliente(clientes);
                    biblioteca.exibirClientes();
                    scanner.next();
                    break;
                case 2:
                    System.out.println("Cadastro de autor selecionado.");
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Data de nascimento (dd/MM/yyyy): ");
                    data = scanner.next();
                    LocalDate dataNascimentoAutor = LocalDate.parse(data,formatter);
                    Autor autor =  new Autor(nome, dataNascimentoAutor);
                    biblioteca.adicionarAutores(autor);
                    biblioteca.exibirAutores();
                    scanner.next();
                    break;
                case 3:
                    System.out.println("Cadastro de livro selecionado.");
                    System.out.print("Titulo: ");
                    nome = scanner.nextLine();
                    System.out.print("Qual o id do Autor:  ");
                    int idAutor = scanner.nextInt();
                    Autor autorSelecionado = biblioteca.buscarIdAutor(idAutor);
                    System.out.print("Data do livro (dd/MM/yyyy): ");
                    data = scanner.next();
                    LocalDate dataCadastro = LocalDate.parse(data, formatter);
                    System.out.println("Status livro (disponoivel/emprestado): ");
                    String statusStr = scanner.nextLine().toUpperCase();
                    StatusLivro status = StatusLivro.valueOf(statusStr);
                    Livro livro = new Livro(nome, autorSelecionado, dataCadastro, status);

                    break;
                case 4:
                    System.out.println("Empréstimo de livro selecionado.");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        }while ( opcaoUsuario != 0);
        System.out.println("Programa encerrado.");

        scanner.close();
    }
}
