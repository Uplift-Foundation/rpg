package com.senecafoundation;

import java.util.*;

public class Skyrim implements ISkyrim
{
    //Variables
    private String City;
    private ArrayList<IPlayer> Characters;

    //Encapsulation
    public String getCity()
    {
        return City;
    }
    public void setCity(String newCity)
    {
        this.City = newCity;
    }

    //Constructor

    public Skyrim(ArrayList<IPlayer> characters)
    {
        Characters = new ArrayList<IPlayer>(); 
    }
    
    public Skyrim(String city) 
    {
        this.City = city;
    }

    //Methods

    /*
    public void PrintCharacters() 
    {
        foreach(IPlayer people : Characters) 
        {
            System.out.println(people.PlayerDetails());
        }
    }
    */
    
    
    public String WelcomeScreen(String x)
    {
        return " \n Welcome to the World of Skyrim.\n For now, you are situated in " + x + ".\n";
    }

    public void Directions()
    {
        System.out.println(" \n Ten different races live within the world of Skyrim.\n Each possessing a different set of starting skills stronger than others. \n Who would you choose? \n");
    }

}
