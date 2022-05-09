package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOCategories;
import Model.Categories;

public class ControllerCategories {
    
    private DAOBridge<Categories> categories;
    private static DAOCategories categoriesDAO = new DAOCategories();
    private Categories cat;

    public ControllerCategories() {
        this.categories = categoriesDAO;
    }


    public void inserir(Categories t) {
        categories.inserir(t);
    }

    public void remover(Categories t) {
        categories.remover(t);
    }

    public void atualizar(Categories t) {
        categories.atualizar(t);
    }

    public Categories consultar(String t) {
        cat = categories.consultar(t);
        return cat;
    }

    public void listarTodos() {
        ArrayList<Categories> local = this.categories.consultarTodos();

        if (local != null) {
            for (Categories l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
