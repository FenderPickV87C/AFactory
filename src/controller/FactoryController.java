package controller;

import view.FactoryFrame;

public class FactoryController
{
    private FactoryFrame appFrame;
    private ShoeFactory myFactory;

    public FactoryController()
    {
        appFrame = new FactoryFrame(this);
    }

    public void start()
    {
        myfactory = new ShoeFactory();
    }

    public FactoryFrame getAppFrame() {
        return appFrame;
    }

    public ShoeFactory getMyFactory() {
        return myFactory;
    }
}
