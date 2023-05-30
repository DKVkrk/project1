import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

class Passenger {
    private String name;
    private int phoneno;

    public Passenger(String name, int phoneno) {
        this.name = name;
        this.phoneno = phoneno;

    }

    public String getName() {
        return name;
    }

    public int getphoneno() {
        return phoneno;
    }

}

class Flight {

    private String source;
    private String destination;

    private List<Passenger> passengerList;

    public Flight(String source, String destination) {

        this.source = source;
        this.destination = destination;

        this.passengerList = new ArrayList<>();
    }


    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}










    public class air_booking {
    public void main(){
        JFrame f=new JFrame("AIR JET");
        f.getContentPane().setBackground(Color.lightGray);


        final JLabel label = new JLabel();
        label.setBounds(20,150, 200,50);
        JLabel l1=new JLabel("flight choosing");
        l1.setBounds(600,5, 250,150);

        JLabel l2=new JLabel("Source:");
        l2.setBounds(100,95, 80,45);
        final JTextField text1 = new JTextField();
        text1.setBounds(150,92, 80,45);
        JLabel l3=new JLabel("Destination:");
        l3.setBounds(100,100, 180,140);
        final JTextField text2 = new JTextField();
        text2.setBounds(150,158, 80,45);


        JButton b18 = new JButton("OK");
        b18.setBounds(25,550, 150,50);
        b18.setBackground(Color.black);
        b18.setForeground(Color.white);
        JButton b = new JButton("Previous");
        b.setBounds(5,700, 100,30);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        JLabel l7=new JLabel("Seats:");
        l7.setBounds(100,360, 240,160);



        f.add(l1);f.add(l2);f.add(l3);f.add(l7);f.add(text1);f.add(text2);f.add(b);f.add(b18);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                multiple_pageoption obj6 = new multiple_pageoption();
                obj6.main();
            }
        });
//        f.dispose();
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                passenger_details obj99 = new passenger_details();
                obj99.main();


            }
        });








    }
}
