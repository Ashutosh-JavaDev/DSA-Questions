
// package Hashset.UniqueWordAnalyzer;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame implements ActionListener {
    JTextField field;
    JButton button;
     public main(){
        setLocation(450, 100);
        setTitle("UNIQUE WORD ANALYZER");
        setLayout(null);
        setSize(800, 850);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
     public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
}
