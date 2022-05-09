package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOOrders;
import Model.Orders;

public class ControllerOrders {

    private DAOBridge<Orders> orders;
    private static DAOOrders ordersDAO = new DAOOrders();
    private Orders ord;

    public ControllerOrders() {
        this.orders = ordersDAO;
    }


    public void inserir(Orders t) {
        orders.inserir(t);
    }

    public void remover(Orders t) {
        orders.remover(t);
    }

    public void atualizar(Orders t) {
        orders.atualizar(t);
    }

    public Orders consultar(String t) {
        ord = orders.consultar(t);
        return ord;
    }

    public void listarTodos() {
        ArrayList<Orders> local = this.orders.consultarTodos();

        if (local != null) {
            for (Orders l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
