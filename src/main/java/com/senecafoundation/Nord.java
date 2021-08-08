package com.senecafoundation;

public class Nord extends Player 
{
    //Variables
    private int twoHandedSwordBonus;
    private int speechBonus;

    //Encapsulation
    public int getTwoHandedSwordBonus()
    {
        return this.twoHandedSwordBonus;
    }
    public void setTwoHandedSwordBonus(int newTwoHandedSwordBonus)
    {
        this.twoHandedSwordBonus = newTwoHandedSwordBonus;
    }

    public int getSpeechBonus()
    {
        return this.speechBonus;
    }
    public void setSpeechBonus(int newSpeechBonus)
    {
        this.speechBonus = newSpeechBonus;
    }

    //Constructor
    public Nord(String name, int age, String sex, int twoHandedSwordB, int speechB)
    {
        super(name, age, sex);
        this.twoHandedSwordBonus = twoHandedSwordB;
        this.speechBonus = speechB;
    }

    //Method
    public String PlayerDetails() //override
    {
        return  (super.toString() + " Two-Handed: " + twoHandedSwordBonus + " Speech: " + speechBonus);
    }
}
