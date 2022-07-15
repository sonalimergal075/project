import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.JInternalFrame;
import java.text.*;
public class TestSearch  extends JFrame implements ActionListener,KeyListener,ItemListener
{
     private JPanel jpqua=new JPanel();
     JLabel d,z;
     JButton b1,b2,b3,chbtn;
     javax.swing.Timer time;
     Choice cc1;
     int interval=100;
     JButton f,l,n,p;
     JLabel   l11,l0,l1,l2,l3,l4,l6,l7,l8,l9,l10,t;
     JTextField ln,t1,t2,t3,t4,ln1,cc;
     Connection con;
     ResultSet rs;
     String m,m1;
     Statement stmt;
     Connection con1;
     Statement stmt1;
     ResultSet rs1;
     JPanel p1=new JPanel();
    	
	 TestSearch()
	{
	     // super("View Product Search",true,true,true,true);
	      this.setVisible(true);            
	      this.setLayout(null);
                        Font fl=new Font("Arial",Font.BOLD | Font.ITALIC,25);
                        l9=new JLabel("SORAH HOSPITAL,PUNE.");
     	      l9.setFont(new Font("Times New Roman",Font.BOLD,50));
     	      l9.setBounds(200,30,900,40);
                        add(l9);
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
	t=new JLabel("Time :");
                  t.setFont(new Font("Times New Roman",Font.BOLD,36));
	t.setForeground(Color.pink);
	add(t);
	t.setBounds(950,30,200,200);
	add(d);
	d.setBounds(1080,30,200,200);
                	      l9.setForeground(Color.green);
                       l0=new JLabel("SEARCH TEST");
                       l0.setForeground(Color.red);
             	     l0.setFont(new Font("Times New Roman",Font.BOLD,35));
              	     l0.setBounds(420,100,700,35);
            	     add(l0); 
   	ln=new  JTextField(10);
                  ln.setForeground(Color.blue);
                  ln.setBounds(05,150,1500,5);
                  add(ln);
          	l11=new JLabel ("SELECT ID");
                  l11.setFont(new Font("Times New Roman",Font.BOLD,20));
	l11.setBounds(300,140,180,50);
          	add(l11);
          	cc1=new Choice();
                  add(cc1);
		    	  cc1.setFont(new Font("Times New Roman",Font.BOLD,20));	
          		    	  cc1.setBounds(490,160,200,50);
          		    	  cc1.setForeground(Color.blue);
	
                  ln1=new  JTextField(10);
                	ln1.setBounds(05,500,1500,5);
          	add(ln1);
          	
                  l1=new JLabel ("Test Id");
	l1.setFont(new Font("Times New Roman",Font.BOLD,20));
	l1.setBounds(300,215,180,50);
          	add(l1);					           
                  t1=new  JTextField(10);
                	t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
                  t1.setBounds(490,225,80,30);
                 add(t1);
		    	        
	l2=new JLabel ("Test Name");    
	l2.setFont(new Font("Times New Roman",Font.BOLD,20));     
 	add(l2);
               	l2.setBounds(300,265,180,60);
	t2=new  JTextField(10);
	t2.setFont(new Font("Times New Roman",Font.PLAIN,20));
	add(t2);
                  t2.setBounds(490,275,250,30);  
				
	l3=new JLabel (" Price");
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

	
           				
	 b1=new JButton("Delete");
	b2=new JButton("Update");
	chbtn=new JButton("Cancel");
	b3=new JButton("Edit");
	 p1.setLayout(null);
	 p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.BLACK),"Navigation"));
   	 add(p1);
 	p1.setBounds(825,200,150,250);				         
		 
	f=new JButton(new ImageIcon("icon/first.png"));
	n=new JButton(new ImageIcon("icon/next.png"));	 
	p=new JButton(new ImageIcon("icon/previous.png"));
	 l=new JButton(new ImageIcon("icon/last.png"));
	p1.add(f);  
 	p1.add(n);       
	 p1.add(p);      
	 p1.add(l);      
	f.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	f.setBounds(25,40,100,35);
 	n.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	n.setBounds(25,90,100,35);
 	p.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	p.setBounds(25,140,100,35);
 	l.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	l.setBounds(25,190,100,35);
	 f.setToolTipText("Move to record First");
 	n.setToolTipText("Move to record Next");
                  p.setToolTipText("Move to record Pre");
 	l.setToolTipText("Move to record Last");       	                     
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
                          
                   b1.setToolTipText("Clear record");
 	b2.setToolTipText("Update record");
                  b3.setToolTipText("Edit record");
 	chbtn.setToolTipText("Back to Main Form");  
                  chbtn.addActionListener(this);
             	b1.addActionListener(this);
             	b2.addActionListener(this);
             	b3.addActionListener(this);
             	f.addActionListener(this);
             	n.addActionListener(this);
             	p.addActionListener(this);
             	l.addActionListener(this);
           	try
                  {  
 		Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			
		stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	           
   		rs=stmt.executeQuery("SELECT * FROM Test");
   		while(rs.next())
   		{
   			cc1.addItem(rs.getString(1));
	                  }
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
			System.out.println("connected");
			
			stmt1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs1=stmt.executeQuery("SELECT * FROM test");
			rs1.last();	
			m=rs1.getString("t_id");
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception: "+ex);
		}
  	t1.addKeyListener(this); 
            	t2.addKeyListener(this); 
            	t4.addKeyListener(this); 
	 
	t1.setEnabled(false);
 	t2.setEnabled(false);
	t3.setEnabled(false);
	t4.setEnabled(false);
	
	cc1.addItemListener(this);	
z=new JLabel(new ImageIcon("img/bcg.jpg"));
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
  	    if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
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
                  if(ae.getSource()==f)
   	{
		try {
			rs1.first();	
                                   		 t1.setText(rs1.getString(1));
	    		t2.setText(rs1.getString(2));
	    		t3.setText(rs1.getString(3));
	                 		 
                                    	t4.setText(rs1.getString(4));
    	                  	
                                        }
                                     catch(Exception ex)
	                  {
                                                     System.out.println("Exception: "+ex);
	                  }
                   }
                 else if(ae.getSource()==n)
   	{
                            try {
			String a;
		a=rs1.getString("t_id");                          
		if(m.equals(a))
		{
			rs1.next();
                                		t1.setText(rs1.getString(1));
	    		t2.setText(rs1.getString(2));
	    		t3.setText(rs1.getString(3));
	                 		 
                                    	t4.setText(rs1.getString(4));
    	                  	
                                  }

                            }catch(Exception ex)
	              {
                                    System.out.println("Exception: "+ex);
	              }
                   }
                   if(ae.getSource()==p)
   	{
	           try {
			String a;
		a=rs1.getString("t_id");                          
		if(m.equals(a))
		{
		rs1.previous();	
                                    t1.setText(rs1.getString(1));
	    		t2.setText(rs1.getString(2));
	    		t3.setText(rs1.getString(3));
	                 		 
                                    	t4.setText(rs1.getString(4));
    	                
                                  }
                            }catch(SQLException ex)
	              {
                                    System.out.println("Exception: "+ex);
	              }
                   }
	else if(ae.getSource()==l)
   	{
		try {
			String a;
		a=rs1.getString("t_id");                          
		if(m.equals(a))
		{
			rs1.last();	
                                    	t1.setText(rs1.getString(1));
	    		t2.setText(rs1.getString(2));
	    		t3.setText(rs1.getString(3));
	                 		 
                                    	t4.setText(rs1.getString(4));
    	                 		
                                 	     }
                                    }catch(Exception ex)
	                 {
                                   		 System.out.println("Exception: "+ex);
	              	}
	}
	if(ae.getSource()==b1) 
	{
                		 try
		{Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String s="delete from Test where t_id='"+ cc1.getSelectedItem() +"' ";
			 int r=stmt.executeUpdate(s);
			 JOptionPane.showMessageDialog(null,"Record Sucessfully Deleted");
			con.close();
                                    }
		catch(SQLException se){
			JOptionPane.showMessageDialog(null,se);
				    }
		catch(Exception e){	
                                    JOptionPane.showMessageDialog(null,e);
		} 
                  	t1.setText("");
		t2.setText("");
		t3.setText("");
                	                 
		t4.setText("");	
			
		t1.requestFocus();	
	}
	if(ae.getSource()==b2)
	{
	          try
	          {Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			stmt=con.createStatement();
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String s="Update Test set t_id='"+ t1.getText() +"',t_name='"+ t2.getText() +"',t_price="+ t3.getText() +",t_quantity="+ t4.getText() +" where t_id='"+ cc1.getSelectedItem() +"' ";
			 
                                                      int r=stmt.executeUpdate(s);
			 JOptionPane.showMessageDialog(null,"1.Record Updated Sucessfully");
			con.close();
                                                      
			t1.setEnabled(false);
			 t2.setEnabled(false);
			t3.setEnabled(false);
			t4.setEnabled(false);
			
	            }
	            catch(SQLException se){
		JOptionPane.showMessageDialog(null,se);
			               }
		catch(Exception e){
	                                                } 	
	}	
	if(ae.getSource()==chbtn)
		{
		this.setVisible(false);
                                    }
                if(ae.getSource()==b3)
		{
		t1.setEnabled(true);
		 t2.setEnabled(true);
		t3.setEnabled(true);
		t4.setEnabled(true);
		
		
		}
	}
public void itemStateChanged(ItemEvent es) 
{
 	if(es.getSource()==cc1)
	{
                         try
                           {        Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			
	                  System.out.println("Showing the value"+ cc1.getSelectedItem());

   		stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
   		rs=stmt.executeQuery("SELECT * FROM Test WHERE t_id='"+cc1.getSelectedItem()+"' ");
   		while(rs.next())
   		{
   			t1.setText(rs.getString(1));
	    		t2.setText(rs.getString(2));
	    		t3.setText(rs.getString(3));
	        		
			t4.setText(rs.getString(4));
    	    		
    	                }
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
	  TestSearch c=new TestSearch();
	}
}
