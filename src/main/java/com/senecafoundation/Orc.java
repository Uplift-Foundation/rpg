package com.senecafoundation;

class Orc extends Player
{
    //Variables
    private int heavyArmorBonus;
    private int smithingBonus;
    

    //Encapsulation
    public int getHeavyArmorBonus()
    {
        return this.heavyArmorBonus;
    }
    public void setHeavyAmorBonus(int newHeavyArmorBonus)
    {
        this.heavyArmorBonus = newHeavyArmorBonus;
    }

    public int getSmithingBonus()
    {
        return this.smithingBonus;
    }
    public void setSmithingBonus(int newSmithingBonus)
    {
        this.smithingBonus = newSmithingBonus;
    }

    
    //Constructor
    public Orc(String name, int age, String sex, int heavyArmor, int smithing)
    {
        super(name, age, sex);
         this.heavyArmorBonus = heavyArmor;
         this.smithingBonus = smithing;
    }

    public String PlayerDetails() //override
    {
        return  (this.getName() + " Heavy Armor: " + heavyArmorBonus + " Smithing: " + smithingBonus);
    }
}




