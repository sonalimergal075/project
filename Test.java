import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.JInternalFrame ;
import java.text.*;
public class Test  extends JFrame implements ActionListener,KeyListener
{
     private JPanel jpqua=new JPanel();
     JButton b1,b2,b3,chbtn;
     javax.swing.Timer time;
     int interval=100;
     Choice cc;
     JLabel   l0,l1,l2,l3,l4,l6,l7,l8,l9,l10,i,d,t,z;
     JTextField ln,t1,t2,t3,t4,ln1;
    
     Connection con;
     ResultSet rs;
     PreparedStatement ps;
     Statement stmt;	
     Connection con1;
     Statement stmt1;
     ResultSet rs1=null;
   
    Test()
    {
            //super("New Product",true,true,true,true);
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
                   d.setForeground(Color.yellow);
                   d.setFont(new Font("Copper",Font.BOLD,36));     
          }
                                                                                                          });time.start();

          t=new JLabel("Time :");
          t.setFont(new Font("Times New Roman",Font.BOLD,36));
         t.setForeground(Color.pink);
         add(t);
         t.setBounds(950,30,200,200);
        add(d);
        d.setBounds(1080,30,200,200);
       
        Font fl=new Font("Arial",Font.BOLD | Font.ITALIC,25);
        l9=new JLabel("SORAH HOSPITAL,PUNE.");
        l9.setFont(new Font("Times New Roman",Font.BOLD,50));
        l9.setBounds(200,30,900,40);
        add(l9);
        l9.setForeground(Color.blue);
                      l0=new JLabel("NEW TEST");
                      l0.setForeground(Color.red);
             	    l0.setFont(new Font("Times New Roman",Font.BOLD,35));
              	    l0.setBounds(420,100,700,35);
            	    add(l0); 
        ln=new  JTextField(10);
        ln.setForeground(Color.blue);
        ln.setBounds(05,150,1500,5);
        add(ln);
                  ln1=new  JTextField(10);
                	ln1.setBounds(05,500,1500,5);
          	add(ln1);
          	
        l1=new JLabel ("Test Id");
        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
        l1.setBounds(300,190,180,50);
        add(l1);					           
                    t1=new  JTextField(10);
                 	 t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
                   t1.setBounds(490,200,75,30);
                   add(t1);
		    	        
       l2=new JLabel ("Test Name");    
       l2.setFont(new Font("Times New Roman",Font.BOLD,20));     
       add(l2);
       l2.setBounds(300,265,180,60);
                    t2=new  JTextField(10);
  	  t2.setFont(new Font("Times New Roman",Font.PLAIN,20));
                    add(t2);
                    t2.setBounds(490,275,250,30);  
				
        l3=new JLabel ("Test Price");
        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(l3);
        l3.setBounds(300,340,180,60);
	t3=new  JTextField(10);
	t3.setFont(new Font("Times New Roman",Font.PLAIN,20));
	add(t3);
	
	t3.setBounds(490,350,250,30);
				
	
		   	                    
 	l10=new JLabel ("Quantity");
	l10.setFont(new Font("Times New Roman",Font.BOLD,20));
	add(l10);
	l10.setBounds(300,415,180,60);
	t4=new  JTextField(10);
	t4.setFont(new Font("Times New Roman",Font.PLAIN,20));
 	t4.setBounds(490,425,250,30);
	add(t4);			            		  				

	
           				
 	b1=new JButton("ADD");
	b2=new JButton("SAVE");
	chbtn=new JButton("Exit");
	b3=new JButton("Cancel");

             	 add(b1);
             	 add(b2);
             	 add(b3);
  
             	 b1.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	b1.setBounds(200,530,135,35);
             	b2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	b2.setBounds(400,530,135,35);
             	b3.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	 b3.setBounds(600,530,135,35);
             	chbtn.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
                   chbtn.setBounds(800,530,130,35);
                   add(chbtn);
                          
                 b1.setToolTipText("Add new record");
                 b2.setToolTipText("Save record");
                 b3.setToolTipText("Back to Main Form");
 	chbtn.setToolTipText("Exit");  
                 chbtn.addActionListener(this);

             	b1.addActionListener(this);
             	b2.addActionListener(this);
             	b3.addActionListener(this);
             		  
	t1.addKeyListener(this); 
                  t2.addKeyListener(this); 
                  t4.addKeyListener(this); 
           	z=new JLabel(new ImageIcon("bcg.jpg"));
add(z);
z.setBounds(-70,-350,1500,1500);
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	this.setSize((int)screenSize.getWidth(),(int)screenSize.getHeight());
	this.show();	         		    
}

public void keyTyped(KeyEvent e) 
 {
       if(e.getSource()==t1)
     {
	char c = e.getKeyChar();
      	if (!((c >= '0') && (c <= '9') ||  (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
      	{
      		  getToolkit().beep();
       		  e.consume();
      	}
     }

      if(e.getSource()==t2)
     {
	      char c = e.getKeyChar();
      	if (((c >= '0') && (c <= '9') || (c == KeyEvent.VK_DELETE)) ) 
      	{
        		getToolkit().beep();
        		e.consume();
      	}
     }

       if(e.getSource()==t4)
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
	if(ae.getSource()==b3)
   	{
   		this.setVisible(false);
	}
	if(ae.getSource()==b1) 
	{
		t2.setText("");
		t3.setText("");
		t4.setText("");	
			
		t2.requestFocus();
	 	 try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			stmt=con.createStatement();
                     		String s="Select * from Test";
                                  	                  int aa,t=1,tt=0;
                			 String ss,ss1;
                     		int lt;
                                                        rs=stmt.executeQuery(s);
                                                         while(rs.next())
                                                         { 
				ss=rs.getString(1);
				lt = ss.length();
				if(lt==4)
				ss1=ss.substring(3,4);
				else
				ss1=ss.substring(3,5);
				aa=Integer.parseInt(ss1);
				if(tt<=aa)
				{
  					tt=aa+2;
					ss1=Integer.toString(tt);
					t1.setText("" + ss1);

				}
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
	if(ae.getSource()==b2)
	{
	          try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			stmt=con.createStatement();
			
			String s="insert into Test  values('" + t1.getText()  + "','" + t2.getText() + "'," + t3.getText() + "," + t4.getText()  + ")";
                                                       int r=stmt.executeUpdate(s);
			 JOptionPane.showMessageDialog(null,"1.Record Inserted Sucessfully");
			con.close();
                                            
			}
		
			catch(SQLException se){
			JOptionPane.showMessageDialog(null,se);
					}
			catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			
		} 	
	}	
	
	
	if(ae.getSource()==chbtn)
		{
		System.exit(0);
		this.setVisible(false);
		}
	}

	public static void main(String args[])
	{
		 Test c=new Test();
	}
}
