package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import com.senecafoundation.DataHandler.FileDataHandler;

public class OrcTest {
    
    private Orc systemUnderTest;
    @Mock private transient FileDataHandler fileDataHandler;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new Orc(
            "Warren the Orc", 
            41, 
            "Male", 
            25, 
            20,
            fileDataHandler

        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Warren the Orc", this.systemUnderTest.getName());
        assertEquals(41, this.systemUnderTest.getAge());
        assertEquals("Male", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getHeavyArmorBonus());
        assertEquals(20, this.systemUnderTest.getSmithingBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Warren the Orc Heavy Armor: 25 Smithing: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
