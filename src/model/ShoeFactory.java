package model;

import java.util.ArrayList;

public class ShoeFactory
{
    private ArrayList<Shoe> shoeList;
    private int shoeResourceCount;

    public ShoeFactory()
    {
        shoeList = new ArrayList<Shoe>();
        shoeResourceCount = 100;
    }

    public ArrayList<Shoe> getShoeList()
    {
        return shoeList;
    }

    public void setShoeList(ArrayList<Shoe> shoeList)
    {
        this.shoeList = shoeList;
    }

    public int getShoeResourceCount()
    {
        return shoeResourceCount;
    }

    public void setShoeResourceCount(int shoeResourceCount)
    {
        this.shoeResourceCount = shoeResourceCount;
    }

    public boolean makeShoe(String brand, double size)
    {
        boolean canMake = false;

        return canMake;
    }
}
