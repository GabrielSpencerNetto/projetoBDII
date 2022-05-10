package Telas.Venda;

import java.util.ArrayList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.MaskFormatter;

import Controller.ControllerCustomers;
import Controller.ControllerEmployees;
import Controller.ControllerProducts;
import Controller.ControllerShippers;
import Model.Customers;
import Model.Employees;
import Model.OrderDetails;
import Model.Products;
import Model.Shippers;
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
    JComboBox<String> comboProducts;

    Label labelOrderID, labelOrderDate, labelRequiredDate, labelShippedDate, labelFreigth, labelShipName, labelShipAddress, labelShipCity, labelShipRegion, labelShipPostalCode, labelCountry, labelCustomer, labelEmployee, labelShipVia, labelProducts;
    Text textOrderID, textOrderDate, textRequiredDate, textShippedDate, textFreigth, textShipName, textShipAddress, textShipCity, textShipRegion, textShipPostalCode, textCountry;

    ArrayList<String> listaComboCustomer = new ArrayList<String>();
    ArrayList<String> listaComboEmployee = new ArrayList<String>();
    ArrayList<String> listaComboShipVia = new ArrayList<String>();
    ArrayList<String> listaComboProducts = new ArrayList<String>();


    ArrayList<OrderDetails> listaOrderDetails = new ArrayList<OrderDetails>();

    JButton buttonCadastrar;
    JButton buttonAdd;
    JButton buttonSair;

    public CadastroVenda(){
        configuraJanela();
        configuraTela();
    }

    public void configuraJanela(){
        setTitle("Cadastro de Vendas");
        setSize(920,890);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panelCadastro);
    }

    public void configuraTela(){
        panelCadastro.setLayout(null);
        inicializaBotoes();
        inicializaCampos();
        
    }

    public void inicializaBotoes(){
        buttonCadastrar = new JButton();
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setFont(new Font("SansSerif", Font.PLAIN, 18));
        buttonCadastrar.setBackground(new Color(229,235,234));
        buttonCadastrar.setBounds(300, 800, 120, 35);
        buttonCadastrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
        panelCadastro.add(buttonCadastrar);

        buttonSair = new JButton(); 
        buttonSair.setText("Sair");
        buttonSair.setFont(new Font("SansSerif", Font.PLAIN, 18));
        buttonSair.setBackground(new Color(229,235,234));
        buttonSair.setBounds(450, 800, 120, 35);
        buttonSair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }});
        panelCadastro.add(buttonSair);

        buttonAdd = new JButton();
        buttonAdd.setText("+");
        buttonAdd.setFont(new Font("SansSerif", Font.PLAIN, 16));
        buttonAdd.setBackground(new Color(229,235,234));
        buttonAdd.setBounds(420, 460, 45, 40);
        buttonAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                
            }
        });
        panelCadastro.add(buttonAdd);
    }

    public void inicializaCampos(){
        labelOrderID = new Label("Order ID", 15, 20, 100, 100);
        panelCadastro.add(labelOrderID);
        
        textOrderID = new Text();
        textOrderID.setEnabled(false);
        textOrderID.setBounds(15, 90, 100, 25);
        panelCadastro.add(textOrderID);
        
        labelOrderDate = new Label("Order Date", 150, 20, 100, 100);
        panelCadastro.add(labelOrderDate);
        
        textOrderDate = new Text();
        textOrderDate.setBounds(150, 90, 100, 25);
        panelCadastro.add(textOrderDate);

        labelRequiredDate = new Label("Required Date", 300, 20, 130, 100);
        panelCadastro.add(labelRequiredDate);
        
        textRequiredDate = new Text();
        textRequiredDate.setBounds(300, 90, 100, 25);
        panelCadastro.add(textRequiredDate);

        labelShippedDate = new Label("Shipped Date", 450, 20, 130, 100);
        panelCadastro.add(labelShippedDate);
        
        textShippedDate = new Text();
        textShippedDate.setBounds(450, 90, 100, 25);
        panelCadastro.add(textShippedDate);

        labelShipVia = new Label("Ship Via", 600, 20, 130, 100);
        panelCadastro.add(labelShipVia);
        
        comboShipVia = new JComboBox<String>();
        montaComboBoxShipVia();
        comboShipVia.setBounds(600, 90, 130, 25);        
        panelCadastro.add(comboShipVia);

        labelFreigth = new Label("Freigth", 750, 20, 130, 100);
        panelCadastro.add(labelFreigth);
        
        textFreigth = new Text();
        textFreigth.setBounds(750, 90, 100, 25);
        panelCadastro.add(textFreigth);
        //

        labelCustomer = new Label("Customer", 15, 110, 130, 100);
        panelCadastro.add(labelCustomer);

        comboCustomer = new JComboBox<String>();
        montaComboBoxCustomer();
        comboCustomer.setBounds(15, 180, 400, 25);        
        panelCadastro.add(comboCustomer);

        labelEmployee = new Label("Employee", 450, 110, 130, 100);
        panelCadastro.add(labelEmployee);

        comboEmployee = new JComboBox<String>();
        montaComboBoxEmployee();
        comboEmployee.setBounds(450, 180, 400, 25);        
        panelCadastro.add(comboEmployee);
        //

        labelShipName = new Label("Ship Name", 15, 200, 100, 100);
        panelCadastro.add(labelShipName);
        
        textShipName = new Text();
        textShipName.setBounds(15, 270, 140, 25);
        panelCadastro.add(textShipName);

        labelShipAddress = new Label("Ship Address", 200, 200, 140, 100);
        panelCadastro.add(labelShipAddress);
        
        textShipAddress = new Text();
        textShipAddress.setBounds(200, 270, 240, 25);
        panelCadastro.add(textShipAddress);

        labelShipCity = new Label("Ship City", 470, 200, 140, 100);
        panelCadastro.add(labelShipCity);
        
        textShipCity = new Text();
        textShipCity.setBounds(470, 270, 180, 25);
        panelCadastro.add(textShipCity);

        labelShipRegion = new Label("Ship Region", 670, 200, 150, 100);
        panelCadastro.add(labelShipRegion);
        
        textShipRegion = new Text();
        textShipRegion.setBounds(670, 270, 180, 25);
        panelCadastro.add(textShipRegion);
        //

        labelShipPostalCode = new Label("Ship Postal Code", 15, 300, 180, 100);
        panelCadastro.add(labelShipPostalCode);
        
        textShipPostalCode = new Text();
        textShipPostalCode.setBounds(15, 370, 140, 25);
        panelCadastro.add(textShipPostalCode);

        labelCountry = new Label("Country", 200, 300, 150, 100);
        panelCadastro.add(labelCountry);
        
        textCountry = new Text();
        textCountry.setBounds(200, 370, 140, 25);
        panelCadastro.add(textCountry);
        //

        labelProducts = new Label("Products", 15, 400, 180, 100);
        panelCadastro.add(labelProducts);

        comboProducts = new JComboBox<String>();
        montaComboBoxProducts();
        comboProducts.setBounds(15, 470, 400, 25);        
        panelCadastro.add(comboProducts);


       
        panel.setBackground(Color.white);
        panel.setBounds(15, 520, 840, 350);
        panel.setLayout(new GridLayout(0, 1, 10, 10));

        scroll.setPreferredSize(new Dimension(500, 350));
        scroll.setBounds(15, 520, 840, 200);
        scroll.setViewportView(panel);

        panelCadastro.add(scroll);
    }

    public void montaComboBoxCustomer(){
        ControllerCustomers controllerCustomers = new ControllerCustomers();
        ArrayList<Customers> customers = controllerCustomers.listarTodos();
        Customers aux = new Customers();
        comboCustomer.addItem("");
        if(customers==null){
            comboCustomer.addItem(" - ");
        }else{
            for(Object c : customers){
                aux = (Customers) c;
                comboCustomer.addItem(aux.CustomerID + " - " + aux.CompanyName);
            }
        }


    }

    public void montaComboBoxEmployee(){
        ControllerEmployees controllerEmployees = new ControllerEmployees();
        ArrayList<Employees> employees = controllerEmployees.listarTodos();
        Employees aux = new Employees();
        comboEmployee.addItem("");
        if(employees!=null){
            for(Object c : employees){
                aux = (Employees) c;
                comboEmployee.addItem(aux.EmployeeID + " - " + aux.FirstName + " " + aux.LastName);
            }
        }else{
            comboEmployee.addItem(" - ");
        }

    }

    public void montaComboBoxShipVia(){
        ControllerShippers controllerShippers = new ControllerShippers();
        ArrayList<Shippers> shippers = controllerShippers.listarTodos();
        Shippers aux = new Shippers();
        comboShipVia.addItem("");
        if(shippers!=null){
            for(Object c : shippers){
                aux = (Shippers) c;
                comboShipVia.addItem(aux.ShipperID + " - " + aux.CompanyName);
            }
        }else{
            comboShipVia.addItem(" - ");
        }

    }

    public void montaComboBoxProducts(){
        ControllerProducts controllerProducts = new ControllerProducts();
        ArrayList<Products> products = controllerProducts.listarTodos();
        Products aux = new Products();
        comboProducts.addItem("");
        if(products!=null){
            for(Object c : products){
                aux = (Products) c;
                comboShipVia.addItem(aux.ProductID + " - " + aux.ProductName);
            }
        }else{
            comboProducts.addItem(" - ");
        }

    }

}
