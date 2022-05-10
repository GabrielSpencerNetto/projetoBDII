package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOShippers;
import Model.Shippers;

public class ControllerShippers {
    
    private DAOBridge<Shippers> shippers;
    private static DAOShippers shippersDAO = new DAOShippers();
    private Shippers shi;

    public ControllerShippers() {
        this.shippers = shippersDAO;
    }


    public void inserir(Shippers t) {
        shippers.inserir(t);
    }

    public void remover(Shippers t) {
        shippers.remover(t);
    }

    public void atualizar(Shippers t) {
        shippers.atualizar(t);
    }

    public Shippers consultar(String t) {
        shi = shippers.consultar(t);
        return shi;
    }

    public ArrayList<Shippers> listarTodos() {
        ArrayList<Shippers> local = this.shippers.consultarTodos();

        if (local != null) {
            return local;
        } else {
            return null;
        }
    }

}
