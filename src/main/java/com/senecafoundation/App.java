package com.senecafoundation;

import java.util.ArrayList;
import java.util.Scanner;

import com.senecafoundation.DataHandler.FileDataHandler;
import com.senecafoundation.Scene.Scenario;



public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        //ArrayList to withhold Player Races
        ArrayList<ICharacter> characters = new ArrayList<ICharacter>();

        FileDataHandler dataHandler = new FileDataHandler("./characterData.csv");

        //Default Character Races
        Orc one = new Orc("Orc",0,"N/A",25, 20, dataHandler);
        Viking two = new Viking("Viking", 0, "N/A", 25, 20, dataHandler);
        DemiHuman three = new DemiHuman("DemiHuman", 0, "N/A", 25, 20, dataHandler);
        Elf four = new Elf("Elf",0,"N/A", 25, 20, dataHandler);
        Nuet five = new Nuet("Nuet",0,"N/A", 25, 20, dataHandler);
        Halfling six = new Halfling("Halfling",0,"N/A", 25, 20, dataHandler);
        HalfElf seven = new HalfElf("HalfElf",0,"N/A", 25, 20, dataHandler);
        ShadowElf eight = new ShadowElf("ShadowElf",0,"N/A", 25, 20, dataHandler);
        Human nine = new Human("Human",0,"N/A", 25, 20, dataHandler);
        Tiefler ten = new Tiefler("Tiefler",0,"N/A", 25, 20, dataHandler);

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

        Character character = new Orc("",0,"", 0, 0, dataHandler);
        CharacterSelection pick = new CharacterSelection();

        System.out.println("\nPick A Character: \n Orc, Viking, DemiHuman, Elf, Nuet, Halfling, HalfElf, ShadowElf, Human, Tiefler");
        String race = sc.nextLine();
        
        System.out.println("Character Name:\n");
        String characterName = sc.nextLine();
        character.setName(pick.pickName(characterName));

        System.out.println("Character Sex: Male/Female\n");
        String characterSex = sc.nextLine();
        character.setSex(pick.pickSex(characterSex));

        System.out.println("Character Age: \n");
        int characterAge = sc.nextInt();
        character.setAge(pick.pickAge(characterAge));


        character = pick.picker(race);

        System.out.println("\n" + character.toString());

        // *** more console interactions and CharacterSelection needed here
            
        Scenario first = new Scenario("Left Path","Right Path", 0, "Meadow Peak","You stumbled upon a path that splits in two.");
        first.setResponseOne("Nothing there!");
        first.setResponseTwo("Something is there!");
        System.out.println(first.Scene());

        System.out.println("\n\n\n" + "Type 1 OR 2 \n");
        System.out.println("\n[1] " + first.getChoiceOne() + "\n" + "[2] " + first.getChoiceTwo() + " \n");
        int choiceX = sc.nextInt();

        System.out.println(first.playThrough(choiceX));
        
    }
}
