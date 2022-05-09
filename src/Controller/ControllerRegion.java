package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAORegion;
import Model.Region;

public class ControllerRegion {

    private DAOBridge<Region> region;
    private static DAORegion regionDAO = new DAORegion();
    private Region reg;

    public ControllerRegion() {
        this.region = regionDAO;
    }


    public void inserir(Region t) {
        region.inserir(t);
    }

    public void remover(Region t) {
        region.remover(t);
    }

    public void atualizar(Region t) {
        region.atualizar(t);
    }

    public Region consultar(String t) {
        reg = region.consultar(t);
        return reg;
    }

    public void listarTodos() {
        ArrayList<Region> local = this.region.consultarTodos();

        if (local != null) {
            for (Region l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }
}
