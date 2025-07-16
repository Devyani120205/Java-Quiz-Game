package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Game");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Algerian", Font.BOLD+Font.ITALIC, 28));
        heading.setForeground(Color.magenta);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Times new roman", Font.BOLD+Font.ITALIC, 19));
        rules.setForeground(Color.black);
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. It is necessary to answers all questions" + "<br><br>" +
                "3.Don't Skip the questions" + "<br><br>" +
                "4. Be confident." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous" + "<br><br>" +
                "7. Try to answer the questions in given time line" + "<br><br>" +
                "8.  Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.magenta);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.magenta);
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
