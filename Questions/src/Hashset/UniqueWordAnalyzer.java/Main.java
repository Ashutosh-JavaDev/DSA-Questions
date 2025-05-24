
// package Hashset.UniqueWordAnalyzer;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JTextArea field;
    JButton button;
     public Main(){
        JLabel l1=new JLabel("Enter the Paragraph:");
        l1.setBounds(200,100,250,30);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        add(l1);
        // Text Area
        field=new JTextArea();
        field.setBounds(130,150,350,250);
        field.setFont(new Font("Arial",Font.PLAIN,15));
        field.setLineWrap(true); // Enable word wrapping
        field.setWrapStyleWord(true); 
        add(field);
        // Button
        button=new JButton("Sumbit");
        button.setBounds(100, 550, 400, 50);
        button.setForeground(Color.white);
        button.setBackground(Color.red);
        button.setFont(new Font("Arial",Font.PLAIN,15));
        add(button);
        button.addActionListener(this);
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
        if(ae.getSource()==button){
            HashSet <String>  set=new HashSet<>();
            HashSet <String> duplicate=new HashSet<>();
            String str=field.getText();
            set.add(str);
                
        }
        setVisible(false);
    }
    public static void main(String[] args) {
        new Main();
    }
}
