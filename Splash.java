package college_management_system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
  Thread t;  
 Splash()
 {
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/C_image_1.jpg"));
    Image i2=i1.getImage().getScaledInstance(759 , 422, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i1);
    add(image);
    
    t=new Thread (this);
    t.start();
    
    
    setVisible(true);
   
    int x=1;
    for (int i=1;i<=509;i+=4,x+=1)
    {
        setLocation(600-((i+x)/2),300-(i/2));
        setSize(i+2*x,i+x/2);
        
        try{
          Thread.sleep(10);
        }
        catch(Exception e){}
   
   }
    
 }
 public void run(){
    try{
        Thread.sleep(5000);
        setVisible(false);
        new Login();
    }
    catch(Exception e){
    
    }
 }

public static void main(String[]args){
   new Splash();
//   new Login();
//if we write it here the frame will open along with the first frame .
//so write it in the try catch block above of run class so that it will opwen after thwe first frame gets close
   
//new Project(); do not write this because it opens the file bedore login
}
} 

