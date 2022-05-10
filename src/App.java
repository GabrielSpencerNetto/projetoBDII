import javax.swing.JFrame;

import Telas.TelaMenu;
import Telas.Venda.CadastroVenda;

public class App extends JFrame{
    public static void main(String[] args) throws Exception {
       
        /*TelaMenu telaMenu = new TelaMenu();
        telaMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        telaMenu.setResizable(false);*/

        CadastroVenda telaMenu = new CadastroVenda();
        telaMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        telaMenu.setResizable(false);

    }
}
