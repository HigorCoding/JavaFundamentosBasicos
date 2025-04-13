package model.entities;

import java.time.LocalDate;

public class Autor {
    private int id;
    private String nomeAutor;
    private LocalDate dataNascimentoAutor;
    private static int contadorIdAutor = 0;

    public Autor() {
    }

    public Autor(String nomeAutor, LocalDate dataNascimentoAutor) {
        this.id = ++contadorIdAutor;
        this.dataNascimentoAutor = dataNascimentoAutor;
        this.nomeAutor = nomeAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public LocalDate getDataNascimentoAutor() {
        return dataNascimentoAutor;
    }

    public void setDataNascimentoAutor(LocalDate dataNascimentoAutor) {
        this.dataNascimentoAutor = dataNascimentoAutor;
    }

    public int getId() {
        return id;
    }
    public String toString() {
        return "Autor{"+
                "id= " + id +
                ", nome: " +nomeAutor +
                ", data de nascimento: " + dataNascimentoAutor +
                "}";
    }

}
