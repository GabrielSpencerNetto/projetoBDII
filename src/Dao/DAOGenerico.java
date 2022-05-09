package Dao;


import java.util.ArrayList;

import Exceptions.ObjetoJaExiste;
import Exceptions.ObjetoNaoExiste;


public class DAOGenerico<T> implements DAOBridge<T> {

    protected ArrayList<T> array = new ArrayList<>();
    ObjetoJaExiste jaExiste;
    ObjetoNaoExiste naoExiste;

    @Override
    public void inserir(T t) {
        if (!array.contains(t)) {
            array.add(t);
        } else {
            jaExiste = new ObjetoJaExiste(this);
            System.out.println(jaExiste.getMessage());
        }
    }

    @Override
    public void remover(T t) {
        if (array.contains(t)) {
            array.remove(t);
        } else {
            naoExiste = new ObjetoNaoExiste(this);
            System.out.println(naoExiste.getMessage());
        }
    }

    @Override
    public void atualizar(T t) {
        for (T tipo : array) {
            if (tipo.equals(t)) {
                array.set(array.indexOf(tipo), t);
                return;
            }
        }
        naoExiste = new ObjetoNaoExiste(this);
        System.out.println(naoExiste.getMessage());
    }

    @Override
    public T consultar(String t) {
        for (T o : array) {
            if (o.equals(t)) {
                return o;
            }
        }
        return null;
    }

    @Override
    public T consultar(T t) {
        for (T o : array) {
            if (o.equals(t)) {
                return o;
            }
        }
        return null;
    }

    @Override
    public ArrayList<T> consultarTodos() {
        return array;
    }
}

