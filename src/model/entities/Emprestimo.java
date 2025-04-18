package model.entities;

public class Emprestimo {
    private int idLivroEmprestimo;
    private static int contadorIdEmprestimo = 0;
    private Livro livro;
    private Clientes cliente;
    private boolean ativo;

    public Emprestimo(Livro livro, Clientes cliente) {
        this.idLivroEmprestimo = ++contadorIdEmprestimo;
        this.livro = livro;
        this.cliente = cliente;
        this.ativo = true;
    }
    public Clientes getCliente(){
        return cliente;
    }

    public Livro getLivro(){
        return livro;
    }

    public int getIdLivroEmprestimo() {
        return idLivroEmprestimo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void devolverLivro(){
        this.ativo = false;
    }
    @Override
    public String toString() {
        return "Emprestimo{" +
                "idLivroEmprestimo do emprestimo=" + idLivroEmprestimo +
                ", livro=" + livro.getTitulo() +
                ", nomeUsuario='" + cliente.getNome() +
                ", idLivroEmprestimo do usario='" + cliente.getIdCliente() +
                ", ativo=" + ativo +
                '}';
    }
}
