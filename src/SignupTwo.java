import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton sYes, sNo, accYes, accNo;
    JComboBox religionBox, categoryBox, incomeBox, educationBox, occupationBox;
    String formno;

    SignupTwo(String formno){
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM: PAGE-2");
        this.formno = formno;

        JLabel additionalDetails = new JLabel("Page-2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);

        String valReligion[] = {"Hindu", "Sikh", "Jain", "Buddhist", "Christian", "Muslim", "Other"};
        religionBox = new JComboBox<>(valReligion);
        religionBox.setBackground(Color.WHITE);
        religionBox.setBounds(300, 140, 400, 30);
        add(religionBox);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        String valCategory[] = {"General", "OBC", "SC", "ST", "NT", "Other"};
        categoryBox = new JComboBox<>(valCategory);
        categoryBox.setBackground(Color.WHITE);
        categoryBox.setBounds(300, 190, 400, 30);
        add(categoryBox);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "< 8,00,000", "upto 10,00,000"};
        incomeBox = new JComboBox<>(valIncome);
        incomeBox.setBackground(Color.WHITE);
        incomeBox.setBounds(300, 240, 400, 30);
        add(incomeBox);

        JLabel educationalLabel = new JLabel("Educational");
        educationalLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationalLabel.setBounds(100, 290, 200, 30);
        add(educationalLabel);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        qualificationLabel.setBounds(100, 315, 200, 30);
        add(qualificationLabel);

        String valEducation[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        educationBox = new JComboBox<>(valEducation);
        educationBox.setBackground(Color.WHITE);
        educationBox.setBounds(300, 315, 400, 30);
        add(educationBox);

        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);

        String valOccupation[] = {"Salaried", "Self-employeed", "Business", "Student", "Retired", "Others"};
        occupationBox = new JComboBox<>(valOccupation);
        occupationBox.setBackground(Color.WHITE);
        occupationBox.setBounds(300, 390, 400, 30);
        add(occupationBox);

        JLabel panLabel = new JLabel("Pan Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel aadharLabel = new JLabel("Addhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel sCitizenLabel = new JLabel("Senior Citizon:");
        sCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        sCitizenLabel.setBounds(100, 540, 200, 30);
        add(sCitizenLabel);

        sYes = new JRadioButton("Yes");
        sYes.setBounds(300, 540, 100, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);

        sNo = new JRadioButton("No");
        sNo.setBounds(450, 540, 100, 30);
        sNo.setBackground(Color.WHITE);
        add(sNo);

        ButtonGroup sCitizenGroup = new ButtonGroup();
        sCitizenGroup.add(sYes);
        sCitizenGroup.add(sNo);

        JLabel existaccLabel = new JLabel("Existing Account:");
        existaccLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existaccLabel.setBounds(100, 590, 200, 30);
        add(existaccLabel);

        accYes = new JRadioButton("Yes");
        accYes.setBounds(300, 590, 100, 30);
        accYes.setBackground(Color.WHITE);
        add(accYes);

        accNo = new JRadioButton("No");
        accNo.setBounds(450, 590, 100, 30);
        accNo.setBackground(Color.WHITE);
        add(accNo);

        ButtonGroup eAccGroup = new ButtonGroup();
        eAccGroup.add(accYes);
        eAccGroup.add(accNo);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String religion = (String) religionBox.getSelectedItem();
        String category = (String) categoryBox.getSelectedItem();
        String income = (String) incomeBox.getSelectedItem();
        String education = (String) educationBox.getSelectedItem();
        String occupation = (String) occupationBox.getSelectedItem();
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String seniorCitizen = null;
        if (sYes.isSelected()) {
            seniorCitizen = "Yes";
        } else if (sNo.isSelected()) {
            seniorCitizen = "No";
        }
        String existingAccount = null;
        if (accYes.isSelected()) {
            existingAccount = "Yes";
        } else if (accNo.isSelected()) {
            existingAccount = "No";
        }
        try{
            Conn c = new Conn();
            String query = "INSERT INTO signupTwo VALUES('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pan+"', '"+aadhar+"', '"+seniorCitizen+"', '"+existingAccount+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
