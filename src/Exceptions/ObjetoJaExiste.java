package Exceptions;

public class ObjetoJaExiste extends Exception {

    public ObjetoJaExiste(Object o) {
        super(o.getClass() + " ja esta cadastrado");
    }
}
