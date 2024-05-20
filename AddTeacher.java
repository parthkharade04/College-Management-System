
        
package college_management_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField tfname,tffname,tfaddress,tfphone,tfemail,tfclassX,tfclassXII,tfaadhar;
    JLabel labelempid;
    JDateChooser dcdob;
    JComboBox cbqualification,cbdepartment;
    JButton submit,cancel;
    
    Random ran=new Random();
    long first4=Math.abs((ran.nextLong()%900L)+ 100L);
    
    AddTeacher()
    {
      setSize(900,700);
      setLocation(250,40);
      setLayout(null);
      
      
//  New student details
      JLabel heading=new JLabel("New Teacher Details");
      heading.setBounds(300,30,500,50 );
      heading.setFont(new Font("serif", Font.BOLD ,30));
      add(heading);
     
      
//  Name
      JLabel lblname=new JLabel("Name");
      lblname.setBounds(50,150,100,30 );
      lblname.setFont(new Font("serif", Font.BOLD ,20));
      add(lblname);
       
      tfname=new JTextField();
      tfname.setBounds(200,150,150,30);
      add(tfname);
      
      
//  Fathers name
      JLabel lblfname=new JLabel("Father's Name");
      lblfname.setBounds(400,150,200,30 );
      lblfname.setFont(new Font("serif", Font.BOLD ,20));
      add(lblfname);
      
      tffname=new JTextField();
      tffname.setBounds(600,150,150,30 );
      add(tffname);
      
      
//  Roll no
      JLabel lblempid=new JLabel("Employee Id ");
      lblempid.setBounds(50,200,200,30 );
      lblempid.setFont(new Font("serif", Font.BOLD ,20));
      add(lblempid);
      
      labelempid=new JLabel("100  "+first4);
      labelempid.setBounds(200,200,200,30 );
      labelempid.setFont(new Font("serif", Font.BOLD ,20));
      add(labelempid);
     
      
//  DOB
      JLabel lbldob=new JLabel("Date of Birth ");
      lbldob.setBounds(400,200,200,30 );
      lbldob.setFont(new Font("serif", Font.BOLD ,20));
      add(lbldob);
      
      dcdob=new JDateChooser();
      dcdob.setBounds(600,200,150,30);
      add(dcdob);
      
      
//  Address    
      JLabel lbladdress=new JLabel("Address");
      lbladdress.setBounds(50,250,200,30 );
      lbladdress.setFont(new Font("serif", Font.BOLD ,20));
      add(lbladdress);
       
      tfaddress=new JTextField();
      tfaddress.setBounds(200,250,150,30);
      add(tfaddress);

      
//  Phone number
      JLabel lblphone=new JLabel("Phone Number");
      lblphone.setBounds(400,250,200,30 );
      lblphone.setFont(new Font("serif", Font.BOLD ,20));
      add(lblphone);
       
      tfphone=new JTextField();
      tfphone.setBounds(600,250,150,30);
      add(tfphone);

      
//  Email id            
      JLabel lblemail=new JLabel("Email Id");
      lblemail.setBounds(50,300,100,30 );
      lblemail.setFont(new Font("serif", Font.BOLD ,20));
      add(lblemail);
       
      tfemail=new JTextField();
      tfemail.setBounds(200,300,150,30);
      add(tfemail);

      
//  Claas X %     
      JLabel lblclassX=new JLabel("Class X (%)");
      lblclassX.setBounds(400,300,200,30 );
      lblclassX.setFont(new Font("serif", Font.BOLD ,20));
      add(lblclassX);
       
      tfclassX=new JTextField();
      tfclassX.setBounds(600,300,150,30);
      add(tfclassX);

      
//  Class XII %
      JLabel lblclassXII=new JLabel("Class XII (%)");
      lblclassXII.setBounds(50,350,100,30 );
      lblclassXII.setFont(new Font("serif", Font.BOLD ,20));
      add(lblclassXII);
       
      tfclassXII=new JTextField();
      tfclassXII.setBounds(200,350,150,30);
      add(tfclassXII);
    
      
//  Aadhar  
      JLabel lblaadhar=new JLabel("Aadhar Card Number");
      lblaadhar.setBounds(400,350,200,30 );
      lblaadhar.setFont(new Font("serif", Font.BOLD ,20));
      add(lblaadhar);
       
      tfaadhar=new JTextField();
      tfaadhar.setBounds(600,350,150,30);
      add(tfaadhar);

//  Qualification
      JLabel lblqualification=new JLabel("Qualification");
      lblqualification.setBounds(50,400,100,30 );
      lblqualification.setFont(new Font("serif", Font.BOLD ,20));
      add(lblqualification);
      
      String qualification[]={ "M. Tech","MSC","PHD","BSc"};
      cbqualification= new JComboBox(qualification);
      cbqualification.setBounds(200,400,150,30);
      cbqualification.setBackground(Color.WHITE);
      add(cbqualification);
      
       
//  Department
      JLabel lbldepartment=new JLabel("Department");
      lbldepartment.setBounds(400,400,100,30 );
      lbldepartment.setFont(new Font("serif", Font.BOLD ,20));
      add(lbldepartment);
      
      String department[]={"DESH","Computer ","Mechanical","IT","ENTC","Chemical","Instrumentation"}; 
      cbdepartment = new JComboBox(department);
      cbdepartment.setBounds(600,400,150,30);
      cbdepartment.setBackground(Color.WHITE);
      add(cbdepartment);
      
//  Submit Button 
        submit = new JButton("Submit");
        submit.setBounds(345, 500, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

//  Cancel Button 
        cancel = new JButton("Cancel");
        cancel.setBounds(345, 560, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
      
      setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==submit){
       String name=tfname.getText();
       String fname=tffname.getText();
       String rollno=labelempid.getText(); 
       String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
       String address=tfaddress.getText();
       String phone=tfphone.getText();
       String email=tfemail.getText();
       String classX=tfclassX.getText();
       String classXII=tfclassXII.getText();
       String aadhar=tfaadhar.getText();
       String course=(String)cbqualification.getSelectedItem();
       String branch=(String)cbdepartment.getSelectedItem();
       
       
       try{
       String query="insert into teacher values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+classX+"','"+classXII+"','"+aadhar+"','"+course+"','"+branch+"') ";
       
       Conn con=new Conn();
       con.s.executeUpdate(query);
       
       JOptionPane.showMessageDialog(null,"Teacher detail inserted successfully ");
       setVisible(false);
       
       }catch(Exception e){
       e.printStackTrace();
       }
    }
    else{
        setVisible(false);
    }
    
    
    }

    public static void main(String[] args) {
        new AddTeacher();
    }
}