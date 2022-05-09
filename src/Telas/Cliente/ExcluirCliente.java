package Telas.Cliente;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import Controller.ControllerCustomers;
import Model.Customers;

public class ExcluirCliente extends JFrame{

    ControllerCustomers controllerCustomers = new ControllerCustomers();
    Customers consultarCliente = new Customers();

    public ExcluirCliente(){
        String inputValue = JOptionPane.showInputDialog("Digite o ID do customer que deseja Excluir: ");

        consultarCliente = controllerCustomers.consultar(inputValue);
        if(consultarCliente==null){
            JOptionPane.showInputDialog("ID nao encontrado!");
        }else{
            controllerCustomers.remover(consultarCliente);
        }

    }
    
}
