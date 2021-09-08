package com.senecafoundation;

import java.util.Random;
public class NPC implements INPC
{
    //Variables
    private String name;

    //Accessor and Mutators
    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

    //Constructor
    public NPC(String name)
    {
        this.name = name;
    }

    //Methods
    public String PrintPhrases()
    {
        String[] phrases = {"Hello, nice weather we are having.", "Hello traveler!", "Sheeeeeeeesh!"};
        Random rand = new Random();
        int upperbound = phrases.length;
        int randomNumber = rand.nextInt(upperbound);

        return(name + ": " + phrases[randomNumber]);
    }

}

