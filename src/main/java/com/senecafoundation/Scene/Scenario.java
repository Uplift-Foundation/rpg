package com.senecafoundation.Scene;

import java.util.Scanner;

public class Scenario extends Choices
{
    //Variables

    private int id;

    private String sceneName;
    
    private String sceneText;

    private Scanner input = new Scanner(System.in);

    //Accessor and Mutators

    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }

    public String getSceneName() 
    {
        return sceneName;
    }

    public void setSceneName(String sceneName) 
    {
        this.sceneName = sceneName;
    }

    public String getSceneText() 
    {
        return sceneText;
    }

    public void setSceneText(String sceneText) 
    {
        this.sceneText = sceneText;
    }

    public Scenario(String choiceOne, String choiceTwo, int id, String sceneName, String sceneText)
    {
        super(choiceOne, choiceTwo);
        this.id = id;
        this.sceneName = sceneName;
        this.sceneText = sceneText;
    }

    //Methods
    public void Scene()
    {
        System.out.print("\n" + "***  " + this.getSceneName() + " ***\n\n\n" + getSceneText());
    }

    public void playThrough()throws Exception
    {
        
            System.out.println("\n\n\n" + "Type 1 OR 2 \n");

            System.out.println("\n[1] " + this.getChoiceOne() + "\n" + "[2] " + this.getChoiceTwo() + " \n");
            int choiceX = input.nextInt();

            if(choiceX == 1)
            {
                System.out.println(this.getResponseOne() + "\n");
            }
            else if(choiceX == 2)
            {
                System.out.println(this.getResponseTwo() + "\n");
            }
        
    }
    

    
    
}
