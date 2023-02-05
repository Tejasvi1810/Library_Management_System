import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

public class admin extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b4;
	Connection con;
	Statement stmt;
	
	
	admin()
	{
		setSize(600,600);
		setTitle("Admin Section ");
		setLayout(null);
		
		b1 = new JButton("Add Librarian");
		b2 = new JButton("View Librarian");
		b3 = new JButton("Delete Librarian");
		b4 = new JButton("Logout");
		
		l1 = new JLabel("Admin Section ");
		
		
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		
		// buttons and labels kai bounds set kar rahe hai...
		
		l1.setBounds(170,50,200,100);
		l1.setFont(new Font("Serif",Font.BOLD,25));
		b1.setBounds(150,150,200,50);
		b2.setBounds(150,250,200,50);
		b3.setBounds(150,350,200,50);
		b4.setBounds(150,450,200,50);
		
			
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);
		
		
		
	}
	public static void main(String str[])
	{
		new admin();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			this.dispose();
			new add_librarian();
		}
		 if(e.getSource()==b3)
		{
			this.dispose();
			new delete_librarian();
		}
		 if(e.getSource()==b4)
		{
			this.dispose();
			new Users();
		} 
		
		if(e.getSource()==b2)
		{
			this.dispose();
			new view_librarian();
		}
			
	}
			
}
		
		