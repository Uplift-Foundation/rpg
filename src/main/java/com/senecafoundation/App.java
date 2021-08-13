package com.senecafoundation;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        //ArrayList to withhold Player Races
        ArrayList<ICharacter> characters = new ArrayList<ICharacter>();

        //Default Character Races
        Orc one = new Orc("Orc",0,"N/A",25,20);
        Viking two = new Viking("Viking", 0, "N/A", 25, 20);
        DemiHuman three = new DemiHuman("DemiHuman", 0, "N/A", 25, 20);
        Elf four = new Elf("Elf",0,"N/A", 25,20);
        Nuet five = new Nuet("Nuet",0,"N/A", 25,20);
        Halfling six = new Halfling("Halfling",0,"N/A", 25,20);
        HalfElf seven = new HalfElf("HalfElf",0,"N/A", 25,20);
        ShadowElf eight = new ShadowElf("ShadowElf",0,"N/A", 25,20);
        Human nine = new Human("Human",0,"N/A", 25,20);
        Tiefler ten = new Tiefler("Tiefler",0,"N/A", 25,20);

        //Adds to characters list
        characters.add(one);
        characters.add(two);
        characters.add(three);
        characters.add(four);
        characters.add(five);
        characters.add(six);
        characters.add(seven);
        characters.add(eight);
        characters.add(nine);
        characters.add(ten);
        
        //Default Place Maker/City
        Cealasia place = new Cealasia("N/A");


        //Introduction
        System.out.println(place.WelcomeScreen("The Fading Terrain"));
        place.Directions();

        for(int i = 0; i < characters.size(); i++)
        {
            ICharacter word = characters.get(i);
            System.out.println(word.PlayerDetails());
        }
    }
}
