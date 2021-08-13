package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemiHumanTest {
    
    private DemiHuman systemUnderTest;

    @BeforeEach
    void assignDemiHuman() {
        this.systemUnderTest = new DemiHuman(
            "DemiHuman", 
            30, 
            "Male", 
            25, 
            20
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("DemiHuman", this.systemUnderTest.getName());
        assertEquals(30, this.systemUnderTest.getAge());
        assertEquals("Male", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getSneak());
        assertEquals(20, this.systemUnderTest.getAlchemyBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "DemiHuman Sneak: 25 Alchemy: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}