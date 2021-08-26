package com.senecafoundation;

import com.senecafoundation.Scene.Scenario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScenarioTest 
{
    
    private Scenario systemUnderTest;
    

    @BeforeEach
    void assignScene()
    {
        this.systemUnderTest = new Scenario("Nothing there!","Something is there!",0,"Left Path","Right Path","Meadow Peak","You stumbled upon a path that splits in two.");
        
    }

    @Test 
    void testScene()
    {
        this.systemUnderTest.Scene();
    };

     @Test 
     void Play() throws Exception
     {
        this.systemUnderTest.playThrough();
     }

    
}