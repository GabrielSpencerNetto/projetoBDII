package Util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel{
    
    public Label(String texto, int x, int y, int width, int height){
        setBackground(new Color(229,235,234));
        setFont(new Font("SansSerif", Font.BOLD, 18));
        setText(texto);
        setBounds(x, y, width, height);
    }

}
