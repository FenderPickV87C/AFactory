package view;

import.controller.FactoryController;

import javax.swing.*;

public class FactoryPanel extends JPanel
{
    private JLabel sizeLabel;
    private JLabel brandlabel;

    private JTextField sizeField;
    private JTextField brandField;

    private JButton makeShoe;
    private SpringLayout appLayout;

    private FactoryController factoryApp;

    private void setupListeners()
    {
        makeShoe.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent click)
            {
                String brand - brandField.getText();
                if (checkDouble(sizeField.getText()))
                {
                    double size = Double.parseDouble(sizeField.getText());

                    factoryApp.getMyFactory().makeShoe(brand, size);
                }
            }
        });
    }

    private boolean checkDouble(String input)
    {
        try
        {
            double output = double.parseDouble(input);
            isDouble = true;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Please type a valid number, uneducated swine.")
        }

    }
}
