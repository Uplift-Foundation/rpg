package com.senecafoundation;
import com.senecafoundation.DataHandler.IDataHandler;


public class CharacterSelection 
{
    //Variables
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

    public int pickAge(int characterAge) throws Exception
    {

        //int characterAge = 0;

        if(characterAge > 0 || characterAge < 100)
        {
            return characterAge;
        }
        else if(characterAge <= 0 || characterAge >= 100)
        {
            return 18;
        }

        throw new Exception("Invalid exception");
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
        Character character;

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
            // validCharacterWasNotChosen = true;
        }
        // if (!validCharacterWasNotChosen) {
        //     character.setName(pickName());
        //     character.setSex(pickSex());
        //     character.setAge(pickAge());
             return character;
        // }
        
        // throw new Exception("You did not pick a valid exception");
    }
    
}

