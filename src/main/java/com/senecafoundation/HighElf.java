package com.senecafoundation;

public class HighElf extends Player 
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
    public HighElf(String name, int age, String sex, int illusion, int enchanting)
    {
        super(name, age, sex);
        this.illusionBonus = illusion;
        this.enchantingBonus = enchanting;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " Illusion: " + illusionBonus + " Enchanting: " + enchantingBonus);
    }
}
