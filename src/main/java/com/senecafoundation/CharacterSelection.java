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



    public Character picker()
    {
        Character character;
        boolean flag = true;

        while(flag)
        {

            System.out.println("\nPick A Character: \n Orc, Viking, DemiHuman, Elf, Nuet, Halfling, HalfElf, ShadowElf, Human, Tiefler");
            String race = input.nextLine();

            if((race.equals("Orc")) || (race.equals("orc")))
            {
                character = new Orc("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("Viking")) || (race.equals("viking")))
            {
                character = new Viking("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("DemiHuman")) || (race.equals("demihuman")))
            {
                character = new DemiHuman("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("Elf")) || (race.equals("elf")))
            {
                character = new Elf("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("Nuet")) || (race.equals("nuet")))
            {
                character = new Nuet("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("Halfling")) || (race.equals("halfling")))
            {
                character = new Halfling("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("HalfElf")) || (race.equals("HalfElf")))
            {
                character = new HalfElf("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("ShadowElf")) || (race.equals("shadowelf")))
            {
                character = new ShadowElf("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("Human")) || (race.equals("human")))
            {
                character = new Human("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }
            else if((race.equals("Tiefler")) || (race.equals("tiefler")))
            {
                character = new Tiefler("",0,"",25,20,dataHandler);
                character.setName(pickName());
                character.setAge(pickAge());
                character.setSex(pickSex());
                flag = false;
            }

        }

        return character.toString();
    }
    
}

