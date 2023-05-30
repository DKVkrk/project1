import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Scanner.*;
// PNRStatusChecker.java

// PNRStatusChecker class representing the PNR status checker

    // Main method to test the PNRStatusChecker class
class pnr{
    void checkstatus(int pnr){
        System.out.println(pnr);
    }

    }


    public class booking_status {
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
            JButton b9 = new JButton("Previous");
            b9.setBounds(5, 200, 100, 30);
            b9.setBackground(Color.black);
            b9.setForeground(Color.white);
            JButton b88 = new JButton("Logout");
            b88.setBounds(98,200, 100,30);
            b88.setBackground(Color.black);
            b88.setForeground(Color.white);



            f.add(l1);
            f.add(b);
            f.add(text);
            f.add(b9);
            f.add(b88);

            f.setSize(300, 300);
            f.setLayout(null);
            f.setVisible(true);


            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.dispose();
                    multiple_pageoption obj105 = new multiple_pageoption();
                    obj105.main();
                }
            });
            b88.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.dispose();

                }
            });


            Scanner sc = new Scanner(System.in);
            int pnr = sc.nextInt();
            pnr pr = new pnr();
            pr.checkstatus(pnr);


        }
    }



