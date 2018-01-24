package view;

import javax.swing.*;

public class FactoryFrame extends JFrame
{
    private FactoryPanel myPanel;

    public FactoryFrame(FactoryController factoryApp)
    {
        myPanel = new FactoryPanel();
        setupFrame();
    }

    private void setupFrame()
    {
        this.setSize(400, 400);
        this.setContentPane(myPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
