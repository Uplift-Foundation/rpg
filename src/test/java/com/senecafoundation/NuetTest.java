package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import com.senecafoundation.CharacterTypes.Nuet;
import com.senecafoundation.DataHandler.FileDataHandler;

public class NuetTest {
    
    private Nuet systemUnderTest;
    @Mock private transient FileDataHandler fileDataHandler;

    @BeforeEach
    void assignNuet() {
        this.systemUnderTest = new Nuet(
            "Nuet", 
            60, 
            "Male", 
            25, 
            20,
            fileDataHandler

        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Nuet", this.systemUnderTest.getName());
        assertEquals(60, this.systemUnderTest.getAge());
        assertEquals("Male", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getLockPickingBonus());
        assertEquals(20, this.systemUnderTest.getLightArmorBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Nuet Lockpicking: 25 Light Armor: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}
