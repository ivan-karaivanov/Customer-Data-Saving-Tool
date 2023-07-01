import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerDataSavingTool {
    private JTextField nameField;
    private JTextField emailField;
    private JSpinner ageSpinner;
    private JComboBox<String> locationCombo;

    public CustomerDataSavingTool() {
        createGUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CustomerDataSavingTool();
            }
        });
    }

    private void createGUI() {
        // Create components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        JLabel ageLabel = new JLabel("Age:");
        ageSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 150, 1));
        JLabel locationLabel = new JLabel("Location:");
        locationCombo = new JComboBox<>(new String[]{"USA", "Canada", "Mexico", "Other"});
        JButton submitButton = new JButton("Submit");

        // Create panel and add components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(nameLabel, c);
        c.gridx = 1;
        panel.add(nameField, c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(emailLabel, c);
        c.gridx = 1;
        panel.add(emailField, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(ageLabel, c);
        c.gridx = 1;
        panel.add(ageSpinner, c);
        c.gridx = 0;
        c.gridy = 3;
        panel.add(locationLabel, c);
        c.gridx = 1;
        panel.add(locationCombo, c);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        panel.add(submitButton, c);

        // Create frame and add panel
        JFrame frame = new JFrame("Customer Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        // Handle submit button click
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                int age = (int) ageSpinner.getValue();
                String location = (String) locationCombo.getSelectedItem();

                if (age > 100) {
                    JOptionPane.showMessageDialog(frame, "Invalid age! Please enter a value less than or equal to 100.");
                    return;
                }

                String message = "Customer data:\n" +
                        "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Age: " + age + "\n" +
                        "Location: " + location;
                JOptionPane.showMessageDialog(frame, message);
            }
        });
    }
}