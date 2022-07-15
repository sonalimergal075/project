import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.JInternalFrame ;
 import javax.swing.table.*;
import java.text.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Payment  extends JFrame implements ActionListener,KeyListener,ItemListener
{        
    Connection con;
    ResultSet rs;     
   Statement stmt;


   String h[]={"Sr.No","Bill No","Date","Patient Id","Patient Name","Test Id","Test Name","Price","Qty","Total"};
String record[][]=new String[40][10];;

JScrollPane jpane;
  JTable t;
javax.swing.Timer time;
 int interval=100;
  JPanel p1=new JPanel();
  JPanel p2=new JPanel();
  JLabel l0;
   JTextField ln;
   JComboBox cc,cc1;
 JLabel   l1,l2,l3,l4,l5,l6,tt,d;
    JTextField t1,t2,t3,t5,t6;
JLabel   l7,l8,l9,l10,l11;
    JTextField t7,t8,t9,t10,t11,ln1;
JLabel   ltot,z1,z2,z3;
    JTextField tot;
JButton b1,b2,b3,chbtn;
JButton Add;
int cnt=1;
int z=0;
int Srno[]=new int[40];
String bn[]=new String[40];
String dt[]=new String[40];
String sid[]=new String[40];
String sname[]=new String[40];
String pid[]=new String[40];
String pnm[]=new String[40];
int pqnt[]=new int[40];
int pri[]=new int[40];
int tol[]=new int[40];
int total,i=0,cbk=0;
	 Payment()
	{

try {
	      
	      this.setVisible(true);            
	      this.setLayout(null);
d=new JLabel("");
           time=new javax.swing.Timer(interval,new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
                    java.util.Date date=new java.util.Date();
                   SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss");
                   String da = sd.format(date);
                   d.setText(da);
                   d.setForeground(Color.green);
                   d.setFont(new Font("Copper",Font.BOLD,36));     
          }
                                                                                                          });time.start();

          tt=new JLabel("Time :");
          tt.setFont(new Font("Times New Roman",Font.BOLD,36));
         tt.setForeground(Color.pink);
         add(tt);
         tt.setBounds(950,-50,200,200);
        add(d);
        d.setBounds(1080,-50,200,200);

 t1=new  JTextField(10);
                	t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
               Font fl=new Font("Arial",Font.BOLD | Font.ITALIC,25);
                      ltot=new JLabel ("Total Amount");
			              ltot.setFont(new Font("Times New Roman",Font.BOLD,20));
	ltot.setBounds(520,480,180,50);
          		    	add(ltot);					           
                  tot=new  JTextField(10);
                	tot.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   tot.setBounds(650,495,140,30);
                    add(tot);  
                      l0=new JLabel("Payment DETAILS");
                      l0.setForeground(Color.red);
             	    l0.setFont(new Font("Times New Roman",Font.BOLD,35));
              	    l0.setBounds(420,30,700,35);
            	    add(l0); 
   	ln=new  JTextField(10);
                  ln.setForeground(Color.blue);
                 ln.setBounds(05,70,1500,5);
	 add(ln);   
 ln1=new  JTextField(10);
                	ln1.setBounds(05,530,1500,5);
          	add(ln1);
 p1.setLayout(null);
	 l1=new JLabel ("Bill NO");
			              l1.setFont(new Font("Times New Roman",Font.BOLD,20));
	l1.setBounds(20,20,180,50);
          		    	p1.add(l1);					           
                  t1=new  JTextField(10);
                	t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t1.setBounds(100,40,65,30);
                   p1. add(t1); 
 l3=new JLabel ("Patient Id");
			              l3.setFont(new Font("Times New Roman",Font.BOLD,20));
	l3.setBounds(5,60,180,50);
          		    	p1.add(l3);
					           
                  t3=new  JTextField(10);
                	t3.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t3.setBounds(113,80,65,30);
                   p1. add(t3);
 l5=new JLabel ("Address");
			              l5.setFont(new Font("Times New Roman",Font.BOLD,20));
	l5.setBounds(5,100,180,50);
          		    	p1.add(l5);					           
                  t5=new  JTextField(10);
                	t5.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t5.setBounds(80,120,140,60);
                   p1. add(t5);
// half panel
 l2=new JLabel ("Date");
			              l2.setFont(new Font("Times New Roman",Font.BOLD,20));
	l2.setBounds(250,20,180,50);
          		    	p1.add(l2);					           
                  t2=new  JTextField(10);
                	t2.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t2.setBounds(330,40,120,30);
 l4=new JLabel ("Patient Name");
			              l4.setFont(new Font("Times New Roman",Font.BOLD,20));
	l4.setBounds(200,60,145,50);
          		    	p1.add(l4);	
  p1. add(t2); 
cc=new JComboBox();
 cc.setFont(new Font("Arial",Font.PLAIN,20));				              
add(cc);
cc.setBounds(343,80,140,30);
p1.add(cc);
l6=new JLabel ("Phone No");
			              l6.setFont(new Font("Times New Roman",Font.BOLD,20));
	l6.setBounds(230,100,180,50);
          		    	p1.add(l6);					           
                  t6=new  JTextField(10);
                	t6.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t6.setBounds(330,120,140,30);
                      p1.add(t6);              	
                 
	     p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.BLACK),"Personal Information"));
   	   add(p1);
 p1.setBounds(150,100,500,200);
 p2.setLayout(null);
	 l7=new JLabel ("Test Id");
			              l7.setFont(new Font("Times New Roman",Font.BOLD,20));
	l7.setBounds(50,20,180,50);
          		    	p2.add(l7);					           
                  t7=new  JTextField(10);
                	t7.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t7.setBounds(142,40,65,30);
                   p2. add(t7); 
 l9=new JLabel ("Select Test Name");
			              l9.setFont(new Font("Times New Roman",Font.BOLD,20));
	l9.setBounds(50,60,180,50);
          		    	p2.add(l9);	
cc1=new JComboBox();
 cc1.setFont(new Font("Arial",Font.PLAIN,20));				              
add(cc1);
cc1.setBounds(230,80,140,30);
p2.add(cc1);				           
 l10=new JLabel("Quantity");
		          l10.setFont(new Font("Times New Roman",Font.BOLD,20));
	l10.setBounds(10,100,180,50);
          		    	p2.add(l10);					           
                  t10=new  JTextField(10);
                	t10.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t10.setBounds(90,120,100,30);
                   p2. add(t10);
// half panel

 l8=new JLabel ("Stock");
			              l8.setFont(new Font("Times New Roman",Font.BOLD,20));
	l8.setBounds(250,20,180,50);
          		    	p2.add(l8);					           
                  t8=new  JTextField(10);
                	t8.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t8.setBounds(330,40,120,30);
p2.add(t8);	
l11=new JLabel (" Price");
	l11.setFont(new Font("Times New Roman",Font.BOLD,20));
	l11.setBounds(200,100,180,50);
          		    	p2.add(l11);					           
                  t11=new  JTextField(10);
                	t11.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t11.setBounds(330,120,140,30);
                       p2.add(t11);   
 Add=new JButton("ADD");
 p2.add(Add);
             			  Add.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             			  Add.setBounds(190,150,135,35);
Add.setToolTipText("Add record in table");

	     p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.BLACK),"Test Information"));
   	   add(p2);
 p2.setBounds(750,100,500,200);	

DateFormat d=new SimpleDateFormat ("dd/MM/yyyy");
	java.util.Date date=new java.util.Date();
t2.setText(d.format(date));
 b1=new JButton("ADD NEW");
			              b2=new JButton("SAVE");
			              chbtn=new JButton("CANCEL");
				          b3=new JButton("ALL");
             			  add(b1);
             			  add(b2);
             			  add(b3);
             			  b1.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             			  b1.setBounds(200,545,155,35);
             			  b2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             			  b2.setBounds(450,545,135,35);
             			  b3.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             			  b3.setBounds(700,545,135,35);
             			  chbtn.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
                                                           chbtn.setBounds(950,545,135,35);
                                                            add(chbtn);
                          
                           b1.setToolTipText("Add new record");
 			            	b2.setToolTipText("Save record");
                          b3.setToolTipText("Display All Record");
 				          chbtn.setToolTipText("Back to Main Form");  

                       try
                           {   
		Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			
			
			
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	           
   		rs=stmt.executeQuery("SELECT * FROM Patient");
   		while(rs.next())
   		{
   			cc.addItem(rs.getString(2));
	    	
        	
    	                    }
                         con.close();
   	  }
                    catch(Exception e)
   	  {
   	 	JOptionPane.showMessageDialog(null,"Error="+e);
   	  } 
try
                           { 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			//System.out.println("connected");
			
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	           
   		rs=stmt.executeQuery("SELECT * FROM Test");
   		while(rs.next())
   		{
   			cc1.addItem(rs.getString(2));
	    	
        	
    	                    }
                         con.close();
   	  }
                    catch(Exception e)
   	  {
   	 	JOptionPane.showMessageDialog(null,"Error="+e);
   	  } 
t10.addKeyListener(this); 
t11.addKeyListener(this); 
cc.addItemListener(this);
cc1.addItemListener(this);
b1.addActionListener(this);
             	b2.addActionListener(this);
             	b3.addActionListener(this);
Add.addActionListener(this);
chbtn.addActionListener(this);
String record1[][]=new String[cnt][10];
t=new JTable(record1,h); t.setBackground(Color.white);
TableColumn colm; int j;
		for (j = 0; j < t.getColumnCount(); j++) 
		{
			colm= t.getColumnModel().getColumn(j);
			colm.setMaxWidth(150);
		}

jpane=new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			jpane.setBackground(Color.white);
jpane.setBounds(200,330,1000,150);
add(jpane);
z1=new JLabel(new ImageIcon("img/bcg.jpg"));
 
z1.setBounds(-50,-300,1500,1500);
add(z1);
z2=new JLabel(new ImageIcon("img/bcg.jpg"));
 
z2.setBounds(-50,-300,1500,1500);
p1.add(z2);	 
z3=new JLabel(new ImageIcon("img/bcg.jpg"));
 z3.setBounds(-50,-300,1500,1500);    
p2.add(z3);	  
	         		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				this.setSize((int)screenSize.getWidth(),(int)screenSize.getHeight());
this.show();
}				
 catch(Exception e)
{ }
	         		    
}
public void keyTyped(KeyEvent e) 
 {
 if(e.getSource()==t10)
     {
	      char c = e.getKeyChar();
      	if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_DELETE))) 
      	{
        		getToolkit().beep();
        		e.consume();
      	}
     }
if(e.getSource()==t11)
     {
	      char c = e.getKeyChar();
      	if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_DELETE))) 
      	{
        		getToolkit().beep();
        		e.consume();
      	}
     }
    }
public void keyReleased(KeyEvent e) 
 {
 }
public void keyPressed(KeyEvent e) 
 {
 }
public void actionPerformed(ActionEvent ae) 
   {
if(ae.getSource()==chbtn) 
{ 
this.setVisible(false);
}
if(ae.getSource()==b3) 
{   
          try{ String h1[]={"SB Id","DATE","Patient No","Test No","Quntity","Price","Amount"};
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			//stmt=con.createStatement();
			Statement st=con.createStatement();
			
			Statement st2=con.createStatement();
			ResultSet rs;
			
			String str="select * from Payment";
			rs=st.executeQuery(str);
			while(rs.next())
			{
				cnt++;
			}
			rs.close(); 
			String record1[][]=new String[cnt][7];
                                                          Statement st1=con.createStatement();
			String s="select * from Payment";
			rs=st1.executeQuery(s);
			int i=0;
			
			while(rs.next())
			{
				record1[i][0]=rs.getString(1);
				record1[i][1]=rs.getString(2);
				record1[i][2]=rs.getString(3);
                                                                        record1[i][3]=rs.getString(4);
				record1[i][4]=rs.getString(5);
				record1[i][5]=rs.getString(6);
				record1[i][6]=rs.getString(7);
				i++;
			} 
t=new JTable(record1,h1); t.setBackground(Color.white);
TableColumn colm; 
		for (i = 0; i < t.getColumnCount(); i++) 
		{
			colm= t.getColumnModel().getColumn(i);
			colm.setMaxWidth(150);
		}


jpane=new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			jpane.setBackground(Color.white);
jpane.setBounds(200,330,1000,150);
add(jpane);
}
			catch(Exception e){ System.out.println("Main"+e); }
			

                                     
}
if(ae.getSource()==b2) 
{
        try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			//System.out.println("connected");
			//stmt=con.createStatement();
			String s,s1;
                                                       int r,r1;
                                                int b=0,c=0;
			for(i=0;i<cbk;i++)
                                                      {                stmt=con.createStatement();
				 s="insert into Payment values('" + bn[i]  + "','" + dt[i] + "','" + sid[i] + "','" + pid[i] + "'," + pqnt[i] + "," + pri[i]  + "," + tol[i] + ")";
                                                      	 r=stmt.executeUpdate(s);
stmt=con.createStatement();
rs=stmt.executeQuery("SELECT * FROM Test WHERE t_id='" + pid[i] + "' ");
while(rs.next())
{
b=Integer.parseInt(rs.getString(4));
}
   c= b - pqnt[i];		
                                                                          stmt=con.createStatement();
                                                                           s1="Update Test set Qnt="+ c +" where t_id='" + pid[i] + "' ";
			 
                                                                              r1=stmt.executeUpdate(s1);

                                                       }
			 JOptionPane.showMessageDialog(null,"1.Record Inserted Sucessfully");
			con.close();
                                            
			}
		
			catch(SQLException se){
			JOptionPane.showMessageDialog(null,"1.Record Inserted Sucessfully");
					}
			catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			
		} 	
}

if(ae.getSource()==Add) 
	{
int a=Integer.parseInt(t10.getText());
int b=Integer.parseInt(t8.getText());
if(a>b)
{
JOptionPane.showMessageDialog(null,"Stock is not available");
}
else
{
try {		
Srno[i]=i;
bn[i]=t1.getText();
dt[i]=t2.getText();
sid[i]=t3.getText();
sname[i]=(String) cc.getSelectedItem();
pid[i]=t7.getText();
pnm[i]=(String) cc1.getSelectedItem();
 pqnt[i]=Integer.parseInt(t10.getText());
pri[i]=Integer.parseInt(t11.getText());
 tol[i]=pqnt[i]*pri[i];
total=total+tol[i];
record[i][0]=Integer.toString(i+1);
record[i][1]=bn[i];
record[i][2]=dt[i];
record[i][3]=sid[i];
record[i][4]=sname[i];
record[i][5]=pid[i];
record[i][6]=pnm[i];
record[i][7]=Integer.toString(pri[i]);
record[i][8]=Integer.toString(pqnt[i]);
record[i][9]=Integer.toString(tol[i]);
tot.setText(Integer.toString(total));
i=i+1;	
cbk=cbk+1;
}catch(Exception e) {JOptionPane.showMessageDialog(null,e);}

 t=new JTable(record,h); t.setBackground(Color.white);

TableColumn colm; int j;
		for (j = 0; j < t.getColumnCount(); j++) 
		{
			colm= t.getColumnModel().getColumn(j);
			colm.setMaxWidth(150);
		}
jpane=new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			jpane.setBackground(Color.white);
jpane.setBounds(200,330,1000,150);
add(jpane);
}
                   }

if(ae.getSource()==b1) 
	{
String record1[][]=new String[cnt][10];
t=new JTable(record1,h); t.setBackground(Color.white);
TableColumn colm; int j;
		for (j = 0; j < t.getColumnCount(); j++) 
		{
			colm= t.getColumnModel().getColumn(j);
			colm.setMaxWidth(150);
		}

jpane=new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			jpane.setBackground(Color.white);
jpane.setBounds(200,330,1000,150);
add(jpane);
	 	 try
		{ i=0;
                                       cbk=0;
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			stmt=con.createStatement();
                     		String s="Select * from Payment";
                                  	                  int aa,t=1,tt=0;
                			 String ss3,ss1;
                     		int lt;
                                                        rs=stmt.executeQuery(s);
                                                         while(rs.next())
                                                         { 
				 
				 ss3=rs.getString("pay_id");
				
				aa=Integer.parseInt(ss3);
				
				
  					tt=aa+1;
					ss3=Integer.toString(tt);
					t1.setText("" + ss3);

				
                              		}
 			con.close();
                                    }
	                  catch(SQLException se){ 
                                     JOptionPane.showMessageDialog(null,se);
		}			
		catch(Exception e) {
		JOptionPane.showMessageDialog(null," Some Field Missing " );	
		} 
        	

	}
   }
public void itemStateChanged(ItemEvent es) 
{
       if(es.getSource()==cc)
	{
                         try
                           {        Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			//stmt=con.createStatement();
	                 
   		stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
   		rs=stmt.executeQuery("SELECT * FROM Patient WHERE p_name='"+ (String) cc.getSelectedItem()+"' ");
   		while(rs.next())
   		{
   			
	    		t3.setText(rs.getString(1));
    	    		t5.setText(rs.getString(3));
                                                      t6.setText(rs.getString(4));
    	                }
                          // con.close();
   	  }
   catch(SQLException se){
		JOptionPane.showMessageDialog(null,se);
		        }
		catch(Exception e){
		JOptionPane.showMessageDialog(null,e);	
		} 	
                   }

            if(es.getSource()==cc1)
	{
                         try
                           {        Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			
	                  
   		stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
   		rs=stmt.executeQuery("SELECT * FROM Test WHERE t_name='"+ (String) cc1.getSelectedItem()+"' ");
   		while(rs.next())
   		{
   			
	    		t7.setText(rs.getString(1));
    	    		t8.setText(rs.getString(4));
t11.setText(rs.getString(3));
                                                      
    	                }
               // con.close();
   	  }
   catch(SQLException se){
		JOptionPane.showMessageDialog(null,se);
		        }
		catch(Exception e){
		JOptionPane.showMessageDialog(null,e);	
		} 	
                   }
}

	public static void main(String args[])
	{
	 Payment  c=new Payment();
	}
}
