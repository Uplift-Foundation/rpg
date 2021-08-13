package com.senecafoundation;

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
    public HalfElf(String name, int age, String sex, int conjuration, int restoration)
    {
        super(name, age, sex);
        this.conjurationBonus = conjuration;
        this.restorationBonus = restoration;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " Conjuration: " + conjurationBonus + " Restoration: " + restorationBonus);
    }
}
