package com.senecafoundation.CharacterTypes;
import com.senecafoundation.DataHandler.IDataHandler;
public class Orc extends Character
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
    public Orc(String name, int age, String sex, int heavyArmor, int smithing, IDataHandler datahandler)
    {
        super(name, age, sex, datahandler, 70, 0, 80);
        this.heavyArmorBonus = heavyArmor;
        this.smithingBonus = smithing;
    }

    public String PlayerDetails() //override
    {
        return  (this.getName() + " Heavy Armor: " + heavyArmorBonus + " Smithing: " + smithingBonus);
    }
    public String toString() 
    {
        return super.toString() + "," + this.getHeavyArmorBonus() + "," + this.getSmithingBonus();
    }
}




