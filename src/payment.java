import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;
public class payment extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField cardNumberField;
    private JTextField cardTypeField;
    private JPasswordField cvvField;
    private JButton submitButton;


    public payment() {
        setTitle("Payment Page");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));
        getContentPane().setBackground(Color.PINK);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField();

        JLabel cardTypeLabel = new JLabel("Card Type:");
        cardTypeField = new JTextField();

        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JPasswordField();

        JTextArea textArea = new JTextArea("PAYMENT = $10000");
        textArea.setEditable(false); // Set the text area as read-only








        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
       submitButton .setBackground(Color.black);
        submitButton.setForeground(Color.white);





        add(nameLabel);
        add(nameField);
        add(cardNumberLabel);
        add(cardNumberField);
        add(cardTypeLabel);
        add(cardTypeField);
        add(cvvLabel);
        add(cvvField);
        add(new JLabel()); // Empty label for spacing
        add(submitButton);
        add(textArea);




        setVisible(true);
    }

    public void main() {
        new payment();
    }
    private void showPaymentSuccess(double amount) {
        JFrame successFrame = new JFrame("Payment Successful");
        successFrame.setSize(300, 200);
        successFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        successFrame.setLayout(new FlowLayout());

        JLabel successLabel = new JLabel("Payment Successful!");
        JLabel amountLabel = new JLabel("Payment Amount: $" + amount);

        successFrame.add(successLabel);
        successFrame.add(amountLabel);

        successFrame.setVisible(true);
    }








    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String cardNumber = cardNumberField.getText();
            String cardType = cardTypeField.getText();
            String cvv = new String(cvvField.getPassword());
            double amount = 10000;

            // Process the payment
            if (isValidInput(name, cardNumber, cardType, cvv)) {
                showPaymentSuccess(amount);
                dispose(); // come out from the page


            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        String pnr = generateUniquePNR();

        // Perform any necessary booking operations, e.g., store the booking details in a database

        // Display the PNR to the user
        JOptionPane.showMessageDialog(null, "Your PNR: " + pnr, "Booking Confirmation", JOptionPane.INFORMATION_MESSAGE);

    }
    private String generateUniquePNR() {
        // Generate a unique identifier using UUID
        return UUID.randomUUID().toString();
    }





    private boolean isValidInput(String name, String cardNumber, String cardType, String cvv) {
        // Add your validation logic here
        return name.length() > 0 && cardNumber.length() == 16 && cardType.length() > 0 && cvv.length() == 3;
    }

}
