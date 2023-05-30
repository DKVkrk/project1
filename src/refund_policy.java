import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class refund_policy {
    public void main() {
        JFrame f=new JFrame("AIR JET");
        f.getContentPane().setBackground(Color.ORANGE);

        JTextArea area=new JTextArea("A. Award Tickets on Air India\n" +
                "\n" +
                "If a fully unused award ticket is cancelled and submitted for refundmore than 3 Days (excluding day of departure) before the scheduled departure of the flight, 80% of the FR points used will be refunded. 20% of the points will be deducted as cancellation charge. Non-airline taxes are refundable.\n" +
                "If fully unused award ticket cancelled and submitted for refund less than 3 Days (excluding day of departure) before the scheduled departure of the flight, the ticket is treated asNo-Show with 100% cancellation charge and no FR Points are credited to the FR account. Only non-airline taxes are refundable.\n" +
                "B. Award Ticket on Star Alliance Carrier (other than Air India)\n" +
                "\n" +
                "Coupon fee (DV) INR 1000 applicable on award tickets on Star Alliance member airlines is not refundable. Coupon fee is not applicable on Air India award tickets..\n" +
                "If a fully unused award ticket is cancelled and submitted for refundmore than 3 Days (excluding day of departure) before the scheduled departure of the flight, 80% of the FR points used will be refunded. 20% of the points will be deducted as cancellation charge. Non-airline taxes are refundable.\n" +
                "If fully unused award ticket cancelled and submitted for refund less than 3 Days (excluding day of departure) before the scheduled departure of the flight, the ticket is treated as No-Show with 100% cancellation charge and no FR Points are credited to the FR account. Only non-airline taxes are refundable.\n" +
                "C. Validity of FR points incase of Refund of Award tickets\n" +
                "\n" +
                "In case of Refund of Award/ Redemption tickets , FR points redeemed for the ticket will be re-credited (where applicable) to the FR account into the original validity bucket . This implies that only those redeemed points will be re-credited which have not expired as on date of processing refund.\n" +
                "Expired points will not be credited.\n" +
                "D. Partially used award tickets are not eligible for re-credit of FR Points or refund.");
        area.setEditable(false);

        area.setBounds(4,250, 1795,300);
        JButton b9 = new JButton("Previous");
        b9.setBounds(1,598, 100,30);
        b9.setBackground(Color.black);
        b9.setForeground(Color.white);
        JButton b88 = new JButton("Logout");
        b88.setBounds(1318,598, 100,30);
        b88.setBackground(Color.black);
        b88.setForeground(Color.white);


        f.add(area);f.add(b9);f.add(b88);
        f.setSize(2800,900);
        f.setLayout(null);
        f.setVisible(true);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                multiple_pageoption obj55 = new multiple_pageoption();
                obj55.main();
            }
        });
        b88.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();

            }
        });



    }

}
