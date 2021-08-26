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
            //ends or starts while loop
            boolean selection = true;

            //Dummy Player Object
            Character player;

            
            
            while(selection)
            {
                //Picks Character
                System.out.println("\nPick A Character: \n Orc, Viking, DemiHuman, Elf, Nuet, Halfling, HalfElf, ShadowElf, Human, Tiefler");
                String race = sc.nextLine();

                //Condional Statements To Prep Character
                                //***Orc***\\
                if((race.equals("Orc")) || (race.equals("orc")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new Orc("", 0,"", 25, 20, dataHandler);
                        
                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                                //***Viking***\\
                else if((race.equals("Viking")) || (race.equals("viking")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new Viking("", 0, "", 25, 20, dataHandler);

                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                                //***DemiHuman***\\
                else if((race.equals("DemiHuman")) || (race.equals("demihuman")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new DemiHuman("", 0, "", 25, 20, dataHandler);

                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                                //***Elf***\\
                else if((race.equals("Elf")) || (race.equals("elf")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new Elf("", 0, "", 25, 20, dataHandler);

                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                                //***Nuet***\\
                else if((race.equals("Nuet")) || (race.equals("nuet")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new Nuet("",0,"",25,20, dataHandler);

                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                            //***Halfling***\\
                else if((race.equals("Halfling")) || (race.equals("halfling")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new Halfling("",0,"",25,20, dataHandler);

                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                                //***HalfElf***\\
                else if((race.equals("HalfElf")) || (race.equals("halfelf")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new HalfElf("",0,"",25,20, dataHandler);

                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                                //***ShadowElf***\\
                else if((race.equals("ShadowElf")) || (race.equals("shadowelf")))
                {
                    System.out.println("Are you sure of this character?");
                    String decision = sc.nextLine();

                    if((decision.equals("No")) || (decision.equals("no")))
                    {
                        System.out.println("\n . . .");
                    }
                    else if((decision.equals("Yes")) || (decision.equals("yes")))
                    {
                        //Gives Player's Character Selected
                        player = new ShadowElf("",0,"",25,20, dataHandler);

                        System.out.println("Character Name: \n");
                        String characterName = sc.nextLine();
                        player.setName(characterName);

                        System.out.println("Character Sex: Male/Female \n");
                        String characterSex = sc.nextLine();

                        if((characterSex.equals("Male")) || (characterSex.equals("male")))
                        {
                            player.setSex("Male");
                        }
                        else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                        {
                            player.setSex("Female");
                        }
                        else
                        {
                            player.setSex("Unknown");
                        }
                        while(player.getAge() <= 0 || player.getAge() >= 100)
                        {
                            System.out.println("Character Age: \n");
                            int characterAge = sc.nextInt();
                            player.setAge(characterAge);

                            if(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Error!"); 
                            }

                        }
                        
                        selection = false;
                    }
                    
                }
                                //***Human***\\
                    else if((race.equals("Human")) || (race.equals("human")))
                    {
                        System.out.println("Are you sure of this character?");
                        String decision = sc.nextLine();
                
                        if((decision.equals("No")) || (decision.equals("no")))
                        {
                            System.out.println("\n . . .");
                        }
                        else if((decision.equals("Yes")) || (decision.equals("yes")))
                        {
                            //Gives Player's Character Selected
                            player = new Human("",0,"",25,20, dataHandler);
                
                            System.out.println("Character Name: \n");
                            String characterName = sc.nextLine();
                            player.setName(characterName);
                
                            System.out.println("Character Sex: Male/Female \n");
                            String characterSex = sc.nextLine();
                
                            if((characterSex.equals("Male")) || (characterSex.equals("male")))
                            {
                                player.setSex("Male");
                            }
                            else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                            {
                                player.setSex("Female");
                            }
                            else
                            {
                                player.setSex("Unknown");
                            }
                            while(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Character Age: \n");
                                int characterAge = sc.nextInt();
                                player.setAge(characterAge);
                
                                if(player.getAge() <= 0 || player.getAge() >= 100)
                                {
                                    System.out.println("Error!"); 
                                }
                
                            }
                                        
                                selection = false;
                        }
                                    
                    }
                                //***Tiefler***\\
                    else if((race.equals("Tiefler")) || (race.equals("tiefler")))
                    {
                        System.out.println("Are you sure of this character?");
                        String decision = sc.nextLine();
                
                        if((decision.equals("No")) || (decision.equals("no")))
                        {
                            System.out.println("\n . . .");
                        }
                        else if((decision.equals("Yes")) || (decision.equals("yes")))
                        {
                            //Gives Player's Character Selected
                            player = new Tiefler("",0,"",25,20, dataHandler);
                
                            System.out.println("Character Name: \n");
                            String characterName = sc.nextLine();
                            player.setName(characterName);
                
                            System.out.println("Character Sex: Male/Female \n");
                            String characterSex = sc.nextLine();
                
                            if((characterSex.equals("Male")) || (characterSex.equals("male")))
                            {
                                player.setSex("Male");
                            }
                            else if((characterSex.equals("Female")) || (characterSex.equals("female")))
                            {
                                player.setSex("Female");
                            }
                            else
                            {
                                player.setSex("Unknown");
                            }
                            while(player.getAge() <= 0 || player.getAge() >= 100)
                            {
                                System.out.println("Character Age: \n");
                                int characterAge = sc.nextInt();
                                player.setAge(characterAge);
                
                                if(player.getAge() <= 0 || player.getAge() >= 100)
                                {
                                    System.out.println("Error!"); 
                                }
                
                            }
                                        
                                selection = false;
                        }
                                    
                    }

            }

            

            Scenario first = new Scenario("Nothing there!","Something is there!",0,"Left Path","Right Path","Meadow Peak","You stumbled upon a path that splits in two.");
            first.Scene();
            first.playThrough();
        

    }
}
