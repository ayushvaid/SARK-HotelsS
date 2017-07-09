package Customer;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class viewbooking
{
JFrame j1;
Icon i;
JLabel logo,h;
Connection c;
PreparedStatement p;
ResultSet rs;
Date CheckinDate,CheckoutDate;

        viewbooking()
        {
	     j1 = new JFrame();
	     j1.setLayout(null);
	     j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     j1.setTitle("Customer Login");
	     //j1.setExtendedState(JFrame.MAXIMIZED_BOTH);
	     j1.setSize(1366, 768);
	     j1.setResizable(true);
	     j1.getContentPane().setBackground(Color.decode("#1A242A"));
	
	
       	i = new ImageIcon("log1.png");
	   logo=new JLabel(i);
	   logo.setBounds(960,10,460,156);
	    j1.add(logo);
	
	    h = new JLabel("BOOKED HISTORY");
	    Font f= new Font("Times New Roman",Font.BOLD,40);
	    h.setBackground(Color.white);
	    h.setFont(f);
        h.setForeground(Color.blue);
	    h.setBounds(500,50,500,30);
	    j1.add(h);
	    
j1.setVisible(true);
}
}





