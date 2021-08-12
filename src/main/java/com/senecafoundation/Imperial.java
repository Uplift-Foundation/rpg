package com.senecafoundation;

public class Imperial extends Player 
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
    public Imperial(String name, int age, String sex, int restoration, int block)
    {
        super(name, age, sex);
        this.restorationBonus = restoration;
        this.blockBonus = block;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " Restoration: " + restorationBonus + " Block: " + blockBonus);
    }
}
