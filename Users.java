import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


//java -cp "mysql-connector-java-5.1.9.jar;" add_librarian

public class Users extends JFrame implements ActionListener 
{
	JButton b1,b2;
	JLabel l1;
	 Users()
	 {
		 setSize(600,600);
		 setTitle("Users");
		 setLayout(null);
		 
		 b1 = new JButton("Admin Login ");
		 b2 = new JButton("Librarian Login ");
		 
		 l1 = new JLabel("Library Management System - TEJASVI ");
		 
		 add(l1);
		 add(b1);
		 add(b2);
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 
		 l1.setBounds(80,50,400,60);
		l1.setFont(new Font("Serif", Font.BOLD, 20));
		 b1.setBounds(150,150,200,50);

		 b2.setBounds(150,250,200,50);
		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);
	 }
	 public static void main(String str[])
	 {
		 new Users();
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 try
		 {
		 if(e.getSource()==b1)
		 {
			 this.dispose();
			 new admin_login();
		 }
		 if(e.getSource()==b2)
		 {
			 this.dispose();
			 new librarian_login();
		 }
		 }
		 catch(Exception a)
		 {
			 System.out.println("error");
		 }
	 }
}