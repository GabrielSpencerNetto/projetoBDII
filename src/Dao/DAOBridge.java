package Dao;

import java.util.ArrayList;

public interface DAOBridge<T> {

    public void inserir(T t);

    public void remover(T t);

    public void atualizar(T t);

    public T consultar(String t);
    
    public T consultar(T t);

    public ArrayList<T> consultarTodos();

//    public DAOBridge obterInstancia();

}
