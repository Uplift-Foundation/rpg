package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElfTest {
    
    private Elf systemUnderTest;

    @BeforeEach
    void assignElf() {
        this.systemUnderTest = new Elf(
            "Elf", 
            23, 
            "Female", 
            25, 
            20
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Elf", this.systemUnderTest.getName());
        assertEquals(23, this.systemUnderTest.getAge());
        assertEquals("Female", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getIllusionBonus());
        assertEquals(20, this.systemUnderTest.getEnchantingBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Elf Illusion: 25 Enchanting: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
