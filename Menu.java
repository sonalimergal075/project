import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

class Menu extends JFrame implements ActionListener
{
JFrame frm=new JFrame();;
JMenuBar mnu;

  ImageIcon iii;
JMenu m1,m2,m3,m,m4,m5,m2_1,m2_2,m2_3,m2_4,m2_5,m2_6,m4_1,m4_2;
JMenuItem m1_1,m1_2;

 JMenuItem m_1,m_2,m_3,m_4;

JMenuItem m2_1_1,m2_1_2;
JMenuItem m2_6_1,m2_6_2;
JMenuItem m2_2_1,m2_2_2;
JMenuItem m2_3_1,m2_3_2;
JMenuItem m2_4_1,m2_4_2;
JMenuItem m2_5_1,m2_5_2;

JMenuItem m3_1,m3_2,m3_3,m3_4;
JMenuItem m4_1_1;
JMenuItem m4_2_1,m4_2_2,m4_2_3;
JMenuItem m4_1_2,m4_1_3,m4_1_4,m4_1_5;
JMenuItem m5_1,m5_2;

ImageIcon ii;
JLabel l1,img;
 public JToolBar toolBar;
 public JButton b1,b2,b3,b4,b5,b6;
 private JPanel statusBar = new JPanel ();
private JLabel welcome,z;
	private JLabel author;

private JDesktopPane desktop=new JDesktopPane();
 
	Menu()	
	{

 l1=new JLabel("SORAH HOSPITAL,PUNE.");
    l1.setForeground(Color.red);
    l1.setFont(new Font("Times New Roman",Font.BOLD,40));
    l1.setBounds(250,20,800,80); 
iii=new ImageIcon("mataji.jpg");

 
	img=new JLabel(iii);img.setBounds(170,75,700,420);

	mnu=new JMenuBar();
	mnu.setBounds(0,0,1030,20);
	setJMenuBar(mnu);
this.setBackground(Color.cyan);
	
m1=new JMenu("File     ");
	m1.setFont(new Font("Times New Roman",Font.BOLD,25));
	m1.setMnemonic((int)'F');
	mnu.add(m1);

	m1_1=new JMenuItem("Log Off    ",new ImageIcon("icon/86.jpg"));
	m1_1.setMnemonic((int)'X');
	m1_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,Event.CTRL_MASK));
	m1.add(m1_1);
m1_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m1_2=new JMenuItem("Exit    ",new ImageIcon("icon/Exit.bmp"));
	m1_2.setMnemonic((int)'Z');
	m1_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,Event.CTRL_MASK));
	m1.add(m1_2);
m1_2.setFont(new Font("Times New Roman",Font.BOLD,20));

m2=new JMenu("Master Entry     ");
m2.setFont(new Font("Times New Roman",Font.BOLD,25));
	m2.setMnemonic((int)'M');
	mnu.add(m2);
m2_1 =new JMenu("Patient    ");
m2_1.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m2_1_1=new JMenuItem("New    ",new ImageIcon("icon/new.gif"));
	m2_1_1.setMnemonic((int)'A');
m2_1_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_1_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,Event.CTRL_MASK));
                  m2_1_2=new JMenuItem("Search    ",new ImageIcon("icon/Search.gif"));
	m2_1_2.setMnemonic((int)'B');
	m2_1_2.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_1_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,Event.CTRL_MASK));
                   m2_1.add(m2_1_1);
                   m2_1.add(m2_1_2);
                    m2.add(m2_1);

m2_6 =new JMenu("Test    ");
m2_6.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m2_6_1=new JMenuItem("New    ",new ImageIcon("icon/new.gif"));
	m2_6_1.setMnemonic((int)'A');
m2_6_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_6_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,Event.CTRL_MASK));
                  m2_6_2=new JMenuItem("Search    ",new ImageIcon("icon/Search.gif"));
	m2_6_2.setMnemonic((int)'B');
	m2_6_2.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_6_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,Event.CTRL_MASK));
                   m2_6.add(m2_6_1);
                   m2_6.add(m2_6_2);
                    m2.add(m2_6);

 m2_2 =new JMenu("Receptionist    ");
m2_2.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m2_2_1=new JMenuItem("New    ",new ImageIcon("icon/export.gif"));
	m2_2_1.setMnemonic((int)'C');
m2_2_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_2_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.CTRL_MASK));
                   
                   m2_2.add(m2_2_1);
                  
                    m2.add(m2_2);
 
                        m2_3 =new JMenu("Nurse   ");
m2_3.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m2_3_1=new JMenuItem("New    ",new ImageIcon("icon/new.gif"));
	m2_3_1.setMnemonic((int)'E');
m2_3_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_3_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.CTRL_MASK));
                   m2_3.add(m2_3_1);
                  
                    m2.add(m2_3);

                    m2_4 =new JMenu("Doctor   ");
m2_4.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m2_4_1=new JMenuItem("New    ",new ImageIcon("icon/export.gif"));
	m2_4_1.setMnemonic((int)'N');
m2_4_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_4_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,Event.CTRL_MASK));
                  
                   m2_4.add(m2_4_1);
                  
                    m2.add(m2_4);
	
	  m2_5 =new JMenu("Hospital    ");
m2_5.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m2_5_1=new JMenuItem("New    ",new ImageIcon("icon/new.gif"));
	m2_5_1.setMnemonic((int)'I');
m2_5_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m2_5_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,Event.CTRL_MASK));
                   m2_5.add(m2_5_1);
                  
                    m2.add(m2_5);

                     m=new JMenu("Tool        ");
	m.setFont(new Font("Times New Roman",Font.BOLD,25));
	mnu.add(m);
m.setMnemonic((int)'T');
	m_1=new JMenuItem("Calculater",new ImageIcon("icon/Toaster.gif"));
	m_1.setMnemonic((int)'C');
m_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,Event.CTRL_MASK));
	m.add(m_1);
m_2=new JMenuItem("Notpad",new ImageIcon("icon/Toaster.gif"));
	m_2.setMnemonic((int)'N');
m_2.setFont(new Font("Times New Roman",Font.BOLD,20));
	m_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
	m.add(m_2);

m_3=new JMenuItem("Open File",new ImageIcon("icon/Open.GIF"));
	m_3.setMnemonic((int)'Q');
m_3.setFont(new Font("Times New Roman",Font.BOLD,20));
	m_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,Event.CTRL_MASK));
	m.add(m_3);


                     m3=new JMenu("Transaction        ");
m3.setMnemonic((int)'T');
	m3.setFont(new Font("Times New Roman",Font.BOLD,25));
	mnu.add(m3);
	m3_1=new JMenuItem("Bill",new ImageIcon("icon/Toaster.gif"));
	m3_1.setMnemonic((int)'O');
m3_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m3_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK));
	m3.add(m3_1);
	

	m4=new JMenu("Report    ");
	m4.setFont(new Font("Times New Roman",Font.BOLD,25));
	mnu.add(m4);
m4.setMnemonic((int)'R');
	m4_1 =new JMenu("Master    ");
m4_1.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m4_1_1=new JMenuItem("Patient   ",new ImageIcon("icon/export.gif"));
	m4_1_1.setMnemonic((int)'C');
m4_1_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m4_1_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,Event.CTRL_MASK));
                    m4_1_2=new JMenuItem("Receptionist    ",new ImageIcon("icon/export.gif"));
	m4_1_2.setMnemonic((int)'2');
m4_1_2.setFont(new Font("Times New Roman",Font.BOLD,20));
	m4_1_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,Event.CTRL_MASK));
 m4_1_3=new JMenuItem("Nurse    ",new ImageIcon("icon/export.gif"));
	m4_1_3.setMnemonic((int)'3');
m4_1_3.setFont(new Font("Times New Roman",Font.BOLD,20));
	m4_1_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,Event.CTRL_MASK));
             m4_1_4=new JMenuItem("Hospital   ",new ImageIcon("icon/export.gif"));
	m4_1_4.setMnemonic((int)'4');
	m4_1_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4,Event.CTRL_MASK));
m4_1_4.setFont(new Font("Times New Roman",Font.BOLD,20));
            m4_1_5=new JMenuItem("Doctor    ",new ImageIcon("icon/export.gif"));
m4_1_5.setFont(new Font("Times New Roman",Font.BOLD,20));
	m4_1_5.setMnemonic((int)'5');
	m4_1_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5,Event.CTRL_MASK));
            
                   m4_1.add(m4_1_1);
                   m4_1.add(m4_1_2);
	  m4_1.add(m4_1_3);
                   m4_1.add(m4_1_4);
 	 m4_1.add(m4_1_5);
 	 m4.add(m4_1);
                   
 m4_2 =new JMenu("Transaction    ");
m4_2.setFont(new Font("Times New Roman",Font.BOLD,20));
                   m4_2_1=new JMenuItem("Bill    ",new ImageIcon("icon/export.gif"));
	m4_2_1.setMnemonic((int)'6');
m4_2_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m4_2_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6,Event.CTRL_MASK));
                    
                  m4_2.add(m4_2_1);
                  
                    m4.add(m4_2);
	

	m5=new JMenu("Help      ");
	m5.setFont(new Font("Times New Roman",Font.BOLD,25));
	mnu.add(m5);	
m5.setMnemonic((int)'H');
	m5_1=new JMenuItem("Help",new ImageIcon("icon/Help.gif"));
	m5_1.setMnemonic((int)'V');
m5_1.setFont(new Font("Times New Roman",Font.BOLD,20));
	m5_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,Event.CTRL_MASK));
	m5.add(m5_1);
m5_2=new JMenuItem("About us",new ImageIcon("icon/PAPROLL.GIF"));
	m5_2.setMnemonic((int)'M');
m5_2.setFont(new Font("Times New Roman",Font.BOLD,20));
	m5_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,Event.CTRL_MASK));
	m5.add(m5_2);


	
b1=new JButton(new ImageIcon("icon/new.gif"));
	b1.setToolTipText ("New");
	
b3=new JButton(new ImageIcon("icon/Print.gif"));
	b3.setToolTipText ("print bill");
b4=new JButton(new ImageIcon("icon/Toaster.gif"));
	b4.setToolTipText ("company record");
b5=new JButton(new ImageIcon("icon/NotePad.gif"));
	b5.setToolTipText ("maintainace");	
	b6=new JButton(new ImageIcon("icon/Help.gif"));
	b6.setToolTipText ("Help on System");	
	

toolBar=new JToolBar();
	toolBar.addSeparator();
	toolBar.add(b1);
b1.addActionListener(this);

toolBar.addSeparator();
b3.addActionListener(this);
	toolBar.add(b3);
toolBar.addSeparator();
	toolBar.add(b4);
b4.addActionListener(this);
toolBar.addSeparator();
	toolBar.add(b5);
b5.addActionListener(this);
toolBar.addSeparator();
	//file
	m1_1.addActionListener(this);
                  m1_2.addActionListener(this);
//master entry
 	 m2_1_1.addActionListener(this);
                 m2_1_2.addActionListener(this);
	
	 m2_6_1.addActionListener(this);
                 m2_6_2.addActionListener(this);

                   m2_2_1.addActionListener(this);
                 
                    m2_3_1.addActionListener(this);
                  
                   m2_4_1.addActionListener(this);
                 
	m2_5_1.addActionListener(this);
//transaction
	 m3_1.addActionListener(this);
                    
  
 //report
               m4_1_1.addActionListener(this);
                  m4_1_2.addActionListener(this);
                   m4_1_3.addActionListener(this);
                   m4_1_4.addActionListener(this);
                  m4_1_5.addActionListener(this);
      //Tool                    
           m_1.addActionListener(this); 
 m_2.addActionListener(this);
 m_3.addActionListener(this); 

      //Help
                      m5_1.addActionListener(this);
	 m5_2.addActionListener(this);

	author = new JLabel (" Author:-MR.SONALI D MERGAL", Label.LEFT);
		author.setForeground (Color.red);
	welcome = new JLabel ("Welcome To SORAH HOSPITAL MANAGEMENT SYSTEM.. ", JLabel.RIGHT);
		welcome.setForeground (Color.blue);
		welcome.setToolTipText ("Welcoming the User & System Current Date");
		statusBar.setLayout (new BorderLayout());
		statusBar.add (author, BorderLayout.WEST);
		statusBar.add (welcome, BorderLayout.EAST);


	getContentPane().add(toolBar,BorderLayout.NORTH);
	getContentPane().add(desktop,BorderLayout.CENTER);
	getContentPane().add (statusBar, BorderLayout.SOUTH);
z=new JLabel(new ImageIcon("home.ico"));
desktop.add(z);
z.setBounds(-80,-420,1500,1500);
                
this.setSize(1500,1500);
	setVisible(true);
	setTitle("Sorah Hospital Management System");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	}

	public void actionPerformed(ActionEvent ae)

	{

	
	if(ae.getSource()==m1_1 || ae.getSource()==b5)
		{
                              Login ob=new Login();
		 frm.setVisible(false);
         
	
		}
	 else if(ae.getSource()==m1_2 || ae.getSource()==b1)
		{
                                               quitapp();
		
		}

	else if(ae.getSource()==m2_1_1)
		{

                                             desktop.add(new Patient()); 

		
		}
	else if(ae.getSource()==m2_1_2)
		{
                                      desktop.add(new PatSearch());
		
		}
	 if(ae.getSource()==m2_2_1)
		{
		desktop.add(new Receptionist());
		
		}
	
	
	if(ae.getSource()==m2_3_1 || ae.getSource()==b6)
		{
		desktop.add(new Nurse());
		}
	
	if(ae.getSource()==m2_4_1)
		{
		
		 desktop.add(new Doctor());
		}
	if(ae.getSource()==m2_5_1)
		{
		
		 desktop.add(new Hospital());
		}
	if(ae.getSource()==m2_6_1)
		{
		
		 desktop.add(new Test());
		}
	if(ae.getSource()==m2_6_2)
		{
		
		 desktop.add(new TestSearch());
		}

	if(ae.getSource()==m_1)
		{
                             Runtime r=Runtime.getRuntime();
Process p=null;
try {
 String s="C:\\WINDOWS\\System32\\calc.exe";

p=r.exec(s);
}
catch(Exception e){
System.out.println(e);
e.printStackTrace();
}
		}
if(ae.getSource()==m_2)
		{
                             Runtime r=Runtime.getRuntime();
Process p=null;
try {
String s="C:\\WINDOWS\\System32\\notepad.exe";
p=r.exec(s);
}
catch(Exception e){
System.out.println(e);
e.printStackTrace();
}
		}


	if(ae.getSource()==m_3)
		{
                                                FileDialog fd=new FileDialog(frm,"File Dialog");
                                   fd.setVisible(true);
                                      }
		
	
	
	if(ae.getSource()== m3_1)
		{
		 desktop.add(new Payment ());
		}	
	//REport
if(ae.getSource()== m4_1_1)
		{
		// desktop.add(new taxrec());
                                            desktop.add(new PatientReport());
		}
if(ae.getSource()== m4_1_2)
		{
		desktop.add(new RecepReport());
                                       }
if(ae.getSource()== m4_1_3)
		{
		desktop.add(new NurseReport());
                                       }
if(ae.getSource()== m4_1_4)
		{
		desktop.add(new Hospital());
                                       }
if(ae.getSource()== m4_1_5)
		{
		desktop.add(new DoctorReport());
                                       }
if(ae.getSource()== m4_2_1)
		{
		//desktop.add(new Bill());
                                       }


		
	

	if(ae.getSource()== m5_1)
		{
		
  Runtime r=Runtime.getRuntime();
Process p=null;
try {
// String s="C:\\WINDOWS\\System32\\calc.exe";
String s="D:\\my1\\Debug\\WindowsApplication1.exe";
p=r.exec(s);
}
catch(Exception e){
System.out.println(e);
e.printStackTrace();
}
		}

if(ae.getSource()== m5_2)
{
desktop.add(new Login());
}

if(ae.getSource()==m_2)
		{
                             Runtime r=Runtime.getRuntime();
Process p=null;
try {
String s="C:\\WINDOWS\\System32\\notepad.exe";
p=r.exec(s);
}
catch(Exception e){
System.out.println(e);
e.printStackTrace();
                                       }
}


}


	public void quitapp()
	{
		try
		{
		int reply=JOptionPane.showConfirmDialog(this,
							"Do you want to exit\n from Hospital Management System",
							"Transport system-exit",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
		if (reply == JOptionPane.YES_OPTION) {
				setVisible (false);	//Hide the Frame.
				dispose();            	//Free the System Resources.
				System.out.println ("Thanks for Using Hospital System");
				System.exit (0);        //Close the Application.
			}
			else if (reply == JOptionPane.NO_OPTION) {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		} 

		catch (Exception e) {}

	}	
	
public static void main(String args[]) throws Exception
{
Menu m=new Menu();
}
}