import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passenger_details {
    public void main(){
        JFrame f = new JFrame("PASSENGER DETAILS");
        f.getContentPane().setBackground(Color.pink);
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 150);
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(20, 20, 80, 30);
        final JTextField text1 = new JTextField();
        text1.setBounds(60, 25, 80, 30);
        JLabel l2 = new JLabel("Age:");

        l2.setBounds(20, 70, 80, 30);
        final JTextField text2 = new JTextField();
        text2.setBounds(60, 80, 80, 30);
        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(20, 120, 80, 30);
        final JTextField text3 = new JTextField();
        text3.setBounds(70, 125, 80, 30);
        JLabel l4 = new JLabel("Email.Id:");
        l4.setBounds(20, 190, 80, 30);
        final JTextField text4 = new JTextField();
        text4.setBounds(70, 190, 80, 30);



        JButton b = new JButton("Enter");
        b.setBounds(180, 320, 80, 30);
        JButton b9 = new JButton("Previous");
        b9.setBounds(20, 320, 100, 30);
        b9.setBackground(Color.black);
        b9.setForeground(Color.white);
        JButton b88 = new JButton("Logout");
        b88.setBounds(348,320, 100,30);
        b88.setBackground(Color.black);
        b88.setForeground(Color.white);



        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.add(b);
        f.add(text1);
        f.add(text2);
        f.add(text3);
        f.add(text4);

        f.add(b9);
        f.add(b88);

        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
        b88.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();

            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                payment obj889 = new payment();
                obj889.main();

            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                air_booking obj108 = new air_booking();
                obj108.main();
            }
        });



    }
}
