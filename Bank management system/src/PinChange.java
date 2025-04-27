import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    JButton changeButton, backButton;
    JPasswordField pin, rePin;
    String pinumber;
    public PinChange(String pinnumber) {
        this.pinumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Change Your Pin");
        text.setBounds(250, 300, 500, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        JLabel pinText = new JLabel("New Pin:");
        pinText.setBounds(165, 350, 180, 25);
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("System", Font.BOLD, 16));
        image.add(pinText);

        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 350, 180, 25);
        image.add(pin);

        JLabel rePinText = new JLabel("Re-enter New Pin:");
        rePinText.setBounds(165, 390, 180, 25);
        rePinText.setForeground(Color.WHITE);
        rePinText.setFont(new Font("System", Font.BOLD, 16));
        image.add(rePinText);

        rePin = new JPasswordField();
        rePin.setFont(new Font("Raleway", Font.BOLD, 25));
        rePin.setBounds(330, 390, 180, 25);
        image.add(rePin);

        changeButton = new JButton("CHANGE");
        changeButton.setBounds(355, 485, 150, 30);
        changeButton.addActionListener(this);
        image.add(changeButton);

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
            new Transactions(pinumber).setVisible(true);
        } else if (ae.getSource() == changeButton) {
            try{
                String npin = pin.getText();
                String rpin = rePin.getText();
                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter New Pin");
                    return;
                }
                if (rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter New Pin");
                    return;
                }
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Pin does not match\nRe-enter correct Pin");
                    return;
                }

                Conn c = new Conn();
                String query1 = "UPDATE bank SET pin = '"+rpin+"' WHERE pin = '"+pinumber+"'";
                String query2 = "UPDATE login SET pin = '"+rpin+"' WHERE pin = '"+pinumber+"'";
                String query3 = "UPDATE signupThree SET pin = '"+rpin+"' WHERE pin = '"+pinumber+"'";

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "Pin changed successfully!");

                setVisible(false);
                new Transactions(rpin).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new PinChange("");
    }
}
