package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataHandler;

public class Elf extends Character 
{
    //Variables
    private int illusionBonus;
    private int enchantingBonus;

    //Encapsulation
    public int getIllusionBonus()
    {
        return this.illusionBonus;
    }
    public void setIllusionBonus(int newIllusionBonus)
    {
        this.illusionBonus = newIllusionBonus;
    }

    public int getEnchantingBonus()
    {
        return this.enchantingBonus;
    }
    public void setEnchantingBonus(int newEnchantingBonus)
    {
        this.enchantingBonus = newEnchantingBonus;
    }

    //Constructor
    public Elf(String name, int age, String sex, int illusion, int enchanting, IDataHandler dataHandler)
    {
        super(name, age, sex, dataHandler);
        this.illusionBonus = illusion;
        this.enchantingBonus = enchanting;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " Illusion: " + illusionBonus + " Enchanting: " + enchantingBonus);
    }

    public String toString() 
    {
        return super.toString() + "," + this.getIllusionBonus() + "," + this.getEnchantingBonus();
    }
}
