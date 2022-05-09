package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOOrderDetails;
import Model.OrderDetails;

public class ControllerOrderDetails {

    private DAOBridge<OrderDetails> orderDetails;
    private static DAOOrderDetails orderDetailsDAO = new DAOOrderDetails();
    private OrderDetails ord;

    public ControllerOrderDetails() {
        this.orderDetails = orderDetailsDAO;
    }


    public void inserir(OrderDetails t) {
        orderDetails.inserir(t);
    }

    public void remover(OrderDetails t) {
        orderDetails.remover(t);
    }

    public void atualizar(OrderDetails t) {
        orderDetails.atualizar(t);
    }

    public OrderDetails consultar(String t) {
        ord = orderDetails.consultar(t);
        return ord;
    }

    public void listarTodos() {
        ArrayList<OrderDetails> local = this.orderDetails.consultarTodos();

        if (local != null) {
            for (OrderDetails l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
