import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

 public class LoginForm implements ActionListener {
 JFrame jf;
 JLabel jl1,jl2;
 JButton regbut,logbut;
 JTextField jt1,jt2;

void initializeComponent(){
	jf=new JFrame();
 jf.setVisible(true);
 jf.setSize(500,500);
 jf.setLayout(null);

 jl1=new JLabel("USERID");
 jl1.setBounds(50,40,100,50);
 jf.add(jl1);

 jl2=new JLabel("PASSWORD");
 jl2.setBounds(50,90,100,50);
 jf.add(jl2);
 
 jt1= new JTextField();
 jt1.setBounds(150,50,100,25);
 jf.add(jt1);

 jt2= new JTextField();
 jt2.setBounds(150,100,100,25);
 jf.add(jt2);

 regbut=new JButton("Register");
 regbut.setBounds(50,200,100,30);
 jf.add(regbut);
 regbut.addActionListener(this);

 logbut=new JButton("Login");
 logbut.setBounds(200,200,150,30);
 jf.add(logbut);
 logbut.addActionListener(this);
  
 
}

 
public void actionPerformed(ActionEvent e)
{
   System.out.println("event is occured");
 if(e.getSource()==regbut)
  {
   RegForm reg=new RegForm();
   reg.initializeComponent();
   System.out.println("register button is click");
  }
 if(e.getSource()==logbut)
  {
    System.out.println("login button is click");
  }
} 

public static void main(String[] args){
 LoginForm obj=new LoginForm();
 obj.initializeComponent();
}
}   