package Telas.Cliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.ControllerCustomers;
import Model.Customers;
import Util.Label;
import Util.Text;

public class CadastroCliente extends JFrame{
    
    JPanel panelCadastro = new JPanel();

    Label labelCustomerID, labelCompanyName, labelContactName, labelContactTitle, labelAdress, labelCity, labelRegion, labelPostalCode, labelCountry, labelPhone, labelFax;
    Text textCustomerID, textCompanyName, textContactName, textContactTitle, textAdress, textCity, textRegion, textPostalCode, textCountry, textPhone, textFax;

    ControllerCustomers controllerCustomers = new ControllerCustomers();
    Customers newCustomer = new Customers();
    
    JButton buttonCadastrar;
    JButton buttonSair;

    public CadastroCliente(){
        configuraJanela();
        configuraTela();
    }



    public void configuraJanela(){
        setTitle("Cadastro de Clientes");
        setSize(620,650);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panelCadastro);
    }

    public void configuraTela(){
        panelCadastro.setLayout(null);
        inicializaCampos();
        inicializaBotoes();
    }

    public void inicializaBotoes(){
        buttonCadastrar = new JButton();
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setFont(new Font("SansSerif", Font.PLAIN, 18));
        buttonCadastrar.setBackground(new Color(229,235,234));
        buttonCadastrar.setBounds(160, 550, 120, 35);
        buttonCadastrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Salvar");
                newCustomer = montaCliente();
                controllerCustomers.inserir(newCustomer);

            }});
        panelCadastro.add(buttonCadastrar);
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
        panelCadastro.add(buttonSair);
    }

    public void desbilitaCampos(){
        textCustomerID.setEnabled(false);
        textCompanyName.setEnabled(false);
        textContactName.setEnabled(false);
        textContactTitle.setEnabled(false);
        textAdress.setEnabled(false);
        textCity.setEnabled(false);
        textRegion.setEnabled(false);
        textPostalCode.setEnabled(false);
        textCountry.setEnabled(false);
        textPhone.setEnabled(false);
        textFax.setEnabled(false);
        buttonCadastrar.setEnabled(false);

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

    /*public boolean validaCampos(){
        boolean validaCPF = false;
        boolean validaNome = false;
        boolean validado = false;
        String cpf = (String) textCPF.getValue();
        if(cpf==null || cpf.length()==0){
            System.out.println("CPF VAZIO");
        }else{
            validaCPF = isValidCPF(cpf.replaceAll("\\D", ""));
        }if(validaCPF == true){
            textCPF.setBackground(Color.WHITE);
        }else{
            textCPF.setBackground(Color.RED);
        }

        String nomeEsp = textNome.getText();
        while (nomeEsp.indexOf("  ") != -1) nomeEsp = nomeEsp.replace("   ", " ");
        textNome.setText(nomeEsp); 
        validaNome = nomeIsValid(nomeEsp);
        if(validaNome == true){
            System.out.println("Nome valido");
            textNome.setBackground(Color.WHITE);
        }else{
            textNome.setBackground(Color.RED);
            System.out.println("Nome invalido");
        }

        if((validaCPF && validaNome)==true){
            validado = true;
        }
        return validado;
    }*/

    public void inicializaCampos(){

        labelCustomerID = new Label("ID", 50, 10, 100, 100);
        panelCadastro.add(labelCustomerID);

        textCustomerID = new Text();
        textCustomerID.setBounds(50, 75, 100, 25);
        panelCadastro.add(textCustomerID);
        //

        labelCompanyName = new Label("Company Name",50, 90, 100, 100);
        panelCadastro.add(labelCompanyName);

        textCompanyName = new Text();
        textCompanyName.setBounds(50, 155, 220, 25);
        panelCadastro.add(textCompanyName);
        //

        labelContactName = new Label("Contact Name",300, 90, 100, 100);
        panelCadastro.add(labelContactName);

        textContactName = new Text();
        textContactName.setBounds(300, 155, 100, 25);
        panelCadastro.add(textContactName);
        //

        labelContactTitle = new Label("Contact Title",430, 90, 100, 100);
        panelCadastro.add(labelContactTitle);

        textContactTitle = new Text();
        textContactTitle.setBounds(430, 154, 110, 25);
        panelCadastro.add(textContactTitle);
        //

        labelAdress = new Label("Adress",50, 170, 100, 100);
        panelCadastro.add(labelAdress);

        textAdress = new Text();
        textAdress.setBounds(50, 235, 130, 25);
        panelCadastro.add(textAdress);

        labelCity = new Label("City",220, 170, 100, 100);
        panelCadastro.add(labelCity);

        textCity= new Text();
        textCity.setBounds(220, 235, 320, 25);
        panelCadastro.add(textCity);

        // Fim compos cliente
        
        labelRegion = new Label("Region",50, 250, 100, 100);
        panelCadastro.add(labelRegion);

        textRegion = new Text();
        textRegion.setBounds(50, 315, 130, 25);
        panelCadastro.add(textRegion);
        //

        labelPostalCode = new Label("Postal Code",220, 250, 100, 100);
        panelCadastro.add(labelPostalCode);

        textPostalCode = new Text();
        textPostalCode.setBounds(220, 315, 320, 25);
        panelCadastro.add(textPostalCode);
        //

        labelCountry = new Label("Country",50, 330, 100, 100);
        panelCadastro.add(labelCountry);

        textCountry= new Text();
        textCountry.setBounds(50, 395, 130, 25);
        panelCadastro.add(textCountry);
        //

        labelPhone = new Label("Phone",220, 330, 150, 100);
        panelCadastro.add(labelPhone);

        textPhone= new Text();
        textPhone.setBounds(220, 395, 130, 25);
        panelCadastro.add(textPhone);
        //

        labelFax = new Label("Fax",50, 410, 100, 100);
        panelCadastro.add(labelFax);

        textFax = new Text();
        textFax.setBounds(50, 475, 150, 25);
        panelCadastro.add(textFax);

    }

}
