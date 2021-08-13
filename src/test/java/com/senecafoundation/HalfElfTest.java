package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HalfElfTest {
    
    private HalfElf systemUnderTest;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new HalfElf(
            "HalfElf", 
            33, 
            "Male", 
            25, 
            20
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("HalfElf", this.systemUnderTest.getName());
        assertEquals(33, this.systemUnderTest.getAge());
        assertEquals("Male", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getConjurationBonus());
        assertEquals(20, this.systemUnderTest.getRestorationBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "HalfElf Conjuration: 25 Restoration: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
