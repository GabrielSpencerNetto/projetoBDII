package Telas.Cliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controller.ControllerCustomers;
import Model.Customers;
import Util.Label;
import Util.Text;



public class ConsultarCliente extends JFrame{

    JPanel panelConsultar = new JPanel();

    Label labelCustomerID, labelCompanyName, labelContactName, labelContactTitle, labelAdress, labelCity, labelRegion, labelPostalCode, labelCountry, labelPhone, labelFax;
    Text textCustomerID, textCompanyName, textContactName, textContactTitle, textAdress, textCity, textRegion, textPostalCode, textCountry, textPhone, textFax;

    JButton buttonAlterar;
    JButton buttonSair;

    ControllerCustomers controllerCustomers = new ControllerCustomers();



    public ConsultarCliente(){
        configuraJanela();
        configuraTela();
    }
    
    public void configuraJanela(){
        setTitle("Consultar Cliente");
        setSize(620,650);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panelConsultar);
    }

    public void configuraTela(){
        panelConsultar.setLayout(null);
        Customers consultarCliente = new Customers();
        String inputValue = JOptionPane.showInputDialog("Digite o ID do Customer que deseja Consultar:");
        consultarCliente = controllerCustomers.consultar(inputValue);
        if(consultarCliente==null){
            JOptionPane.showMessageDialog(null, "CPF inserido ainda não foi cadastrado ");
            dispose();
        }
        
        inicializaCampos();
        obtemClienteConsultar(consultarCliente);
        inicializaBotoes();
    }

    public Customers montaCliente(){

        Customers clienteNovo = new Customers(
            Integer.valueOf(textCustomerID.getText()), 
            textCompanyName.getText(), 
            textContactName.getText(), 
            textContactTitle.getText(), 
            textAdress.getText(), 
            textCity.getText(), 
            textRegion.getText(), 
            textPostalCode.getText(), 
            textCountry.getText(), 
            textPhone.getText(), 
            textFax.getText()

        );

        return clienteNovo;
    }

    public void obtemClienteConsultar(Customers alterarCliente){

        textCustomerID.setText(Integer.toString(alterarCliente.CustomerID));
        textCustomerID.setEnabled(false);

        textCompanyName.setText(alterarCliente.CompanyName);
        textCompanyName.setEnabled(false);

        textContactName.setText(alterarCliente.ContactName); 
        textContactName.setEnabled(false);

        textContactTitle.setText(alterarCliente.ContactTitle); 
        textContactTitle.setEnabled(false);

        textAdress.setText(alterarCliente.Address);
        textAdress.setEnabled(false);

        textCity.setText(alterarCliente.City);
        textCity.setEnabled(false);
        
        textRegion.setText(alterarCliente.Region); 
        textRegion.setEnabled(false);

        textPostalCode.setText(alterarCliente.PostalCode); 
        textPostalCode.setEnabled(false);

        textCountry.setText(alterarCliente.Country);
        textCountry.setEnabled(false);

        textPhone.setText(alterarCliente.Phone);
        textPhone.setEnabled(false);

        textFax.setText(alterarCliente.Fax);
        textFax.setEnabled(false);
    }

    public void inicializaBotoes(){
        buttonSair = new JButton(); 
        buttonSair.setText("Sair");
        buttonSair.setFont(new Font("SansSerif", Font.PLAIN, 18));
        buttonSair.setBackground(new Color(229,235,234));
        buttonSair.setBounds(250, 550, 120, 35);
        buttonSair.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }});
            
        panelConsultar.add(buttonSair);
    }

    public void inicializaCampos(){

        labelCustomerID = new Label("ID", 50, 10, 100, 100);
        panelConsultar.add(labelCustomerID);

        textCustomerID = new Text();
        textCustomerID.setBounds(50, 75, 100, 25);
        panelConsultar.add(textCustomerID);
        //

        labelCompanyName = new Label("Company Name",50, 90, 100, 100);
        panelConsultar.add(labelCompanyName);

        textCompanyName = new Text();
        textCompanyName.setBounds(50, 155, 220, 25);
        panelConsultar.add(textCompanyName);
        //

        labelContactName = new Label("Contact Name",300, 90, 100, 100);
        panelConsultar.add(labelContactName);

        textContactName = new Text();
        textContactName.setBounds(300, 155, 100, 25);
        panelConsultar.add(textContactName);
        //

        labelContactTitle = new Label("Contact Title",430, 90, 100, 100);
        panelConsultar.add(labelContactTitle);

        textContactTitle = new Text();
        textContactTitle.setBounds(430, 154, 110, 25);
        panelConsultar.add(textContactTitle);
        //

        labelAdress = new Label("Adress",50, 170, 100, 100);
        panelConsultar.add(labelAdress);

        textAdress = new Text();
        textAdress.setBounds(50, 235, 130, 25);
        panelConsultar.add(textAdress);

        labelCity = new Label("City",220, 170, 100, 100);
        panelConsultar.add(labelCity);

        textCity= new Text();
        textCity.setBounds(220, 235, 320, 25);
        panelConsultar.add(textCity);
        
        labelRegion = new Label("Region",50, 250, 100, 100);
        panelConsultar.add(labelRegion);

        textRegion = new Text();
        textRegion.setBounds(50, 315, 130, 25);
        panelConsultar.add(textRegion);
        //

        labelPostalCode = new Label("Postal Code",220, 250, 100, 100);
        panelConsultar.add(labelPostalCode);

        textPostalCode = new Text();
        textPostalCode.setBounds(220, 315, 320, 25);
        panelConsultar.add(textPostalCode);
        //

        labelCountry = new Label("Country",50, 330, 100, 100);
        panelConsultar.add(labelCountry);

        textCountry= new Text();
        textCountry.setBounds(50, 395, 130, 25);
        panelConsultar.add(textCountry);
        //

        labelPhone = new Label("Phone",220, 330, 150, 100);
        panelConsultar.add(labelPhone);

        textPhone= new Text();
        textPhone.setBounds(220, 395, 130, 25);
        panelConsultar.add(textPhone);
        //

        labelFax = new Label("Fax",50, 410, 100, 100);
        panelConsultar.add(labelFax);

        textFax = new Text();
        textFax.setBounds(50, 475, 150, 25);
        panelConsultar.add(textFax);
        
    }

}
