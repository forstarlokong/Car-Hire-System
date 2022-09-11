//importing the required classes and packages.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

//create CreateLoginForm class to create loin form
//class extends JFrame to create a window where our component add
//class implements ActionListener to perform an action (
class CreateLoginForm extends JFrame implements ActionListener{
    //initialize button, panel, label and text field.
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textField1, textField2;

    //calling constructor
    CreateLoginForm(){
        //create label for username
        userLabel = new JLabel();
        userLabel.setText("Username");      //set label value for textField1

        //create text field to get username from the user
        textField1 = new JTextField(15); //This sets the length of the field to 15 characters

        //create label for password
        passLabel = new JLabel();
        passLabel.setText("Password");      //sets the label value to Password

        //create text field to get Password from the user
        textField2 = new JPasswordField(15); //This sets the length of the field to 15 characters

        //create submit button
        b1 = new JButton("SUBMIT");     //SETS the label to a button

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(3,1));
        newPanel.add(userLabel);    //set username label to panel
        newPanel.add(textField1);   //set username text field to panel
        newPanel.add(passLabel);    //set password label to panel
        newPanel.add(textField2);   //set password text field to panel
        newPanel.add(b1);           //set button label to panel

        //set border to panel
        add(newPanel, BorderLayout.CENTER);

        //perform action on the button click
        b1.addActionListener(this); //add action listener to the button  b1
        setTitle("LOGIN FORM");     //Set title to LOGIN FORM
    }
    //define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
    {
        String userValue = textField1.getText();        //get user entered username from the textField1
        String passValue = textField2.getText();        //get user entered password from the textField2

        //check whether the credentials are authentic or not  to allow for logging in.
        if (userValue.equals("lokongpeter08@gmail.com") && passValue.equals("ooptestproj001")) {    //if authentic,such that the username
                                                                                                    // is "lokongpeter08@gmail.com" and the password
                                                                                                    // is "ooptestproj001", navigate user to a new page

            System.out.println("Login Successfully! ");
            //create instance of the NewPage
            NewPage page = new NewPage();

            //make page visible to the user
            page.setVisible(true);

            //create a welcome label and set it to the new page
            JLabel wel_label = new JLabel("Congratulations and Welcome: "+userValue);
            page.getContentPane().add(wel_label);
        }
        else{
            //show error message
            System.out.println("The username or password you have entered is incorrect! ");
        }
    }
}
//create the main class
class LoginForm {
    //main() method starts
    public static void main(String arg[]){
        try {
            //Create instance of the CreateLoginForm
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(300,120);  //set size of the frame
            form.setVisible(true);  //make form visible to the user
        }
        catch(Exception e)
        {
            //handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
