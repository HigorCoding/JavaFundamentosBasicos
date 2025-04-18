package model.exception;

public class DadosValidacaoException extends RuntimeException {
    public DadosValidacaoException() {
        super("Dados não encontrado");
    }
    public DadosValidacaoException (String mensagem){
        super(mensagem);
    }
}
