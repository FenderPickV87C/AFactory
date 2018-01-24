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

            }
        });
    }
}
