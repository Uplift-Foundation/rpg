package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArgonianTest {
    
    private Nuet systemUnderTest;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new Nuet(
            "Argonian", 
            60, 
            "Male", 
            25, 
            20
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Argonian", this.systemUnderTest.getName());
        assertEquals(60, this.systemUnderTest.getAge());
        assertEquals("Male", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getLockPickingBonus());
        assertEquals(20, this.systemUnderTest.getLightArmorBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Argonian Lockpicking: 25 Light Armor: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
