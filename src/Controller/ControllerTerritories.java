package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOTerritories;
import Model.Territories;

public class ControllerTerritories {
    
    private DAOBridge<Territories> territories;
    private static DAOTerritories territoriesDAO = new DAOTerritories();
    private Territories ter;

    public ControllerTerritories() {
        this.territories = territoriesDAO;
    }


    public void inserir(Territories t) {
        territories.inserir(t);
    }

    public void remover(Territories t) {
        territories.remover(t);
    }

    public void atualizar(Territories t) {
        territories.atualizar(t);
    }

    public Territories consultar(String t) {
        ter = territories.consultar(t);
        return ter;
    }

    public void listarTodos() {
        ArrayList<Territories> local = this.territories.consultarTodos();

        if (local != null) {
            for (Territories l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
