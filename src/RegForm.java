import javax.swing.*;
import java.awt.event.*;
 
public class RegForm implements ActionListener{
 JFrame jf;

 JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8;
 JButton regbut,clbut,bkbut;
 JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;


void initializeComponent(){
   jf=new JFrame();
   jf.setVisible(true);
   jf.setSize(500,500);  
   jf.setLayout(null);
 
   jl1=new JLabel("NAME");
   jl1.setBounds(20,10,100,30);
   jf.add(jl1);
   
   jl2=new JLabel("USERID");
   jl2.setBounds(20,45,100,30);
   jf.add(jl2);
   
   jl3=new JLabel("PASSWORD");
   jl3.setBounds(20,80,100,30);
   jf.add(jl3);
   
   jl4=new JLabel("DEPT");
   jl4.setBounds(20,115,100,30);
   jf.add(jl4);
   
   jl5=new JLabel("DESIGNATION");
   jl5.setBounds(20,150,100,30);
   jf.add(jl5);

   jl6=new JLabel("USN");
   jl6.setBounds(20,185,100,30);
   jf.add(jl6);

   jl7=new JLabel("ADDRESS");
   jl7.setBounds(20,220,100,30);
   jf.add(jl7);

   jl8=new JLabel("EMAIL ID");
   jl8.setBounds(20,255,100,30);
   jf.add(jl8);

  
 
   jt1= new JTextField();
   jt1.setBounds(120,10,150,30);
   jf.add(jt1);

   jt2= new JTextField();
   jt2.setBounds(120,45,150,30);
   jf.add(jt2);

   jt3= new JTextField();
   jt3.setBounds(120,80,150,30);
   jf.add(jt3);

   jt4= new JTextField();
   jt4.setBounds(120,115,150,30);
   jf.add(jt4);

   jt5= new JTextField();
   jt5.setBounds(120,150,150,30);
   jf.add(jt5);

   jt6= new JTextField();
   jt6.setBounds(120,185,150,30);
   jf.add(jt6);

   jt7= new JTextField();
   jt7.setBounds(120,220,150,30);
   jf.add(jt7);

   jt8= new JTextField();
   jt8.setBounds(120,255,150,30);
   jf.add(jt8);

   
   
   regbut=new JButton("Register");
   regbut.setBounds(20,300,70,30);
   jf.add(regbut);
   regbut.addActionListener(this);
   
   clbut=new JButton("Clear");
   clbut.setBounds(120,300,100,30);
   jf.add(clbut);
   clbut.addActionListener(this);
   
   bkbut=new JButton("Back");
   bkbut.setBounds(250,300,100,30);
   jf.add(bkbut); 
   bkbut.addActionListener(this);


}

 
public void actionPerformed(ActionEvent e)
{
   }
public static void main(String[] args){
 RegForm obj=new RegForm();
 obj.initializeComponent();
}
}   