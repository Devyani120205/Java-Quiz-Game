package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
	JTextField tfname;
	JButton Rules,Back;
	Login()
	{
		 getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
	        JLabel image = new JLabel(i1);
	        image.setBounds(0, 0, 600, 500);
	        add(image);
	       
	        JLabel heading = new JLabel("Welcome");
	        heading.setBounds(730, 80, 300, 45);
	        heading.setFont(new Font("Algerian", Font.BOLD+Font.ITALIC, 60));
	        heading.setForeground(Color.magenta);
	        add(heading);
	        
	        JLabel name = new JLabel("Enter your name");
	        name.setBounds(810, 150, 300, 20);
	        name.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
	        name.setForeground(new Color(30, 144, 254));
	        add(name);
	        
	        tfname = new JTextField();
	        tfname.setBounds(735, 200, 300, 25);
	        tfname.setFont(new Font("Times New Roman", Font.BOLD+Font.CENTER_BASELINE, 20));
	        tfname.setForeground(Color.BLUE);
	      
	        add(tfname);
	        
	        Rules = new JButton("Rules");
	        Rules.setBounds(735, 270, 120, 25);
	        Rules.setBackground(Color.magenta);
	        Rules.setForeground(Color.WHITE);
	        Rules.addActionListener(this);
	        add(Rules);
	        
	        Back = new JButton("Back");
	        Back.setBounds(915, 270, 120, 25);
	        Back.setBackground(Color.magenta);
	        Back.setForeground(Color.WHITE);
	        Back.addActionListener(this);
	        add(Back);
	        
	       
	        
	  setSize(1200, 500);
      setLocation(200, 150);
      setVisible(true);
	}
	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource()==Rules)
		{
			 String name = tfname.getText();
	            setVisible(false);
	            new Rules(name);
	        } else if (ev.getSource() == Back) {
	            setVisible(false);
	        }
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Login l=new Login();
  }

}



