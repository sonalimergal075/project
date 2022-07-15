import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.net.URL;
public class Start extends JFrame implements ActionListener {
ImageIcon iii;
    JFrame frm;
    JLabel l,l1,l2,l3,img,lbl,z;
    JButton b;
ImageIcon ii;
    Start() {
URL url=this.getClass().getResource("flow1.gif");

		System.out.println(url);
		iii = new ImageIcon(url);
		lbl=new JLabel(iii);




       
    frm=new JFrame("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");
    frm.getContentPane().setLayout(null);
lbl.setBounds(200,320,200,200);
         frm.getContentPane().add(lbl);
    l1=new JLabel("SORAH HOSPITAL ,PUNE.");
    l1.setForeground(Color.red);
    l1.setFont(new Font("Times New Roman",Font.BOLD,40));
    l1.setBounds(250,20,800,80);
 l=new JLabel("WELCOME TO");
    l.setFont(new Font("Times New Roman",Font.BOLD,30));
    l.setForeground(Color.white);
    l.setBounds(350,400,800,80);
    l2=new JLabel("Hospital Management System");
    l2.setFont(new Font("Times New Roman",Font.BOLD,30));
    l2.setForeground(Color.white);
    l2.setBounds(250,430,800,80);
    l3=new JLabel("ALL COPYRIGHTS ARE RESERVED");
    l3.setFont(new Font("Times New Roman",Font.BOLD,25));
    l3.setForeground(Color.pink);
    l3.setBounds(310,510,800,80);
    b=new JButton("START");
    b.setToolTipText("Move to Login Form");
    b.setFont(new Font("Times New Roman",Font.BOLD,15));
    b.setBounds(470,580,100,50);
    ii=new ImageIcon("mataji.jpg");
	img=new JLabel(ii);img.setBounds(170,75,700,420);
    frm.getContentPane().add(l1);
frm.getContentPane().add(l);
    frm.getContentPane().add(l2);
    frm.getContentPane().add(l3);
    frm.getContentPane().add(b);
    frm.getContentPane().add(img);
    b.addActionListener(this);
z=new JLabel(new ImageIcon("img/bcg.jpg"));
frm.add(z);
z.setBounds(-200,-350,1500,1500);
    frm.getContentPane().setBackground(Color.cyan);
    frm.setSize(1014,734);
    frm.setVisible(true); 
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
     public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{Login ob=new Login();
		 frm.setVisible(false);}
	}

    public static void main(String args[]) throws Exception
 {
        Start a1=new Start();
    }
}