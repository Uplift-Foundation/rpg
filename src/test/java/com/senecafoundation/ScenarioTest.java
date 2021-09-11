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
        //;
        
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