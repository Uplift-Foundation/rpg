package com.senecafoundation;

import java.util.ArrayList;
import java.util.Scanner;

import com.senecafoundation.CharacterSelection.CharacterSelection;
import com.senecafoundation.CharacterSelection.ICharacterSelection;
import com.senecafoundation.CharacterTypes.Character;
import com.senecafoundation.CharacterTypes.DemiHuman;
import com.senecafoundation.CharacterTypes.Elf;
import com.senecafoundation.CharacterTypes.HalfElf;
import com.senecafoundation.CharacterTypes.Halfling;
import com.senecafoundation.CharacterTypes.Human;
import com.senecafoundation.CharacterTypes.ICharacter;
import com.senecafoundation.CharacterTypes.Nuet;
import com.senecafoundation.CharacterTypes.Orc;
import com.senecafoundation.CharacterTypes.ShadowElf;
import com.senecafoundation.CharacterTypes.Tiefler;
import com.senecafoundation.CharacterTypes.Viking;
import com.senecafoundation.DataHandler.FileDataHandler;
import com.senecafoundation.Scene.Choice;
import com.senecafoundation.Scene.Response;
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

        ICharacterSelection pick = new CharacterSelection();
        Character userSelectedCharacter = pick.picker();

        System.out.println("\n" + userSelectedCharacter.toString());
        
        Scenario ending1 = new Scenario(new ArrayList<Choice>(), "Nothing.", "Nothing was there!  This is the end for you.", null, null);
        Scenario ending2 = new Scenario(new ArrayList<Choice>(), "Something.", "Something is there!  This is the end for you.", null, null);
            
        ArrayList<Choice> scene1choices = new ArrayList<Choice>();
        scene1choices.add(
            new Choice(
                1, 
                "Left Path", 
                new Response("Nothing is there!", ending1.getId())
            )
        );
        scene1choices.add(
            new Choice(
                2, 
                "Right Path", 
                new Response("Something is there!", ending2.getId())
            )
        );

        Scenario first = new Scenario(
            scene1choices,
            "Meadow Peak", 
            "You stumbled upon a path that splits in two.", 
            null, 
            null
        );

        System.out.println(first.playThrough());

        int sceneChoice = sc.nextInt();
        try {
            Response correctResponse = first.getResponse(sceneChoice);
            System.out.println(correctResponse.getResponseText());
            first.setNextSceneID(correctResponse.getResultingSceneIDFromChoice());
            if (correctResponse.getResultingSceneIDFromChoice() == ending1.getId()) {
                System.out.println(ending1.playThrough());
            }
            else if (correctResponse.getResultingSceneIDFromChoice() == ending2.getId()) {
                System.out.println(ending2.playThrough());
            }
        }
        catch (Exception e) {
            System.out.println("You did not enter a valid choice.  Game over.");
        }
        
        sc.close();
    }
}
