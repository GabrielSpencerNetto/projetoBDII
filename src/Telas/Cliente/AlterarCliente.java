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

public class AlterarCliente extends JFrame{
    
    JPanel panelAlterar = new JPanel();

    Label labelCustomerID, labelCompanyName, labelContactName, labelContactTitle, labelAdress, labelCity, labelRegion, labelPostalCode, labelCountry, labelPhone, labelFax;
    Text textCustomerID, textCompanyName, textContactName, textContactTitle, textAdress, textCity, textRegion, textPostalCode, textCountry, textPhone, textFax;

    JButton buttonAlterar;
    JButton buttonSair;

    ControllerCustomers controllerCustomers = new ControllerCustomers();
    Customers alterarCliente = new Customers();

    public AlterarCliente(){
        configuraJanela();
        configuraTela();
    }

    public void configuraJanela(){
        setTitle("Alterar Cliente");
        setSize(620,650);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panelAlterar);
    }

    public void configuraTela(){

        panelAlterar.setLayout(null);
                
        String inputValue = JOptionPane.showInputDialog("Digite o ID do cliente que deseja alterar:");
        alterarCliente = controllerCustomers.consultar(inputValue);
        if(alterarCliente==null){
            JOptionPane.showMessageDialog(null, "ID inserido ainda não foi cadastrado ");
        }
        
        inicializaCampos();
        obtemClienteAlterar(alterarCliente);
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

    public void obtemClienteAlterar(Customers alterarCliente){
        
        textCustomerID.setText(Integer.toString(alterarCliente.CustomerID));
        textCustomerID.setEnabled(false);
        textCompanyName.setText(alterarCliente.CompanyName);
        textContactName.setText(alterarCliente.ContactName);
        textContactTitle.setText(alterarCliente.ContactTitle);
        textAdress.setText(alterarCliente.Address);
        textCity.setText(alterarCliente.City);
        textRegion.setText(alterarCliente.Region);
        textPostalCode.setText(alterarCliente.PostalCode);
        textCountry.setText(alterarCliente.Country);
        textPhone.setText(alterarCliente.Phone);
        textFax.setText(alterarCliente.Fax);

    }

    public void inicializaBotoes(){
        buttonAlterar = new JButton();
        buttonAlterar.setText("Alterar");
        buttonAlterar.setFont(new Font("SansSerif", Font.PLAIN, 18));
        buttonAlterar.setBackground(new Color(229,235,234));
        buttonAlterar.setBounds(160, 550, 120, 35);
        buttonAlterar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valido = validaCampos();
                if(valido==true){
                    Customers customerAlt = montaCliente();
                    controllerCustomers.atualizar(customerAlt);
                    JOptionPane.showMessageDialog(null, "Cliente Alterado com sucesso");
                }
            }});
        panelAlterar.add(buttonAlterar);
        buttonSair = new JButton(); 
        buttonSair.setText("Sair");
        buttonSair.setFont(new Font("SansSerif", Font.PLAIN, 18));
        buttonSair.setBackground(new Color(229,235,234));
        buttonSair.setBounds(300, 550, 120, 35);
        buttonSair.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }});
            
        panelAlterar.add(buttonSair);
    }

    public boolean validaCampos(){
        boolean validaNome = false;
        boolean validado = false;

        String nomeEsp = textCompanyName.getText();
        while (nomeEsp.indexOf("  ") != -1) nomeEsp = nomeEsp.replace("   ", " ");
        textCompanyName.setText(nomeEsp); 
        //validaNome = nomeIsValid(nomeEsp);
        if(validaNome == true){
            System.out.println("Nome valido");
            textCompanyName.setBackground(Color.WHITE);
        }else{
            textCompanyName.setBackground(Color.RED);
            System.out.println("Nome invalido");
        }

        if(validaNome==true){
            validado = true;
        }
        return validado;
    }

    public void inicializaCampos(){

        labelCustomerID = new Label("ID", 50, 10, 100, 100);
        panelAlterar.add(labelCustomerID);

        textCustomerID = new Text();
        textCustomerID.setBounds(50, 75, 100, 25);
        panelAlterar.add(textCustomerID);
        //

        labelCompanyName = new Label("Company Name",50, 90, 100, 100);
        panelAlterar.add(labelCompanyName);

        textCompanyName = new Text();
        textCompanyName.setBounds(50, 155, 220, 25);
        panelAlterar.add(textCompanyName);
        //

        labelContactName = new Label("Contact Name",300, 90, 100, 100);
        panelAlterar.add(labelContactName);

        textContactName = new Text();
        textContactName.setBounds(300, 155, 100, 25);
        panelAlterar.add(textContactName);
        //

        labelContactTitle = new Label("Contact Title",430, 90, 100, 100);
        panelAlterar.add(labelContactTitle);

        textContactTitle = new Text();
        textContactTitle.setBounds(430, 154, 110, 25);
        panelAlterar.add(textContactTitle);
        //

        labelAdress = new Label("Adress",50, 170, 100, 100);
        panelAlterar.add(labelAdress);

        textAdress = new Text();
        textAdress.setBounds(50, 235, 130, 25);
        panelAlterar.add(textAdress);

        labelCity = new Label("City",220, 170, 100, 100);
        panelAlterar.add(labelCity);

        textCity= new Text();
        textCity.setBounds(220, 235, 320, 25);
        panelAlterar.add(textCity);
        
        labelRegion = new Label("Region",50, 250, 100, 100);
        panelAlterar.add(labelRegion);

        textRegion = new Text();
        textRegion.setBounds(50, 315, 130, 25);
        panelAlterar.add(textRegion);
        //

        labelPostalCode = new Label("Postal Code",220, 250, 100, 100);
        panelAlterar.add(labelPostalCode);

        textPostalCode = new Text();
        textPostalCode.setBounds(220, 315, 320, 25);
        panelAlterar.add(textPostalCode);
        //

        labelCountry = new Label("Country",50, 330, 100, 100);
        panelAlterar.add(labelCountry);

        textCountry= new Text();
        textCountry.setBounds(50, 395, 130, 25);
        panelAlterar.add(textCountry);
        //

        labelPhone = new Label("Phone",220, 330, 150, 100);
        panelAlterar.add(labelPhone);

        textPhone= new Text();
        textPhone.setBounds(220, 395, 130, 25);
        panelAlterar.add(textPhone);
        //

        labelFax = new Label("Fax",50, 410, 100, 100);
        panelAlterar.add(labelFax);

        textFax = new Text();
        textFax.setBounds(50, 475, 150, 25);
        panelAlterar.add(textFax);
        
    }

}
