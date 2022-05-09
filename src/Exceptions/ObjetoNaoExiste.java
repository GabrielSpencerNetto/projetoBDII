package Exceptions;

public class ObjetoNaoExiste extends Exception {

    public ObjetoNaoExiste(Object o) {
        super(o.getClass() + " nao esta cadastrado");
    }
}
