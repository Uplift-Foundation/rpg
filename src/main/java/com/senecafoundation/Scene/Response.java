package com.senecafoundation.Scene;

public class Response 
{
    //Variables
    private String responseOne;
    private String responseTwo;

    //Accessors and Mutators
    public String getResponseOne() 
    {
        return responseOne;
    }
    public void setResponseOne(String responseOne) 
    {
        this.responseOne = responseOne;
    }
    public String getResponseTwo() 
    {
        return responseTwo;
    }

    public void setResponseTwo(String responseTwo) 
    {
        this.responseTwo = responseTwo;
    }

    //Constructor
    public Response(String one, String two)
    {
        this.responseOne = one;
        this.responseTwo = two;
    }

    

    

    

    

    
}
