package Controller;

import java.util.ArrayList;

import Dao.DAOBridge;
import Dao.DAOEmployees;
import Model.Employees;

public class ControllerEmployees {
    
    private DAOBridge<Employees> employees;
    private static DAOEmployees employeesDAO = new DAOEmployees();
    private Employees emp;

    public ControllerEmployees() {
        this.employees = employeesDAO;
    }


    public void inserir(Employees t) {
        employees.inserir(t);
    }

    public void remover(Employees t) {
        employees.remover(t);
    }

    public void atualizar(Employees t) {
        employees.atualizar(t);
    }

    public Employees consultar(String t) {
        emp = employees.consultar(t);
        return emp;
    }

    public void listarTodos() {
        ArrayList<Employees> local = this.employees.consultarTodos();

        if (local != null) {
            for (Employees l : local) {
                System.out.println(l);
            }
        } else {
            System.out.println("Repositorio Vazio");
        }
    }

}
