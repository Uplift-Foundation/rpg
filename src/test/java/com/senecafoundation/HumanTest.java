package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import com.senecafoundation.CharacterTypes.Human;
import com.senecafoundation.DataHandler.FileDataHandler;

public class HumanTest {
    
    private Human systemUnderTest;
    @Mock private transient FileDataHandler fileDataHandler;

    @BeforeEach
    void assignHuman() {
        this.systemUnderTest = new Human(
            "Human", 
            27, 
            "Female", 
            25, 
            20,
            fileDataHandler
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Human", this.systemUnderTest.getName());
        assertEquals(27, this.systemUnderTest.getAge());
        assertEquals("Female", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getRestorationBonus());
        assertEquals(20, this.systemUnderTest.getBlockBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Human Restoration: 25 Block: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}