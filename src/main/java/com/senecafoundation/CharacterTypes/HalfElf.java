package com.senecafoundation.CharacterTypes;

import com.senecafoundation.DataHandler.IDataHandler;

public class HalfElf extends Character 
{
    //Variables
    private int conjurationBonus;
    private int restorationBonus;

    //Encapsulation
    public int getConjurationBonus()
    {
        return this.conjurationBonus;
    }
    public void setConjurationBonus(int newConjurationBonus)
    {
        this.conjurationBonus = newConjurationBonus;
    }

    public int getRestorationBonus()
    {
        return this.restorationBonus;
    }
    public void setRestorationBonus(int newRestorationBonus)
    {
        this.restorationBonus = newRestorationBonus;
    }

    //Constructor
    public HalfElf(String name, int age, String sex, int conjuration, int restoration, IDataHandler dataHandler)
    {
        super(name, age, sex, dataHandler, 40, 80, 50);
        this.conjurationBonus = conjuration;
        this.restorationBonus = restoration;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " Conjuration: " + conjurationBonus + " Restoration: " + restorationBonus);
    }

    public String toString() 
    {
        return super.toString() + "," + this.getConjurationBonus() + "," + this.getRestorationBonus();
    }
   
}
