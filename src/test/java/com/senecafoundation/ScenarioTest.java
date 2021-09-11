package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.senecafoundation.Scene.Choice;
import com.senecafoundation.Scene.Response;
import com.senecafoundation.Scene.Scenario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ScenarioTest 
{
    
    private Scenario systemUnderTest;
    private List<Choice> fakeChoices;
    @Mock private transient Choice fakeChoice;
    @Mock private transient Response fakResponse;


    @BeforeEach
    void assignScene()
    {
        MockitoAnnotations.openMocks(this);
        when(fakeChoice.getChoiceOptionNumber()).thenReturn(0);
        when(fakeChoice.getChoiceText()).thenReturn("test");
        when(fakeChoice.getResponse()).thenReturn(fakResponse);
        this.fakeChoices = Arrays.asList(fakeChoice, fakeChoice);
        this.systemUnderTest = new Scenario(fakeChoices, "Opening", "This is the opening.", null, null);
    }

    @Test 
    void testScene()
    {
        assertEquals("\n***  Opening ***\n\n\nThis is the opening.", this.systemUnderTest.Scene());
    };

     @Test 
     void Play() throws Exception
     {
        assertEquals("Opening\n\nThis is the opening.\n0) test\n0) test", this.systemUnderTest.playThrough());
     }

    
}