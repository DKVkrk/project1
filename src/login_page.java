import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// User class to represent a user
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

// AirlineReservationSystem class to handle the reservation system operations
class AirlineReservationSystem {
    private Map<String, User> users;

    public  AirlineReservationSystem() {
        users = new HashMap<>();
    }

    public void registerUser1(String username, String password) {
        User user = new User(username, password);
        users.put(username, user);
        System.out.println("User registered successfully.");
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}

// Main class to run the program














public class login_page {
    public static void main(String[]args) {
        JFrame f=new JFrame("AIR JET");
        f.getContentPane().setBackground(Color.CYAN);
        final JLabel label = new JLabel();
        label.setBounds(20,50, 200,40);
       /* JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        f.add(panel);*/


        final JPasswordField value = new JPasswordField();
        value.setBounds(100,75,100,30);
        JLabel l1=new JLabel("Username:");
        l1.setBounds(20,20, 80,30);

        JLabel l2=new JLabel("Password:");
        l2.setBounds(20,75, 80,30);

        final JTextField text = new JTextField();
        text.setBounds(100,20, 80,30);
        JButton b = new JButton("Login");
        b.setBounds(100,220, 80,30);
        b.setBackground(Color.black);
        b.setForeground(Color.white);


        JButton b45 = new JButton("SIGN UP");
        b45.setBounds(60,280, 140,30);
        b45.setBackground(Color.black);
        b45.setForeground(Color.white);




        JButton b1 = new JButton("Terms & conditions");
        b1.setBounds(15,420, 200,30);
        JLabel jlblogo = new JLabel();
        jlblogo.setIcon(new ImageIcon("C:\\Users\\DEVESH\\OneDrive\\Desktop\\java project\\AGATAIR.jpg"));
        jlblogo.setBounds(220,-80,6050,750);



        f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text); f.add(b1);f.add(jlblogo);f.add(b45);
        f.setSize(500,800);
        f.setLayout(null);

        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Username" + " " + text.getText();
                data = data + " ,Password:" + new String(value.getPassword());
                f.dispose();
                multiple_pageoption obj = new multiple_pageoption();
                obj.main();




            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                t_co obj1 = new t_co();
                String s = e.getActionCommand();
                if (s.equals("Login")) {
                    // create a dialog Box
                    JDialog d = new JDialog(f, "AIR JET");

                    // create a label
                    JLabel l = new JLabel("Login Succesfull");

                    d.add(l);

                    // setsize of dialog
                    d.setSize(100, 100);

                    // set visibility of dialog
                    d.setVisible(true);
                }
                Scanner sc = new Scanner(System.in);
                AirlineReservationSystem obja = new AirlineReservationSystem();



                // Register a user
                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                obja.registerUser1(username, password);

                // Login
                System.out.print("Enter username: ");
                username = sc.nextLine();
                System.out.print("Enter password: ");
                password = sc.nextLine();
                obja.login(username, password);



            }
        });
        b45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                register_page obj245 = new register_page();
                obj245.main();
            }
        });






    }
}
