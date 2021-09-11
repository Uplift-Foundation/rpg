package com.senecafoundation.CharacterTypes;

import com.senecafoundation.DataHandler.IDataHandler;

public class Human extends Character 
{
    //Variables
    private int restorationBonus;
    private int blockBonus;

    //Encapsulation
    public int getRestorationBonus()
    {
        return this.restorationBonus;
    }
    public void setRestorationBonus(int newRestorationBonus)
    {
        this.restorationBonus = newRestorationBonus;
    }

    public int getBlockBonus()
    {
        return this.blockBonus;
    }

    public void setBlockBonus(int newBlockBonus)
    {
        this.blockBonus = newBlockBonus;
    }

    //Constructor
    public Human(String name, int age, String sex, int restoration, int block, IDataHandler dataHandler)
    {
        super(name, age, sex, dataHandler, 50, 50, 70);
        this.restorationBonus = restoration;
        this.blockBonus = block;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " Restoration: " + restorationBonus + " Block: " + blockBonus);
    }
    
    public String toString() 
    {
        // We just realized we could do it this way...
        return super.toString() + "," + this.getRestorationBonus() + "," + this.getBlockBonus();
    }
}
