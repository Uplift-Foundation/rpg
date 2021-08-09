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
        return " \n Welcome to the Country of Cealasia.\n For now, you are situated in " + x + ".\n";
    }

    public void Directions()
    {
        System.out.println(" \n Eleven different races live within the world of Cealasia.\n Each possessing a different set of starting skills stronger than others. \n Who would you choose? \n");
    }

}
