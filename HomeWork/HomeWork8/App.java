package HomeWork.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    int count = 0;

    public App(){
        setBounds(300, 300, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter");
        setResizable(false);

        JLabel counter = new JLabel("0");
        JButton leftjButton = new JButton("<");
        JButton rightjButton = new JButton(">");

        Font font = new Font("ISOCPEUR", Font.BOLD, 32);

        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);

        leftjButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));
            }
        });

        rightjButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        add(leftjButton, BorderLayout.WEST);
        add(rightjButton, BorderLayout.EAST);
        add(counter, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
