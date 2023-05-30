import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register_page extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submitButton;


    public register_page() {
        setTitle("Register page");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8,2));
        getContentPane().setBackground(Color.ORANGE);


        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel AgeLabel= new JLabel("Age:");
        ageField = new JTextField();

        JLabel UsernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel PasswordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();












        submitButton = new JButton("register");
        submitButton.addActionListener(this);
       submitButton .setBackground(Color.black);
        submitButton.setForeground(Color.white);

        add(nameLabel);
        add(nameField);
        add(AgeLabel);
        add(ageField);
        add(UsernameLabel);
        add(usernameField);
        add(PasswordLabel);
        add(passwordField);
        add(new JLabel()); // Empty label for spacing
        add(submitButton);




        setVisible(true);
    }

    public void main() {
        new register_page();
    }
    private void showregisterSucces(String username,String password) {
        JFrame successFrame = new JFrame("Register Succesflly");
        successFrame.setSize(300, 200);
        successFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        successFrame.setLayout(new FlowLayout());

        JLabel successLabel = new JLabel("Register Successful!");
        JLabel amountLabel = new JLabel( username+password);

        successFrame.add(successLabel);
        successFrame.add(amountLabel);

        successFrame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {

            String username =usernameField.getText();
            String name =nameField.getText();


            String password = new String(passwordField.getPassword());


            // Process the payment
            if (isValidInput(name,username,password)) {
                showregisterSucces(username,password);

                dispose(); // come out from the page




            } else {
                JOptionPane.showMessageDialog(this, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean isValidInput(String name, String username, String password) {
        // Add your validation logic here
        return name.length() > 0 && username.length()>0 && password.length()>0;
    }
}