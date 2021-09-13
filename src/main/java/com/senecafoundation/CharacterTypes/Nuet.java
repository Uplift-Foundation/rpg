package com.senecafoundation.CharacterTypes;
import com.senecafoundation.DataHandler.IDataHandler;

public class Nuet extends Character 
{
    //Variables
    private int lockPickingBonus;
    private int lightArmorBonus;

    //Encapsulation
    public int getLockPickingBonus()
    {
        return this.lockPickingBonus;
    }
    public void setLockPickingBonus(int newLockPickingBonus)
    {
        this.lockPickingBonus = newLockPickingBonus;
    }

    public int getLightArmorBonus()
    {
        return this.lightArmorBonus;
    }
    public void setLightArmorBonus(int newLightArmorBonus)
    {
        this.lightArmorBonus = newLightArmorBonus;
    }

    //Constructor
    public Nuet(String name, int age, String sex, int lockPicking, int lightArmor, IDataHandler dataHandler)
    {
        super(name, age, sex, dataHandler, 50, 50, 50);
        this.lockPickingBonus = lockPicking;
        this.lightArmorBonus = lightArmor;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() +  " Lockpicking: " + lockPickingBonus + " Light Armor: " + lightArmorBonus);
    }

    public String toString() 
    {
        return super.toString() + "," + this.getLockPickingBonus() + "," + this.getLightArmorBonus();
    }
}

