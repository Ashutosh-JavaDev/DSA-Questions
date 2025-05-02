
// package Hashset.UniqueWordAnalyzer;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame implements ActionListener {
    JTextField field;
    JButton button;
     public main(){
        JLabel l1=new JLabel("Enter the Paragraph:");
        l1.setBounds(200,100,250,30);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        add(l1);
        field.setBounds(150,150,250,250);
        field.setFont(new Font("Arial",Font.PLAIN,10));
        add(field);
        // All Important Configuration
        setLocation(550, 100);
        setTitle("UNIQUE WORD ANALYZER");
        setLayout(null);
        setSize(600,650);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
     public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    public static void main(String[] args) {
        main ob=new main();
    }
}
