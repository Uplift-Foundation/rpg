package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShadowElfTest {
    
    private ShadowElf systemUnderTest;

    @BeforeEach
    void assignOrc() {
        this.systemUnderTest = new ShadowElf(
            "ShadowElf", 
            33, 
            "Male", 
            25, 
            20
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
