package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOCustommers;
import Model.Customers;

public class ControllerCustomers {
    private DAOBridge<Customers> customers;
    private static DAOCustommers customersDAO = new DAOCustommers();
    private Customers cus;

    public ControllerCustomers() {
        this.customers = customersDAO;
    }


    public void inserir(Customers t) {
        customers.inserir(t);
    }

    public void remover(Customers t) {
        customers.remover(t);
    }

    public void atualizar(Customers t) {
        customers.atualizar(t);
    }

    public Customers consultar(String t) {
        cus = customers.consultar(t);
        return cus;
    }

    public void listarTodos() {
        ArrayList<Customers> local = this.customers.consultarTodos();

        if (local != null) {
            for (Customers l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
