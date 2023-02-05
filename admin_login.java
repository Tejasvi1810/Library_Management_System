import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class admin_login extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton b1,b2;
	JTextField tf1,p1;
	admin_login()
	{
		setSize(600,500);
		setTitle("Admin Login ");
		setLayout(null);
		
		l1 = new JLabel("Admin Login Form ");
		l2 = new JLabel("Enter Name: ");
		l3 = new JLabel("Enter Password: ");
		
		b1 = new JButton("Login ");
		b2 = new JButton("Clear");
		tf1 = new JTextField(30);
		p1 = new JPasswordField(30);
		
		add(l1);
		add(tf1);
		add(l2);
		add(p1);
		add(l3);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		
		l1.setBounds(170,10,300,100);
		l1.setFont(new Font("Serif",Font.BOLD,25));
		l2.setBounds(100,100,100,50);
		l2.setFont(new Font("Serif",Font.BOLD,15));
		tf1.setBounds(300,115,120,20);
		l3.setBounds(100,150,150,50);
		l3.setFont(new Font("Serif",Font.BOLD,15));
		p1.setBounds(300,170,120,20);

		b1.setBounds(200,300,100,50);
		b2.setBounds(350,300,100,50);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);

	
		
	}
	public static void main(String str[])
	{
		new admin_login();
	}
	public void actionPerformed(ActionEvent e)
	{
		String a = tf1.getText();
		String b = p1.getText();
		
		if(e.getSource()==b1)
		{
			if(a.equals("tejas") && b.equals("12345"))
			{
				this.dispose();
				new admin();
			}
			else
			{
				JOptionPane.showMessageDialog(this,"You entered wrongs credentials ! ");
			}
		}
		if(e.getSource()==b2)
		{
			tf1.setText("");
			p1.setText("");
			tf1.requestFocus();
		}
	}
		
	
}
		
		
	