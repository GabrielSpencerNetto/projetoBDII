package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOProducts;
import Model.Products;

public class ControllerProducts {

    private DAOBridge<Products> products;
    private static DAOProducts productsDAO = new DAOProducts();
    private Products pro;

    public ControllerProducts() {
        this.products = productsDAO;
    }


    public void inserir(Products t) {
        products.inserir(t);
    }

    public void remover(Products t) {
        products.remover(t);
    }

    public void atualizar(Products t) {
        products.atualizar(t);
    }

    public Products consultar(String t) {
        pro = products.consultar(t);
        return pro;
    }

    public void listarTodos() {
        ArrayList<Products> local = this.products.consultarTodos();

        if (local != null) {
            for (Products l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
