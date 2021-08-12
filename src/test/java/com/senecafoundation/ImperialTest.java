package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImperialTest {
    
    private Imperial systemUnderTest;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new Imperial(
            "Imperial", 
            27, 
            "Female", 
            25, 
            20
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Imperial", this.systemUnderTest.getName());
        assertEquals(27, this.systemUnderTest.getAge());
        assertEquals("Female", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getRestorationBonus());
        assertEquals(20, this.systemUnderTest.getBlockBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Imperial Restoration: 25 Block: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}