import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

public class view_books extends JFrame implements ActionListener
{
	Connection con;
	Statement stmt;
	JTable t;
	JButton b1;
	
	view_books()
	{
		setSize(1000,700);
		setTitle("Viewing books  ");
		setLayout(null);
		b1 = new JButton("Back");
		
		try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost/lib","root","");
				stmt=con.createStatement();
				System.out.println("Connected");
				
				String s1="select * from add_books";
				ResultSet rs = stmt.executeQuery(s1);
					int i=0,j=0;
			
				String str[]={"Book_no","Name","Author","Publisher","Quantity","Price"};
			Object obj[][]=new Object[10][6];
			
				while(rs.next())
				{
					obj[i][j++]=rs.getString("Book_no");
					obj[i][j++]=rs.getString("Name");
					obj[i][j++]=rs.getString("Author");
					obj[i][j++]=rs.getString("Publisher");
					obj[i][j++]=rs.getInt("Quantity");
					obj[i][j++]=rs.getString("Price");
					i++;
					j=0;
				}
				t = new JTable(obj,str);
				
					
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			JScrollPane js = new JScrollPane(t);
				add(js);
				add(b1);
				
				js.setBounds(20,50,700,500);
				b1.setBounds(320,550,130,50);
			
		
			b1.addActionListener(this);
			
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	public static void main(String str[])
	{
		new view_books();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==b1)
			{
				this.dispose();
				new librarian();
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
		
		