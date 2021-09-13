package com.senecafoundation.CharacterTypes;

import com.senecafoundation.DataHandler.IDataHandler;
public class DemiHuman extends Character 
{
    //Variables
    private int sneakBonus;
    private int alchemyBonus;

    //Encapsulation
    public int getSneak()
    {
        return this.sneakBonus;
    }
    public void setSneak(int newSneakBonus)
    {
        this.sneakBonus = newSneakBonus;
    }

    public int getAlchemyBonus()
    {
        return this.alchemyBonus;
    }
    public void setAlchemyBonus(int newAlchemyBonus)
    {
        this.alchemyBonus = newAlchemyBonus;
    }

    //Constructor
    public DemiHuman(String name, int age, String sex, int sneak, int alchemy, IDataHandler dataHandler)
    {
        super(name, age, sex, dataHandler, 50, 25, 35);
        this.sneakBonus = sneak;
        this.alchemyBonus = alchemy;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " Sneak: " + sneakBonus + " Alchemy: " + alchemyBonus);
    }

    public String toString() 
    {
        return super.toString() + "," + this.getSneak() + "," + this.getAlchemyBonus();
    }
}
