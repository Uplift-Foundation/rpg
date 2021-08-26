package com.senecafoundation.Scene;

public class Choices extends Response
{
    private int id;
    private String choiceOne;
    private String choiceTwo;
    
    
    //Accessors and Mutators
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
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
    public Choices(String responseOne, String responseTwo, int id, String one, String two)
    {
        super(responseOne, responseTwo);
        this.id = id;
        this.choiceOne = one;
        this.choiceTwo = two;
    }
    
}
