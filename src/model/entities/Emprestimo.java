package model.entities;

public class Emprestimo {
    private int id;
    private static int contadorIdEmprestimo = 0;
    private Livro livro;
    private Clientes cliente;
    private boolean ativo;

    public Emprestimo(Livro livro, Clientes cliente) {
        this.id = ++contadorIdEmprestimo;
        this.livro = livro;
        this.cliente = cliente;
        this.ativo = true;
    }

    public int getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }


    @Override
    public String toString() {
        return "Emprestimo{" +
                "id do emprestimo=" + id +
                ", livro=" + livro.getTitulo() +
                ", nomeUsuario='" + cliente.getNome() +
                ", ativo=" + ativo +
                '}';
    }
}
