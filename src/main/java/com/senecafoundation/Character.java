package com.senecafoundation;

import java.util.UUID;
import java.util.Scanner;

import com.senecafoundation.DataHandler.IDataHandler;


public abstract class Character implements ICharacter
{
    //Variables
    private String name;
    private int age;
    private String sex;
    private String id;
    private IDataHandler dataHandler;
    private Scanner input = new Scanner(System.in);
    
    //Encapsulation
    public IDataHandler getDataHandler() {
        return dataHandler;
    }
    public String getName()
    {
        return name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
  
    //Constructor
    public Character(String n, int a, String s, IDataHandler dataHandler)
    {
        this.name = n;
        this.age = a;
        this.sex = s;
        this.setId(UUID.randomUUID().toString());
        this.dataHandler = dataHandler; 
    }

    //Methods
    public String PlayerDetails() //virtual
    {
        return "Player Name: " + name +  " Player Age: " + age + " Sex: " + sex;
    }

    public String toString() 
    {
        return this.getClass().getSimpleName() + "," + this.getId() + "," + this.getName() + ","  + this.getAge() + "," + this.getSex();
    }

    public void chooseCharacter(Character character)
    {
        boolean flag = true;
        

        String characterName;
        String characterSex;
        int characterAge = 0;
        

        while(flag)
        {

           
                System.out.println("Character Name: \n");
                         characterName = input.nextLine();

                        System.out.println("Character Sex: Male/Female \n");
                         characterSex = input.nextLine();

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
                        while(characterAge <= 0 || characterAge >= 100)
                        {
                            System.out.println("Character Age: \n");
                            characterAge = input.nextInt();
                            

                            if(characterAge <= 0 || characterAge >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }

                        

                        
            


            System.out.println("\nPick A Character: \n Orc, Viking, DemiHuman, Elf, Nuet, Halfling, HalfElf, ShadowElf, Human, Tiefler");
            String race = input.nextLine();

            switch(race)
            {
                case "Orc":
                    character = new Orc("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "Viking":
                    character = new Viking("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "DemiHuman":
                    character = new DemiHuman("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "Elf":
                    character = new Elf("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "Nuet":
                    character = new Nuet("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "Halfling":
                    character = new Halfling("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                    case "HalfElf":
                    character = new HalfElf("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "ShadowElf":
                    character = new ShadowElf("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "Human":
                    character = new Human("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
                case "Tiefler":
                    character = new Tiefler("",0,"",25,20,dataHandler);
                    character.setName(characterName);
                    character.setAge(characterAge);
                    character.setSex(characterSex);
                    System.out.println("\nCharacter: " + character.toString() + "\n");
                    flag = false;
                    break;
            }
        }

    }
            
            
    

}