package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOEmployeesTerritories;
import Model.EmployeeTerritories;

public class ControllerEmplyeeTerritories {
    
    private DAOBridge<EmployeeTerritories> emplyeeTerritories;
    private static DAOEmployeesTerritories emplyeeTerritoriesDAO = new DAOEmployeesTerritories();
    private EmployeeTerritories emp;

    public ControllerEmplyeeTerritories() {
        this.emplyeeTerritories = emplyeeTerritoriesDAO;
    }


    public void inserir(EmployeeTerritories t) {
        emplyeeTerritories.inserir(t);
    }

    public void remover(EmployeeTerritories t) {
        emplyeeTerritories.remover(t);
    }

    public void atualizar(EmployeeTerritories t) {
        emplyeeTerritories.atualizar(t);
    }

    public EmployeeTerritories consultar(String t) {
        emp = emplyeeTerritories.consultar(t);
        return emp;
    }

    public void listarTodos() {
        ArrayList<EmployeeTerritories> local = this.emplyeeTerritories.consultarTodos();

        if (local != null) {
            for (EmployeeTerritories l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
