import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.JInternalFrame;
import java.text.*;
public class PatSearch  extends JFrame implements ActionListener,KeyListener,ItemListener
{
     private JPanel jpqua=new JPanel();
     JLabel d,z;
     JButton b1,b2,b3,chbtn;
     javax.swing.Timer time;
      JComboBox cc1;
     int interval=100;
     JButton f,l,n,p;
     JLabel   l11,l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,t;
     JTextField ln,t1,t2,t3,t4,t5,ln1,cc;
     Connection con;
     ResultSet rs;
     Statement stmt;
     Connection con1;
     Statement stmt1;
     ResultSet rs1;
     JPanel p1=new JPanel();
    String m,m1;	
	 PatSearch()
	{
	      //super("View Patient Search",true,true,true,true);
	      this.setVisible(true);            
	      this.setLayout(null);
                        Font fl=new Font("Arial",Font.BOLD | Font.ITALIC,25);
                        l9=new JLabel("SORAH HOSPITAL PUNE.");
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
                	      l9.setForeground(Color.yellow);
                       l0=new JLabel("SEARCH PATIENT");
                       l0.setForeground(Color.red);
             	     l0.setFont(new Font("Times New Roman",Font.BOLD,35));
              	     l0.setBounds(420,100,700,35);
            	     add(l0); 
   	ln=new  JTextField(10);
                  ln.setForeground(Color.blue);
                  ln.setBounds(05,150,1500,5);
                  add(ln);
          	l11=new JLabel ("SELECT CODE");
                  l11.setFont(new Font("Times New Roman",Font.BOLD,20));
	l11.setBounds(300,140,180,50);
          	add(l11);
          	cc1=new  JComboBox();
                  add(cc1);
		    	  cc1.setFont(new Font("Times New Roman",Font.BOLD,20));	
          		    	  cc1.setBounds(490,160,200,30);
          		    	  cc1.setForeground(Color.blue);
	
                  ln1=new  JTextField(10);
                	ln1.setBounds(05,530,1500,5);
          	add(ln1);
          	
                  l1=new JLabel ("PATIENT CODE");
	l1.setFont(new Font("Times New Roman",Font.BOLD,20));
	l1.setBounds(300,190,180,50);
          	add(l1);					           
                  t1=new  JTextField(10);
                	t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
                  t1.setBounds(490,200,80,30);
                 add(t1);
		    	        
	l2=new JLabel ("PATIENT NAME");    
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
				
                  l4=new JLabel("BLOOD GROUP");
	l4.setFont(new Font("Times New Roman",Font.BOLD,20));
	add(l4);
	l4.setBounds(300,365,180,60);
  	cc=new JTextField(10);
                   cc.setFont(new Font("Arial",Font.PLAIN,20));
	add(cc);
	cc.setBounds(490,375,250,30);
		   	                    
 	l10=new JLabel ("AGE");
	l10.setFont(new Font("Times New Roman",Font.BOLD,20));
	add(l10);
	l10.setBounds(300,415,180,60);
	t4=new  JTextField(10);
	t4.setFont(new Font("Times New Roman",Font.PLAIN,20));
	 t4.setBounds(490,425,250,30);
	add(t4);			            		  				

	 l5=new JLabel ("REASON");
	 l5.setFont(new Font("Times New Roman",Font.BOLD,20));
                   add(l5);
           	l5.setBounds(300,465,180,60);
	t5=new  JTextField(10);
	t5.setFont(new Font("Times New Roman",Font.PLAIN,20));
	add(t5);
           	t5.setBounds(490,475,250,30);
           				
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
             	b1.setBounds(200,545,135,35);
             	b2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	b2.setBounds(400,545,135,35);
             	b3.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
             	b3.setBounds(600,545,135,35);
             	 chbtn.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
                   chbtn.setBounds(800,545,130,35);
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
   		rs=stmt.executeQuery("SELECT * FROM Patient");
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
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs1=stmt.executeQuery("SELECT * FROM Patient");
			rs1.last();	
			m=rs1.getString("p_regno");




		}
		catch(Exception ex)
		{
			System.out.println("Exception: "+ex);
		}
  	t1.addKeyListener(this); 
            	t2.addKeyListener(this); 
            	t4.addKeyListener(this); 
	 cc.setEnabled(false);
	t1.setEnabled(false);
 	t2.setEnabled(false);
	t3.setEnabled(false);
	t4.setEnabled(false);
	t5.setEnabled(false);
	cc1.addItemListener(this);	
z=new JLabel(new ImageIcon("img/d.jpg"));
add(z);
z.setBounds(-70,-450,1500,1500); 

		try
		{Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs1=stmt.executeQuery("SELECT * FROM Patient");
			rs1.last();	
			m=rs1.getString("p_regno");
}
		catch(Exception ex)
		{
			System.out.println("Exception: "+ex);
		}
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
                                   		 t1.setText(rs1.getString("p_regno"));
	    		t2.setText(rs1.getString("p_name"));
	    		t3.setText(rs1.getString("p_address"));
	                 		 cc.setText(rs1.getString("p_bgroup"));
                                    	t4.setText(rs1.getString("p_age"));
    	                  	t5.setText(rs1.getString("p_reason"));
                                        }
                                     catch(Exception ex)
	                  {
                                                     System.out.println("Exception: "+ex);
	                  }
                   }
                   if(ae.getSource()==n)
   	{
                            try {
String a;
a=rs1.getString("p_regno");                          
if(m.equals(a))
{
rs1.first();
 t1.setText(rs1.getString("p_regno"));
	    		t2.setText(rs1.getString("p_name"));
	    		t3.setText(rs1.getString("p_address"));
	                  	cc.setText(rs1.getString("p_bgroup"));
                                    	t4.setText(rs1.getString("p_age"));
    	                  	t5.setText(rs1.getString("p_reason"));
}
else
{     
			rs1.next();
	
                                		 t1.setText(rs1.getString("p_regno"));
	    		t2.setText(rs1.getString("p_name"));
	    		t3.setText(rs1.getString("p_address"));
	                  	cc.setText(rs1.getString("p_bgroup"));
                                    	t4.setText(rs1.getString("p_age"));
    	                  	t5.setText(rs1.getString("p_reason"));
                             
}
     }
                            catch(Exception ex)
	              {
                                    System.out.println("Exception: "+ex);
	              }
                   }
                   if(ae.getSource()==p)
   	{
	           try {
String a;
a=rs1.getString("p_regno");                          
if(m1.equals(a))
{
rs1.last();	
                                    t1.setText(rs1.getString("p_regno"));
	    	t2.setText(rs1.getString("p_name"));
	    	t3.setText(rs1.getString("p_address"));
	                  cc.setText(rs1.getString("p_bgroup"));
                                    t4.setText(rs1.getString("p_age"));
    	                  t5.setText(rs1.getString("p_reason"));
}
else
{
		rs1.previous();	
                                    t1.setText(rs1.getString("p_regno"));
	    	t2.setText(rs1.getString("p_name"));
	    	t3.setText(rs1.getString("p_address"));
	                  cc.setText(rs1.getString("p_bgroup"));
                                    t4.setText(rs1.getString("p_age"));
    	                  t5.setText(rs1.getString("p_reason"));
}
                                  }
                            catch(SQLException ex)
	              {
                                    System.out.println("Exception: "+ex);
	              }
                   }

   	if(ae.getSource()==l)
   	{
		try {
			rs1.last();	
                                    	t1.setText(rs1.getString("p_regno"));
	    		t2.setText(rs1.getString("p_name"));
	    		t3.setText(rs1.getString("p_address"));
	                  	cc.setText(rs1.getString("p_bgroup"));
                                   		 t4.setText(rs1.getString("p_age"));
    	                 		 t5.setText(rs1.getString("p_reason"));
                                 	     }
                                    catch(Exception ex)
	                 {
                                   		 System.out.println("Exception: "+ex);
	              	}
	}
	if(ae.getSource()==b1) 
	{
                		 try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospitaldb";
			String userName="root";
			String password="";

   			con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected");

			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String s="delete from Patient where p_regno='"+ (String) cc1.getSelectedItem() +"' ";
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
                	                  cc.setText("");
		t4.setText("");	
		t5.setText("");	
		t1.requestFocus();	
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
			
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String s="Update Patient set p_regno='"+ t1.getText() +"',p_name='"+ t2.getText() +"',p_address='"+ t3.getText() +"',p_bgroup='"+ cc.getText() +"',p_age="+ t4.getText() +",p_reason='"+ t5.getText() +"' where p_regno='"+ (String) cc1.getSelectedItem() +"' ";
			 
                                                      int r=stmt.executeUpdate(s);
			 JOptionPane.showMessageDialog(null,"1.Record Updated Sucessfully");
			con.close();
                                                      cc.setEnabled(false);
			t1.setEnabled(false);
			 t2.setEnabled(false);
			t3.setEnabled(false);
			t4.setEnabled(false);
			t5.setEnabled(false);
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
		t5.setEnabled(true);
		cc.setEnabled(true);
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
   		rs=stmt.executeQuery("SELECT * FROM Patient WHERE p_regno='"+ (String) cc1.getSelectedItem()+"' ");
   		while(rs.next())
   		{
   			t1.setText(rs.getString(1));
	    		t2.setText(rs.getString(2));
	    		t3.setText(rs.getString(3));
	        		cc.setText(rs.getString(4));
			t4.setText(rs.getString(5));
    	    		t5.setText(rs.getString(6));
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
	  PatSearch c=new PatSearch();
	}
}
