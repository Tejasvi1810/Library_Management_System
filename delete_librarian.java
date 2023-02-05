import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

public class delete_librarian extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton b1,b2;
	JTextField tf1;
	Connection con;
	Statement stmt;
	
	
	
	delete_librarian()
	{
		setSize(600,400);
		setTitle("Removing librarian  ");
		setLayout(null);
		
		l1 = new JLabel("Deletion of Librarian: ");
		l2 = new JLabel("Enter Id: ");
		tf1 = new JTextField(30);
		b1 = new JButton("Delete ");
		b2 = new JButton("Back ");
		
		add(l1);add(l2);add(tf1);add(b1);add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		b1.setBounds(150,450,130,50);
		b2.setBounds(320,450,130,50);
		
		
		l1.setBounds(170,10,300,100);
		l1.setFont(new Font("Serif",Font.BOLD,25));
		
		l2.setBounds(100,100,100,50);
		l2.setFont(new Font("Serif",Font.BOLD,15));
		tf1.setBounds(300,115,120,20);
		
		b1.setBounds(150,250,130,50);
		b2.setBounds(320,250,130,50);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/lib","root","");
			stmt=con.createStatement();
			System.out.println("Connected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);

	
		
	}
	public static void main(String str[])
	{
		new delete_librarian();
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		if(e.getSource()==b1)
		{
			String s1 = "delete from add_librarian where ID="+tf1.getText();
			stmt.executeUpdate(s1);
			JOptionPane.showMessageDialog(this,"Record Deleted uccesfully !");
			b1.setEnabled(false);
			
			
		
		}
		
			
		
		
		
		
		
		if(e.getSource()==b2)
		{
			this.dispose();
			new admin();
		}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
		
		
		
		