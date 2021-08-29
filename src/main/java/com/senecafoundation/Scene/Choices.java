package com.senecafoundation.Scene;

public class Choices extends Response
{
    //Variables
    private String choiceOne;
    private String choiceTwo;
    
    
    //Accessors and Mutators
    public String getChoiceOne() 
    {
        return choiceOne;
    }
    public void setChoiceOne(String choiceOne) 
    {
        this.choiceOne = choiceOne;
    }
    public String getChoiceTwo() 
    {
        return choiceTwo;
    }
    public void setChoiceTwo(String choiceTwo) 
    {
        this.choiceTwo = choiceTwo;
    }
    
    //Constructor
    public Choices(String one, String two )
    {
        this.choiceOne = one;
        this.choiceTwo = two;
    }
    
}
