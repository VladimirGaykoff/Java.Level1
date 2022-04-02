package HomeWork.HomeWork8;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {


    public Main (){
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setResizable(false);
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
    new Main();
    }
}
