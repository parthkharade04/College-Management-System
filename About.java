package college_management_system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/C_image_6.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>College<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("<html>Developed by: <br/>1. Parth Kharade<br/>2. Sanket Khade<br/>3. Kaustubh Kodag<br/>4. Om Kasabekar</html>");
        name.setBounds(70, 180, 550, 130);
        name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(name);
        
        JLabel rollno = new JLabel("<html>Roll number:<br/> 56 <br/>55 <br/>57 <br/>51</html>");
        rollno.setBounds(70, 320, 550, 90);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: parth.kharade21@vit.edu");
        contact.setBounds(70, 430, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
