package com.senecafoundation;
import java.util.*;

public class Cealasia implements ICealasia
{
    //Variables
    private String City;
    private ArrayList<ICharacter> Characters;

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

    public Cealasia(ArrayList<ICharacter> characters)
    {
        Characters = new ArrayList<ICharacter>(); 
    }
    
    public Cealasia(String city) 
    {
        this.City = city;
    }

    //Methods
    
    public String WelcomeScreen(String x)
    {
        return " \n Welcome to the World of Cealasia.\n For now, you are situated in " + x + ".\n";
    }

    public void Directions()
    {
        System.out.println(" \n Ten different races live within the world of Cealasia.\n Each possessing a different set of starting skills stronger than others. \n Who would you choose? \n");
    }

}
