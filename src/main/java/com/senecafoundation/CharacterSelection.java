package com.senecafoundation;
import com.senecafoundation.DataHandler.IDataHandler;


import java.util.Scanner;

public class CharacterSelection 
{
    //Variables
    private Scanner input = new Scanner(System.in);
    private IDataHandler dataHandler;

    //Constructor
    public CharacterSelection()
    {
        
    }


    //Methods

    public String pickName(String characterName)
    {
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

    public String pickSex(String characterSex)
    {
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



    public Character picker(String race) throws Exception
    {
        if((race.equals("Orc")) || (race.equals("orc")))
        {
            return new Orc("",0,"",25,20,dataHandler);
        }
        else if((race.equals("Viking")) || (race.equals("viking")))
        {
            return new Viking("",0,"",25,20,dataHandler);
        }
        else if((race.equals("DemiHuman")) || (race.equals("demihuman")))
        {
            return new DemiHuman("",0,"",25,20,dataHandler);
        }
        else if((race.equals("Elf")) || (race.equals("elf")))
        {
            return new Elf("",0,"",25,20,dataHandler);
        }
        else if((race.equals("Nuet")) || (race.equals("nuet")))
        {
            return new Nuet("",0,"",25,20,dataHandler);
        }
        else if((race.equals("Halfling")) || (race.equals("halfling")))
        {
            return new Halfling("",0,"",25,20,dataHandler);
        }
        else if((race.equals("HalfElf")) || (race.equals("HalfElf")))
        {
            return new HalfElf("",0,"",25,20,dataHandler);
        }
        else if((race.equals("ShadowElf")) || (race.equals("shadowelf")))
        {
            return new ShadowElf("",0,"",25,20,dataHandler);
        }
        else if((race.equals("Human")) || (race.equals("human")))
        {
            return new Human("",0,"",25,20,dataHandler);
        }
        else if((race.equals("Tiefler")) || (race.equals("tiefler")))
        {
            return new Tiefler("",0,"",25,20,dataHandler);
        }
        else {
            return new Human("",0,"",25,20,dataHandler);
            // validCharacterWasNotChosen = true;
        }
        // if (!validCharacterWasNotChosen) {
        //     character.setName(pickName());
        //     character.setSex(pickSex());
        //     character.setAge(pickAge());
        //     return character;
        // }
        
        // throw new Exception("You did not pick a valid exception");
    }
    
}

