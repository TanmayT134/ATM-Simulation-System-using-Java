import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{

    JRadioButton saveAcc, currAcc, fdAcc, rdAcc;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM: PAGE-3");
        setLayout(null);

        JLabel accountDetails = new JLabel("Page-3: Account Details");
        accountDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        accountDetails.setBounds(280, 40, 400, 40);
        add(accountDetails);

        JLabel accTypeLabel = new JLabel("Account Type");
        accTypeLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        accTypeLabel.setBounds(100, 140, 200, 30);
        add(accTypeLabel);

        saveAcc = new JRadioButton("Saving Account");
        saveAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        saveAcc.setBackground(Color.WHITE);
        saveAcc.setBounds(100, 180, 250, 20);
        add(saveAcc);

        currAcc = new JRadioButton("Current Account");
        currAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        currAcc.setBackground(Color.WHITE);
        currAcc.setBounds(350, 180, 250, 20);
        add(currAcc);

        fdAcc = new JRadioButton("Fixed Deposit Account");
        fdAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        fdAcc.setBackground(Color.WHITE);
        fdAcc.setBounds(100, 220, 250, 20);
        add(fdAcc);

        rdAcc = new JRadioButton("Recurring Deposit Account");
        rdAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        rdAcc.setBackground(Color.WHITE);
        rdAcc.setBounds(350, 220, 250, 20);
        add(rdAcc);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(saveAcc);
        accountGroup.add(currAcc);
        accountGroup.add(fdAcc);
        accountGroup.add(rdAcc);

        JLabel cardLabel = new JLabel("Card Number:");
        cardLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        cardLabel.setBounds(100, 300, 200, 30);
        add(cardLabel);

        JLabel numberLabel = new JLabel("XXXX-XXXX-XXXX-4184");
        numberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        numberLabel.setBounds(330, 300, 300, 30);
        add(numberLabel);

        JLabel cardInfoDetail = new JLabel("Your 16 digit Card Number");
        cardInfoDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        cardInfoDetail.setBounds(100, 330, 300, 20);
        add(cardInfoDetail);

        JLabel pinLabel = new JLabel("Pin:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        pinLabel.setBounds(100, 370, 200, 30);
        add(pinLabel);

        JLabel pinNumberLabel = new JLabel("XXXX");
        pinNumberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        pinNumberLabel.setBounds(330, 370, 300, 30);
        add(pinNumberLabel);

        JLabel pinInfoDetail = new JLabel("Your 4 digit Pin Number");
        pinInfoDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pinInfoDetail.setBounds(100, 400, 300, 20);
        add(pinInfoDetail);

        JLabel servicesLabel = new JLabel("Services Required");
        servicesLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        servicesLabel.setBounds(100, 450, 400, 30);
        add(servicesLabel);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = "";
            if (saveAcc.isSelected()) {
                accountType = "Saving Account";
            } else if (currAcc.isSelected()) {
                accountType = "Current Account";
            } else if (fdAcc.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (rdAcc.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility = "";
            if (c1.isSelected()) {
                facility = facility + " ATM Card";
            } if (c2.isSelected()) {
                facility = facility + " Internet Banking";
            } if (c3.isSelected()) {
                facility = facility + " Mobile Banking";
            } if (c4.isSelected()) {
                facility = facility + " Email & SMS Alerts";
            } if (c5.isSelected()) {
                facility = facility + " Cheque Book";
            } if (c6.isSelected()) {
                facility = facility + " E-Statement";
            }

            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type Required");
                } else if (c7.isSelected() == false){
                    JOptionPane.showMessageDialog(null, "Please confirm details by clicking the checkbox");
                } else {
                    Conn c = new Conn();
                    String query1 = "INSERT INTO signupThree VALUES('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    c.s.executeUpdate(query1);

                    String query2 = "INSERT INTO login VALUES('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    c.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber+ "\n Pin: " + pinnumber);

                    setVisible(false);
                    new Login().setVisible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
    
}
