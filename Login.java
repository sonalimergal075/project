import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import java.net.URL;
class InvalidPasswordException extends Exception
{
}
class InvalidUserException extends Exception
{
}
public class Login extends JFrame  implements ActionListener
{
        JLabel name, pass,lbl;
 Connection con;
     ResultSet rs;
     Statement stmt;
        JTextField nameText;
        JPasswordField passText;
        JButton login, end;
        static int attempt=0;
        JFrame frm1;
String s1,s2;
ImageIcon ii;

        public Login()
        {
	URL url=this.getClass().getResource("flow1.gif");

		System.out.println(url);
		ii = new ImageIcon(url);
		lbl=new JLabel(ii);
                frm1=new JFrame("LOGIN");
                frm1.getContentPane().setLayout(null);
                name = new JLabel("Name:");
                name.setFont(new Font("Times New Roman",Font.BOLD,25));
                name.setBounds(50,50,75,25);
                pass = new JLabel("Password:");
                pass.setFont(new Font("Times New Roman",Font.BOLD,25));
                pass.setBounds(50,110,120,25);
                    lbl.setBounds(250,40,200,200);
         frm1.getContentPane().add(lbl);
		
 			
                nameText = new JTextField(20);
                nameText.setFont(new Font("Times New Roman",Font.BOLD,25));
                nameText.setBounds(190,45,175,40);
                passText = new JPasswordField(20);
                passText.setFont(new Font("Times New Roman",Font.BOLD,25));
                passText.setBounds(190,100,175,40);

                login = new JButton("Login");
                login.setFont(new Font("Times New Roman",Font.BOLD,30));
                login.setBounds(50,175,120,40);
                end = new JButton("End");
                end.setFont(new Font("Times New Roman",Font.BOLD,30));
                end.setBounds(200,175,120,40);

               login.addActionListener(this);
                end.addActionListener(this);

                login.setToolTipText("Get Logined");
 	end.setToolTipText("To Exit");
                
                frm1.getContentPane().add(name);
                frm1.getContentPane().add(nameText);
                frm1.getContentPane().add(pass);
                frm1.getContentPane().add(passText);
                frm1.getContentPane().add(login);
                frm1.getContentPane().add(end);

               frm1.setTitle("Login Check");
                frm1.setSize(400,270);
		frm1.setLocation(400/2,270/2);
                
                frm1.setVisible(true);
        }


 public void actionPerformed(ActionEvent ae)
        {
                JButton btn = (JButton)ae.getSource();
                if(btn == end)
                {
                        System.exit(0);
                }
                if(btn == login)
                {
                       try
	       {
		String  t1=nameText.getText();
	         String  t2= new String( passText.getText());
                              String user = t1;
                                String pass = t2;
		String s="0",s1="0";
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospitaldb";
		String userName="root";
		String password="";

   		con=DriverManager.getConnection(url,userName,password);
		System.out.println("connected");
		//String sql1="INSERT INTO logindb(username,password) VALUES(1,'sona')";

		stmt=con.createStatement();
		//int r=stmt.executeUpdate(sql1);
		//System.out.println("no.of rows affected"+r);

   		rs=stmt.executeQuery("SELECT * FROM logindb");
		while(rs.next())
   		{
   			s=rs.getString(1);
	    		s1=rs.getString(2);
	    		
    	                }

		}catch(ClassNotFoundException se)
		{
		JOptionPane.showMessageDialog(null,se);
		//e.printStackTrace();
		}catch(SQLException se){
		//e.printStackTrace();
		JOptionPane.showMessageDialog(null,se);
		}

		if(user.compareTo(s)==0)
                                {
                                	if(pass.compareTo(s1)==0)
                                	{
                                		JOptionPane.showMessageDialog(null,"Login Successful","Login",JOptionPane.INFORMATION_MESSAGE);
                                  
                                          progressbar m=new progressbar();
			// m.setSize(1000,1000);
                        		  m.setVisible(true);
                 		     frm1.setVisible(false);
                                         }
                                	else
                                	{
                                   	     throw new InvalidPasswordException();
                                	}
                                }
                                else
                                {
                                	throw new InvalidUserException();
                                } 
                             
		
		           }
		 catch(InvalidPasswordException e)
                        {       
				attempt++;
                                JOptionPane.showMessageDialog(null,"Invalid Passeard","Login",JOptionPane.ERROR_MESSAGE);
                           passText.setText("");
                               passText.requestFocus();
                                if(attempt == 3)
                                {
                                        JOptionPane.showMessageDialog(null,"3 Attempts Over","Login",JOptionPane.ERROR_MESSAGE);
                                      System.exit(0);
                                }
                        }
                        catch(InvalidUserException e)
                        {        attempt++;
                                JOptionPane.showMessageDialog(null,"Invalid User Name ","Login",JOptionPane.ERROR_MESSAGE);
                   nameText.setText("");
                           nameText.requestFocus();
                                if(attempt == 3)
                                {
                                        JOptionPane.showMessageDialog(null,"3 Attempts Over","Login",JOptionPane.ERROR_MESSAGE);
                                       System.exit(0);
                                }


	}
		
	                  
   		
   }
}




        public static void main(String args[])
        {
               Login l=new Login();
        }
}