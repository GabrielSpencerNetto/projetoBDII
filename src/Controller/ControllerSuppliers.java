package Controller;

import java.util.ArrayList;
import Dao.DAOBridge;
import Dao.DAOSuppliers;
import Model.Suppliers;

public class ControllerSuppliers {
    
    private DAOBridge<Suppliers> suppliers;
    private static DAOSuppliers suppliersDAO = new DAOSuppliers();
    private Suppliers sup;

    public ControllerSuppliers() {
        this.suppliers = suppliersDAO;
    }


    public void inserir(Suppliers t) {
        suppliers.inserir(t);
    }

    public void remover(Suppliers t) {
        suppliers.remover(t);
    }

    public void atualizar(Suppliers t) {
        suppliers.atualizar(t);
    }

    public Suppliers consultar(String t) {
        sup = suppliers.consultar(t);
        return sup;
    }

    public void listarTodos() {
        ArrayList<Suppliers> local = this.suppliers.consultarTodos();

        if (local != null) {
            for (Suppliers l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }
}
