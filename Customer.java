import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.JInternalFrame ;
import java.text.*;
public class Customer  extends JFrame 
{
     private JPanel jpqua=new JPanel();
     JButton b1,b2,b3,chbtn;
     javax.swing.Timer time;
     int interval=100;
     JComboBox cc;
     JLabel   l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,i,d,t,z;
     JTextField ln,t1,t2,t3,t4,t5,ln1;
     Connection con;
     ResultSet rs;
     PreparedStatement ps;
     Statement stmt;	
     Connection con1;
     Statement stmt1;
     ResultSet rs1=null;
    Customer()
    {
            //super("New Customer",true,true,true,true);
	//Customer("New Customer",true,true,true,true);
            this.setVisible(true);            
            this.setLayout(null);
           d=new JLabel("");
         
          t=new JLabel("Time :");
          t.setFont(new Font("Times New Roman",Font.BOLD,36));
          t.setForeground(Color.pink);
         add(t);
         t.setBounds(950,30,200,200);
         add(d);
         d.setBounds(1080,30,200,200);
       
        Font fl=new Font("Arial",Font.BOLD | Font.ITALIC,25);
        l9=new JLabel("CBK WATER PURIFY CO. PVT. LTD.");
        l9.setFont(new Font("Times New Roman",Font.BOLD,50));
        l9.setBounds(200,30,900,40);
        add(l9);
        l9.setForeground(Color.green);
                       // l0=new JLabel(new ImageIcon("God/g.jpg"));
                      l0=new JLabel("NEW CUSTOMER");
                       l0.setForeground(Color.red);
             	    l0.setFont(new Font("Times New Roman",Font.BOLD,35));
              	    l0.setBounds(350,100,700,55);
            	    add(l0); 
        ln=new  JTextField(10);
        ln.setForeground(Color.blue);
        ln.setBounds(05,150,1500,5);
        add(ln);
                  ln1=new  JTextField(10);
                	ln1.setBounds(05,530,1500,5);
          	add(ln1);
          	
        l1=new JLabel ("CUSTOMER CODE");
        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
        l1.setBounds(300,190,180,50);
        add(l1);					           
                    t1=new  JTextField(10);
                 	 t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t1.setBounds(490,200,75,30);
                   add(t1);
		    	        
       l2=new JLabel ("CUSTOMER NAME");    
       l2.setFont(new Font("Times New Roman",Font.BOLD,20));     
       add(l2);
       l2.setBounds(300,240,180,60);
                    t2=new  JTextField(10);
  	  t2.setFont(new Font("Times New Roman",Font.PLAIN,20));
                    add(t2);
                    t2.setBounds(490,250,250,30);  
				
        l3=new JLabel ("ADDRESS");
        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(l3);
        l3.setBounds(300,290,180,60);
	t3=new  JTextField(10);
	t3.setFont(new Font("Times New Roman",Font.PLAIN,20));
	add(t3);
	t3.setBounds(490,300,250,60);
      l4=new JLabel("TYPE");
      l4.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(l4);
     l4.setBounds(300,365,180,60);
  	cc=new JComboBox();
    	cc.setFont(new Font("Arial",Font.PLAIN,20));
	cc.addItem("SELECT");
	 cc.addItem("Agent");
               	 cc.addItem("Wholesaler");
               	 cc.addItem("Retailer");
	add(cc);
	cc.setBounds(490,375,200,30);
		   	                    
 	l10=new JLabel ("Phon Number");
	l10.setFont(new Font("Times New Roman",Font.BOLD,20));
	add(l10);
	l10.setBounds(300,415,180,60);
	t4=new  JTextField(10);
	t4.setFont(new Font("Times New Roman",Font.PLAIN,20));
 	t4.setBounds(490,425,250,30);
	add(t4);			            		  				

	l5=new JLabel ("Email Id");
	l5.setFont(new Font("Times New Roman",Font.BOLD,20));
                  add(l5);
           	l5.setBounds(300,465,180,60);
	t5=new  JTextField(10);
	t5.setFont(new Font("Times New Roman",Font.PLAIN,20));
	add(t5);
           	t5.setBounds(490,475,250,30);
           				
 	b1=new JButton("ADD");
	b2=new JButton("SAVE");
	chbtn=new JButton("Exit");
	b3=new JButton("Cancel");

             	 add(b1);
             	 add(b2);
             	 add(b3);
  
             	 b1.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	b1.setBounds(200,540,135,35);
             	b2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	b2.setBounds(400,540,135,35);
             	b3.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	 b3.setBounds(600,540,135,35);
             	chbtn.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
                   chbtn.setBounds(800,540,130,35);
                   add(chbtn);
                          
                 b1.setToolTipText("Add new record");
                 b2.setToolTipText("Save record");
                 b3.setToolTipText("Back to Main Form");
 	chbtn.setToolTipText("Search recoed");  
                 

             
             		  
	
           	z=new JLabel(new ImageIcon("img/g.jpg"));
add(z);
z.setBounds(-100,-150,1500,1500);
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	this.setSize((int)screenSize.getWidth(),(int)screenSize.getHeight());
	this.show();	         		    
}


public void EnabledF()
{
 t1.setEnabled(false);
 t2.setEnabled(false);
t3.setEnabled(false);
t4.setEnabled(false);
t5.setEnabled(false);
cc.setEnabled(false);
b2.setEnabled(false);
}


	

	public static void main(String args[])
	{
		 Customer c=new Customer();
	}
}
