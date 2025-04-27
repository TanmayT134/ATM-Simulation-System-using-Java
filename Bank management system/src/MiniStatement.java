import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {
    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");
        setLayout(null);

        JLabel bank = new JLabel("COSMOS Co-operative Bank");
        bank.setBounds(100, 20, 200, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel mini = new JLabel();
        mini.setBounds(20, 150, 400, 200);
        add(mini);

        JLabel balance = new JLabel();
        balance.setBounds(20,400, 300, 20);
        add(balance);


        try {
            Conn c = new Conn();
            ResultSet rs= c.s.executeQuery("SELECT  * FROM login WHERE pin = '"+pinnumber+"'");
            while (rs.next()) {
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));

            }
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Conn c = new Conn();
            int bal = 0;
            ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current account balance is Rs " + bal);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
