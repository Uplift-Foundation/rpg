package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrcTest {
    
    private Orc systemUnderTest;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new Orc(
            "Warren the Orc", 
            41, 
            "Male", 
            25, 
            20
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
            "com.senecafoundation.Orc@79e2c065 Heavy Armor: 25 Smithing: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
