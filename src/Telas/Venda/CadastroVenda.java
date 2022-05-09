package Telas.Venda;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


import Util.Label;
import Util.Text;

public class CadastroVenda extends JFrame{

    JPanel panelCadastro = new JPanel();
    JPanel panel = new JPanel();

    JScrollPane scroll = new JScrollPane(panel);
    //TextArea[] textAreas = new TextArea[100];

    JComboBox<String> comboCustomer;
    JComboBox<String> comboEmployee;
    JComboBox<String> comboShipVia;

    Label labelOrderID, lavelOrderDate, labelRequiredDate, labelShippedDate, labelFreigth, labelShipName, labelShipAddress, labelShipCity, labelShipRegion, labelShipPostalCode, labelCountry;
    Text textOrderID, textOrderDate, textRequiredDate, textShippedDate, textFreigth, textShipName, textShipAddress, textShipCity, textShipRegion, textShipPostalCode, textCountry;

    ArrayList<String> listaComboCustomer = new ArrayList<String>();
    ArrayList<String> listaComboEmployee = new ArrayList<String>();
    ArrayList<String> listaComboShipVia = new ArrayList<String>();

    JButton buttonCadastrar;
    JButton buttonAdd;
    JButton buttonSair;

    public CadastroVenda(){
        configuraJanela();
        configuraTela();
    }

    public void configuraJanela(){
        setTitle("Cadastro de Vendas");
        setSize(820,680);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panelCadastro);
    }

    public void configuraTela(){
        panelCadastro.setLayout(null);
        //inicializaCampos();
        //inicializaBotoes();
    }

}
