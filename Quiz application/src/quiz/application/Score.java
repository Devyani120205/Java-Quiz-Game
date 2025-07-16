package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
  JButton submit,quit;
    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score1.jpg"));
       Image i2 = i1.getImage().getScaledInstance(370, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 120, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing quiz game");
        heading.setBounds(35, 30, 700, 30);
        heading.setFont(new Font("Algerian", Font.BOLD+Font.ITALIC, 30));
        heading.setForeground(Color.MAGENTA);
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(370, 150, 300, 30);
        lblscore.setFont(new Font("Times new roman", Font.ITALIC, 30));
        add(lblscore);
        
         submit = new JButton("Play Again");
        submit.setBounds(400, 240, 120, 30);
        submit.setFont(new Font("Times new roman", Font.PLAIN, 18));
        submit.setBackground(Color.magenta);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        quit=new JButton("Quit");
        quit.setBounds(400,300,120,30);
        quit.setFont(new Font("Times new roman", Font.PLAIN, 18));
        quit.setBackground(Color.magenta);
        quit.setForeground(Color.white);
        quit.addActionListener(this);
        add(quit);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ev) {
    	if(ev.getSource()==submit)
    	{
        setVisible(false);
        new Login();}
    	else 
    	{
    		setVisible(false);
    	}
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
