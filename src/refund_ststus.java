import javax.swing.*;
import java.awt.*;
import java.awt.event.*;













public class refund_ststus {
    public void main() {
        JFrame f = new JFrame("AIR JET");
        f.getContentPane().setBackground(Color.pink);
        final JLabel label = new JLabel();

        label.setBounds(20, 150, 200, 50);
        JLabel l1 = new JLabel("Pnr No:");
        l1.setBounds(20, 20, 80, 30);
        final JTextField text = new JTextField();
        text.setBounds(100, 20, 80, 30);
        JButton b = new JButton("Enter");
        b.setBounds(100, 120, 80, 30);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        JButton b8 = new JButton("Previous");
        b8.setBounds(5, 200, 100, 30);
        b8.setBackground(Color.black);
        b8.setForeground(Color.white);
        JButton b88 = new JButton("Logout");
        b88.setBounds(158, 200, 100, 30);
        b88.setBackground(Color.black);
        b88.setForeground(Color.white);
        f.add(l1);
        f.add(b);
        f.add(text);
        f.add(b8);
        f.add(b88);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                multiple_pageoption obj5 = new multiple_pageoption();
                obj5.main();
            }
        });
        b88.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();

            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Amount will be refunded in 3days!");
            }
        });



    }
}