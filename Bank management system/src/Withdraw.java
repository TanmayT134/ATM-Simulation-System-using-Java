import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Withdraw extends JFrame implements ActionListener{

    JTextField amount;
    JButton withdraw, back;
    String pinnumber;

    Withdraw(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter amount you want to withdraw");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        amount = new JTextField();
        amount.setBounds(210, 350, 250, 25);
        amount.setFont(new Font("System", Font.BOLD, 16));
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        getContentPane().setBackground(Color.WHITE);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == withdraw) {
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            } else {
                try {
                    Conn c = new Conn();
                    String query = "INSERT INTO bank VALUES('"+pinnumber+"', '"+date+"', 'Withdraw', '"+number+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdrawed Successfully!");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);;
        }
    }

    public static void main(String[] args) {
        new Withdraw("");
    }    
}
