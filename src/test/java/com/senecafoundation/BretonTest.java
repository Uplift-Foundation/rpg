package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BretonTest {
    
    private Breton systemUnderTest;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new Breton(
            "Breton", 
            33, 
            "Male", 
            25, 
            20
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Breton", this.systemUnderTest.getName());
        assertEquals(33, this.systemUnderTest.getAge());
        assertEquals("Male", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getConjurationBonus());
        assertEquals(20, this.systemUnderTest.getRestorationBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Breton Conjuration: 25 Restoration: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
