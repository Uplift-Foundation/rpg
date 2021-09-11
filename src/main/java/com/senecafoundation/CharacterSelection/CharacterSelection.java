package com.senecafoundation.CharacterSelection;

import com.senecafoundation.CharacterTypes.Character;
import com.senecafoundation.CharacterTypes.DemiHuman;
import com.senecafoundation.CharacterTypes.Elf;
import com.senecafoundation.CharacterTypes.HalfElf;
import com.senecafoundation.CharacterTypes.Halfling;
import com.senecafoundation.CharacterTypes.Human;
import com.senecafoundation.CharacterTypes.Nuet;
import com.senecafoundation.CharacterTypes.Orc;
import com.senecafoundation.CharacterTypes.ShadowElf;
import com.senecafoundation.CharacterTypes.Tiefler;
import com.senecafoundation.CharacterTypes.Viking;
import com.senecafoundation.DataHandler.IDataHandler;
import java.util.Scanner;

public class CharacterSelection implements ICharacterSelection
{
    //Variables
    private Scanner input = new Scanner(System.in);
    private IDataHandler dataHandler;

    //Constructor
    public CharacterSelection() { }

    //Methods
    public String pickName()
    {
        System.out.println("Character Name: \n");
        String characterName = input.nextLine();
        return characterName;
    }

    public int pickAge()
    {
        int characterAge = 0;

        while(characterAge <= 0 || characterAge >= 100)
        {
            System.out.println("Character Age: \n");
            int characterAgeDummy = input.nextInt();

            characterAge = characterAgeDummy;

            if(characterAgeDummy <= 0 || characterAgeDummy >= 100)
            {
                System.out.println("Error!"); 
            }
        }

        return characterAge;
    }

    public String pickSex()
    {
        System.out.println("Character Sex: Male/Female \n");
        String characterSex = input.nextLine();

        if((characterSex.equals("Male")) || (characterSex.equals("male")))
        {
            characterSex = "Male";
        }
        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
        {
            characterSex = "Female";
        }
        else
        {
            characterSex = "Unknown";
        }

        return characterSex;
    }



    public Character picker() throws Exception
    {
        Character character;
        boolean validCharacterWasNotChosen = true;

        while(validCharacterWasNotChosen)
        {
            validCharacterWasNotChosen = false;
            System.out.println("\nPick A Character: \n Orc, Viking, DemiHuman, Elf, Nuet, Halfling, HalfElf, ShadowElf, Human, Tiefler");
            String race = input.nextLine();

            if((race.equals("Orc")) || (race.equals("orc")))
            {
                character = new Orc("",0,"",25,20,dataHandler);
            }
            else if((race.equals("Viking")) || (race.equals("viking")))
            {
                character = new Viking("",0,"",25,20,dataHandler);
            }
            else if((race.equals("DemiHuman")) || (race.equals("demihuman")))
            {
                character = new DemiHuman("",0,"",25,20,dataHandler);
            }
            else if((race.equals("Elf")) || (race.equals("elf")))
            {
                character = new Elf("",0,"",25,20,dataHandler);
            }
            else if((race.equals("Nuet")) || (race.equals("nuet")))
            {
                character = new Nuet("",0,"",25,20,dataHandler);
            }
            else if((race.equals("Halfling")) || (race.equals("halfling")))
            {
                character = new Halfling("",0,"",25,20,dataHandler);
            }
            else if((race.equals("HalfElf")) || (race.equals("HalfElf")))
            {
                character = new HalfElf("",0,"",25,20,dataHandler);
            }
            else if((race.equals("ShadowElf")) || (race.equals("shadowelf")))
            {
                character = new ShadowElf("",0,"",25,20,dataHandler);
            }
            else if((race.equals("Human")) || (race.equals("human")))
            {
                character = new Human("",0,"",25,20,dataHandler);
            }
            else if((race.equals("Tiefler")) || (race.equals("tiefler")))
            {
                character = new Tiefler("",0,"",25,20,dataHandler);
            }
            else {
                character = new Human("",0,"",25,20,dataHandler);
                validCharacterWasNotChosen = true;
            }
            if (!validCharacterWasNotChosen) {
                character.setName(pickName());
                character.setSex(pickSex());
                character.setAge(pickAge());
                return character;
            }
        }
        
        throw new Exception("You did not pick a valid exception");
    }
    
}

