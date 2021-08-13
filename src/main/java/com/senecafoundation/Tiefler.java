package com.senecafoundation;

public class Tiefler extends Character 
{
    //Variables
    private int oneHandedBonus;
    private int archeryBonus;

    //Encapsulation
    public int getOneHandedBonus()
    {
        return this.oneHandedBonus;
    }
    public void setOneHandedBonus(int newOneHandedBonus)
    {
        this.oneHandedBonus = newOneHandedBonus;
    }

    public int getArcheryBonus()
    {
        return this.archeryBonus;
    }
    public void setArcheryBonus(int newArcheryBonus)
    {
        this.archeryBonus = newArcheryBonus;
    }

    //Constructor
    public Tiefler(String name, int age, String sex, int oneHanded, int archery)
    {
        super(name, age, sex);
        this.oneHandedBonus = oneHanded;
        this.archeryBonus = archery;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (this.getName() + " One Handed: " + oneHandedBonus + " Archery: " + archeryBonus);
    }
}
