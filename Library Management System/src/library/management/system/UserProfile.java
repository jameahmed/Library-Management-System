
package library.management.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserProfile extends JFrame implements ActionListener
{
    JLabel firstName,lastName,userName,password,confirmPassword,emailId,contactNo;
    JTextField firstNameTxt,lastNameTxt,userNameTxt,passwordTxt,confirmPasswordTxt,emailIdTxt,contactNoTxt;
    JButton ok;
    
    String un;
    
    public UserProfile(String un)
    {
        super("User Profile");
        
        this.un = un;
        
	firstName = new JLabel("First Name:");
	firstName.setBounds(80,10,80,20);
	add(firstName);
        
	firstNameTxt=new JTextField();
	firstNameTxt.setBounds(200,10,150,20);
	firstNameTxt.setBackground(Color.white);
	add(firstNameTxt);
        
        lastName = new JLabel("Last Name:");
	lastName.setBounds(80,40,80,20);
	add(lastName);
		
	lastNameTxt = new JTextField();
	lastNameTxt.setBounds(200,40,150,20);
	lastNameTxt.setBackground(Color.white);
	add(lastNameTxt);	
		
	userName = new JLabel("User Name:");
	userName.setBounds(80,70,150,20);
	add(userName);
		
	userNameTxt=new JTextField();
	userNameTxt.setBounds(200,70,150,20);
	userNameTxt.setBackground(Color.white);
	add(userNameTxt);
		
	password = new JLabel("Passward:");
	password.setBounds(80,100,80,20);
	add(password);
		
	passwordTxt = new JTextField();
	passwordTxt.setBounds(200,100,150,20);
	passwordTxt.setBackground(Color.white);
	add(passwordTxt);
		
	confirmPassword = new JLabel("Confirm Passward:");
	confirmPassword.setBounds(80,130,110,20);
	add(confirmPassword);
		
	confirmPasswordTxt=new JTextField();
	confirmPasswordTxt.setBounds(200,130,150,20);
	confirmPasswordTxt.setBackground(Color.white);
	add(confirmPasswordTxt);
		
	emailId=new JLabel("Email Id:");
	emailId.setBounds(80,160,80,20);
	add(emailId);
		
	emailIdTxt = new JTextField();
	emailIdTxt.setBounds(200,160,150,20);
	emailIdTxt.setBackground(Color.white);
	add(emailIdTxt);
		
	contactNo = new JLabel("Contact No:");
	contactNo.setBounds(80,190,80,20);
	add(contactNo);
		
	contactNoTxt=new JTextField();
	contactNoTxt.setBounds(200,190,150,20);
	contactNoTxt.setBackground(Color.white);
	add(contactNoTxt);
	
        ok = new JButton("Ok");
	ok.setBounds(280,220,100,30);
	ok.setBackground(Color.white);
        ok.setForeground(Color.red);
	add(ok);
        
        ok.addActionListener(this);
        
        setLayout(null);
        setSize(480,320);
        setResizable(false);
        setLocation(480,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==ok)
        {
            setVisible(false);
            new UserView(this.un);
        }
    }
}
