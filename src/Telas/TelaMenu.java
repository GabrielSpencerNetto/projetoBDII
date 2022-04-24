package Telas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMenu extends JFrame{
    
    JFrame frameMenu = new JFrame("Sistema Controle de Vendas");
    JPanel panelMenu = new JPanel();
    JMenuBar menuBar = new JMenuBar();
    Font f = new Font("Calibri", Font.BOLD, 20);
    
    
    JMenu menuCliente = new JMenu("  Cliente ");
    JMenu menuVenda = new JMenu(" Venda ");
    JMenu menuSair = new JMenu(" Sair ");

    JMenuItem menuItemCliente1 = new JMenuItem(" - Cadastrar Cliente");
    JMenuItem menuItemCliente2 = new JMenuItem(" - Alterar Cliente");
    JMenuItem menuItemCliente3 = new JMenuItem(" - Consultar Cliente");
    JMenuItem menuItemCliente4 = new JMenuItem(" - Listar Clientes");
    JMenuItem menuItemCliente5 = new JMenuItem(" - Excluir Clientes");


    JMenuItem menuItemVenda1 = new JMenuItem(" - Cadastrar Venda");
    JMenuItem menuItemVenda2 = new JMenuItem(" - Alterar Venda");
    JMenuItem menuItemVenda3 = new JMenuItem(" - Consultar Venda");
    JMenuItem menuItemVenda4 = new JMenuItem(" - Listar Venda");
    JMenuItem menuItemVenda5 = new JMenuItem(" - Excluir Venda");

    JMenuItem menuItemSair = new JMenuItem("Sair");

    public TelaMenu(){
        configuraTela();
    }

    public void configuraTela(){
        panelMenu.setLayout(null);
        frameMenu.add(panelMenu);
        frameMenu.setSize(1200,700);
        frameMenu.setLocationRelativeTo(null);
        frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMenu.setVisible(true);
        configuraMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void configuraMenu(){
        menuBar.setLayout(new FlowLayout());

        menuCliente.setFont(f);
        menuCliente.add(menuItemCliente1);
        menuItemCliente1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
            }});

        menuCliente.add(menuItemCliente2);
        menuItemCliente2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
            }});
        menuCliente.add(menuItemCliente3);
        menuItemCliente3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
                
            }});
        menuCliente.add(menuItemCliente4);
        menuItemCliente4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
                
            }});

        menuCliente.add(menuItemCliente5);
        menuItemCliente5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
                
            }});

        menuBar.add(menuCliente);


        menuVenda.setFont(f);
        menuVenda.add(menuItemVenda1);
        menuItemVenda1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
            }

        });
        menuVenda.add(menuItemVenda2);
        menuItemVenda2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
            }

        });
        menuVenda.add(menuItemVenda3);
        menuItemVenda3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
            }

        });
        menuVenda.add(menuItemVenda4);
        menuItemVenda4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
            }

        });
        menuVenda.add(menuItemVenda5);
        menuItemVenda5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                
            }

        });
        menuBar.add(menuVenda);

        menuSair.setFont(f);
        menuSair.add(menuItemSair);
        menuItemSair.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Adicionar chamada para tela
                dispose();
                Runtime.getRuntime().exit(0);
            }});
        
        menuBar.add(menuSair);
        menuBar.setAlignmentX(FlowLayout.CENTER);
        frameMenu.setJMenuBar(menuBar);
    }

}
