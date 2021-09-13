package com.senecafoundation.CharacterTypes;

public class BaseStats 
{  
    //Encapsulation
    private int Health;
    private int Mana;
    private int Stamina;

    //Accessors and Mutators
    public int getHealth()
    {
        return this.Health;
    }
    public void setHealth(int newHealth)
    {
        this.Health = newHealth;
    }

    public int getMana()
    {
        return this.Mana;
    }
    public void setMana(int newMana)
    {
        this.Mana = newMana;
    }
    
    public int getStamina()
    {
        return this.Stamina;
    }
    public void setStamina(int newStamina)
    {
        this.Stamina = newStamina;
    }

    //Construtor
    public BaseStats(int health, int mana, int stamina)
    {
        this.Health = health;
        this.Mana = mana;
        this.Stamina = stamina;
    }

    //Method
    public String PrintStats()
    {
        return("Health: " + Health + "Mana: " + Mana + "Stamina: " + Stamina);
    }
}
