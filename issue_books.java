import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;



class issue_books extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1,tf2,tf3,tf4;
	JButton b1,b2,b3;
			Connection con;
		Statement stmt;
		

	issue_books()
	{
		setSize(600,500);
		setTitle("Issue Books ");
		setLayout(null);
		
		l1 = new JLabel("Issue Book ");
		l2 = new JLabel("Book No: ");
		l3 = new JLabel("Student ID: ");
		l4 = new JLabel("Student Name: ");
		l5 = new JLabel("Student Contact: ");
		l6 = new JLabel("Note: Please check student id carefully before issuing the books!");
		
		tf1 = new JTextField(30);
		tf2 = new JTextField(30);
		tf3 = new JTextField(30);
		tf4 = new JTextField(30);
		
			b1 = new JButton("Issue Book");
			b2 = new JButton("Back ");
			b3 = new JButton("Clear");
			add(l1);add(l2); add(tf1);add(l3);add(tf2);add(l4);add(tf3);
		add(l5);add(tf4);add(b1);add(b2);add(b3);add(l6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		l1.setBounds(190,10,300,100);
		l1.setFont(new Font("Serif",Font.BOLD,25));
		
		l2.setBounds(100,100,100,50);
		l2.setFont(new Font("Serif",Font.BOLD,15));
		tf1.setBounds(300,115,120,20);
		
		l3.setBounds(100,150,150,50);
		l3.setFont(new Font("Serif",Font.BOLD,15));
		tf2.setBounds(300,170,120,20); 	
		
		l4.setBounds(100,200,150,50);
		l4.setFont(new Font("Serif",Font.BOLD,15));
		tf3.setBounds(300,220,120,20);
		
		l5.setBounds(100,250,150,50);
		l5.setFont(new Font("Serif",Font.BOLD,15));
		tf4.setBounds(300,270,120,20); 	
		
		
		b1.setBounds(70,350,130,50);
		b2.setBounds(220,350,130,50);
		b3.setBounds(370,350,130,50);
		l6.setBounds(100,400,300,50);
		l6.setFont(new Font("Serif",Font.BOLD,10));
		
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
		new issue_books();
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		if(e.getSource()==b2)
		{
			this.dispose();
			new librarian();
		}
		if(e.getSource()==b1)
		{
			String s1 = "insert into issue_book values("+tf1.getText()+","+tf2.getText()+",'"+tf3.getText()+"','"+tf4.getText()+"')";
			stmt.executeUpdate(s1);
			JOptionPane.showMessageDialog(this,"Record saved succesfully !");
			b1.setEnabled(false);
		}
		
		if(e.getSource()==b3)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			
			tf1.requestFocus();
			b1.setEnabled(true);
		}
		
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

			
}
	
