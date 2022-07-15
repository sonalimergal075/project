import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class progressbar extends JFrame 
{
    Container cc;
    JProgressBar jp;
    int i,interval=100;
    Font f1;
    Timer time;
    JLabel l,ii,z;
    progressbar()
    {
        super("Loading Hospital management System.....");
        cc=getContentPane();
        cc.setLayout(null);
        jp=new JProgressBar(3,100);
        jp.setBounds(50,425,700,30);
        jp.setBackground(Color.white);
        jp.setForeground(Color.green);
        l=new JLabel("Loading .....");
        l.setBounds(80,390,100,30);
        l.setForeground(Color.blue); 
        f1=new Font("Times New Roman",Font.BOLD,18);
        l.setFont(f1);
        cc.add(jp);
        i=2;
int m;


        time=new Timer(interval,new ActionListener(){

           public void actionPerformed(ActionEvent e)
           {

            if(i==98)
            {
               setVisible(false);
                time.stop();
             new Menu();
      
            }
            i=i+2;
            jp.setValue(i);


           }
        });

        time.start();
        setSize(700,500);
        setLocation(250,150);
        setVisible(true);
        cc.add(l);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
         ii=new JLabel(new ImageIcon("mataji.jpg"));
               cc.add(ii);
         ii.setBounds(-100,0,900,500); 
           z=new JLabel(new ImageIcon("bcg.jpg"));
add(z);
z.setBounds(-450,-500,1500,1500);    
    }


 public static void main(String args[])
    {
       new progressbar();    
    }
}
