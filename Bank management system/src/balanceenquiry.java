import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class balanceenquiry extends JFrame implements ActionListener{
    JButton  backButton;
    String pinnumber;
    balanceenquiry(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        Conn c = new Conn();
        int balance = 0;
        try {
            ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '"+pinnumber+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel text = new JLabel("Your current balance is: "+balance);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setBounds(210, 300, 500, 25);
        image.add(text);

        backButton = new JButton("BACK");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        image.add(backButton);

        getContentPane().setBackground(Color.WHITE);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new balanceenquiry("");
    }
    
}
