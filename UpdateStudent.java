
package college_management_system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateStudent extends JFrame implements ActionListener{
    
    JTextField tfaddress,tfphone,tfemail,tfcourse,tfbranch;
    JLabel labelrollno;
    JButton update,cancel;
    Choice crollno;
    
    UpdateStudent()
    {
      setSize(900,700);
      setLocation(250, 40);
      setLayout(null);
      
      
//  Update student details
      JLabel heading=new JLabel("Update Student Details");
      heading.setBounds(50,10,500,50 );
      heading.setFont(new Font("serif", Font.BOLD ,35));
      add(heading); 
    
      JLabel lblrollno = new JLabel("Select Roll Number");
      lblrollno.setBounds(50, 100, 200, 20);
      lblrollno.setFont(new Font("serif", Font.PLAIN,20));
      add(lblrollno);

        crollno = new Choice();
        crollno.setBounds(250, 100, 200, 20);
        add(crollno);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


      
//  Name
      JLabel lblname=new JLabel("Name");
      lblname.setBounds(50,150,100,30 );
      lblname.setFont(new Font("serif", Font.BOLD ,20));
      add(lblname);
       
      JLabel labelname=new JLabel();
      labelname.setBounds(200,150,150,30);
      add(labelname);
      
      
//  Fathers name
      JLabel lblfname=new JLabel("Father's Name");
      lblfname.setBounds(400,150,100,30 );
      lblfname.setFont(new Font("serif", Font.BOLD ,20));
      add(lblfname);
      
      JLabel labelfname=new JLabel();
      labelfname.setBounds(600,150,150,30);
      add(labelfname);
      
      
//  Roll no
      lblrollno=new JLabel("Roll Number ");
      lblrollno.setBounds(50,200,200,30 );
      lblrollno.setFont(new Font("serif", Font.BOLD ,20));
      add(lblrollno);
      
       labelrollno=new JLabel();
      labelrollno.setBounds(200,200,200,30 );
      labelrollno.setFont(new Font("serif", Font.BOLD ,20));
      add(labelrollno);
     
      
//  DOB
      JLabel lbldob=new JLabel("Date of Birth ");
      lbldob.setBounds(400,200,200,30 );
      lbldob.setFont(new Font("serif", Font.BOLD ,20));
      add(lbldob);
      
      JLabel labeldob=new JLabel();
      labeldob.setBounds(600,200,150,30);
      add(labeldob);
      
      
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
       
      JLabel labelX=new JLabel();
      labelX.setBounds(600,300,150,30);
      add(labelX);

      
//  Class XII %
      JLabel lblclassXII=new JLabel("Class XII (%)");
      lblclassXII.setBounds(50,350,100,30 );
      lblclassXII.setFont(new Font("serif", Font.BOLD ,20));
      add(lblclassXII);
       
     JLabel labelXII=new JLabel();
      labelXII.setBounds(600,300,150,30);
      add(labelXII);
    
      
//  Aadhar  
      JLabel lblaadhar=new JLabel("Aadhar Card Number");
      lblaadhar.setBounds(400,350,200,30 );
      lblaadhar.setFont(new Font("serif", Font.BOLD ,20));
      add(lblaadhar);
       
      JLabel labelaadhar=new JLabel();
      labelaadhar.setBounds(600,350,150,30);
      add(labelaadhar);

//  Course 
      JLabel lblcourse=new JLabel("Course");
      lblcourse.setBounds(50,400,100,30 );
      lblcourse.setFont(new Font("serif", Font.BOLD ,20));
      add(lblcourse);
      
      
      tfcourse = new JTextField();
      tfcourse.setBounds(200,400,150,30);
      add(tfcourse);
      
       
//  Branch
      JLabel lblbranch=new JLabel("Branch");
      lblbranch.setBounds(400,400,100,30 );
      lblbranch.setFont(new Font("serif", Font.BOLD ,20));
      add(lblbranch);
      
     
      tfbranch = new JTextField();
      tfbranch.setBounds(600,400,150,30);
      add(tfbranch);

      
      try{
       Conn c=new Conn();
       String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
       ResultSet rs=c.s.executeQuery(query);
       while(rs.next()){
       labelname.setText(rs.getString("name"));
       labelfname.setText(rs.getString("fname"));
       labeldob.setText(rs.getString("dob"));
       tfaddress.setText(rs.getString("address"));
       tfphone.setText(rs.getString("phone"));
       tfemail.setText(rs.getString("email"));
       labelX.setText(rs.getString("class_x"));
       labelXII.setText(rs.getString("class_xii"));
       labelaadhar.setText(rs.getString("aadhar"));
       labelrollno.setText(rs.getString("rollno"));
       tfcourse.setText(rs.getString("course"));
       tfbranch.setText(rs.getString("branch"));
       }
      }
      catch(Exception e){
          e.printStackTrace();
      }
      
      crollno.addItemListener(new ItemListener(){
      public void itemStateChanged(ItemEvent ie){
      
          try{
       Conn c=new Conn();
       String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
       ResultSet rs=c.s.executeQuery(query);
       while(rs.next()){
       labelname.setText(rs.getString("name"));
       labelfname.setText(rs.getString("fname"));
       labeldob.setText(rs.getString("dob"));
       tfaddress.setText(rs.getString("address"));
       tfphone.setText(rs.getString("phone"));
       tfemail.setText(rs.getString("email"));
       labelX.setText(rs.getString("class_x"));
       labelXII.setText(rs.getString("class_xii"));
       labelaadhar.setText(rs.getString("aadhar"));
       labelrollno.setText(rs.getString("rollno"));
       tfcourse.setText(rs.getString("course"));
       tfbranch.setText(rs.getString("branch"));
       }
      }
      catch(Exception e){
          e.printStackTrace();
      }
      }
       
    });
    
      
//  Updtate Button 
        update = new JButton("Update");
        update.setBounds(345, 560, 120, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        update.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(update);
        
              
//  Cancel Button 
        cancel = new JButton("Cancel");
        cancel.setBounds(345, 500, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

      
      setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==update){
       String rollno=labelrollno.getText(); 
       String address=tfaddress.getText();
       String phone=tfphone.getText();
       String email=tfemail.getText();
       String course=(String)tfcourse.getText();
       String branch=(String)tfbranch.getText();
       
       
       try{
       String query="update student set address='"+address+"',phone='"+phone+"',email='"+email+"',course='"+course+"',branch='"+branch+"'  where rollno='"+rollno+"'";
       
       Conn con=new Conn();
       con.s.executeUpdate(query);
       
       JOptionPane.showMessageDialog(null,"Student detail updated successfully ");
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
        new UpdateStudent();
    }
}