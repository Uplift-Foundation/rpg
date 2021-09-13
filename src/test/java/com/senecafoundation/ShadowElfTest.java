package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;

import com.senecafoundation.CharacterTypes.ShadowElf;
import com.senecafoundation.DataHandler.FileDataHandler;

public class ShadowElfTest {
    
    private ShadowElf systemUnderTest;
    @Mock private transient FileDataHandler fileDataHandler;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new ShadowElf(
            "ShadowElf", 
            33, 
            "Male", 
            25, 
            20,
            fileDataHandler
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("ShadowElf", this.systemUnderTest.getName());
        assertEquals(33, this.systemUnderTest.getAge());
        assertEquals("Male", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getDestructionBonus());
        assertEquals(20, this.systemUnderTest.getAlterationBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "ShadowElf Destruction: 25 Alteration: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
