import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;





public class multiple_pageoption {
    public void main() {
        JFrame f=new JFrame("AIR JET");
        f.getContentPane().setBackground(Color.blue);
        final JLabel label = new JLabel();
        label.setBounds(20,150, 200,50);
        JButton b1 = new JButton("Air Booking");
        b1.setBounds(20,18,150,120);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);

        JButton b2 = new JButton("Booking Status");
        b2.setBounds(20,180,150,120);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        JButton b3 = new JButton("Refund Status");
        b3.setBounds(200,18,150,120);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        JButton b4 = new JButton("Refund Policy");
        b4.setBounds(200,180,150,120);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        JButton b5 = new JButton("Refund Policy");
        b5.setBounds(20,80,50,20);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);

        JButton b88 = new JButton("Logout");
        b88.setBounds(5,400, 100,30);
        b88.setBackground(Color.black);
        b88.setForeground(Color.white);

        f.add(b1); f.add(b2); f.add(b3); f.add(b4);f.add(b5);f.add(b88);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                air_booking obj1 = new air_booking();
                obj1.main();






            }


        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                booking_status obj2 = new booking_status();
                obj2.main();

            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                refund_policy obj3 = new refund_policy();
                obj3.main();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                refund_ststus obj4 = new refund_ststus();
                obj4.main();



            }
        });
        b88.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();

            }
        });




        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b88);


//        f.dispose();









    }
}
