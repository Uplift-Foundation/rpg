package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.senecafoundation.DataHandler.FileDataHandler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileDataHandlerTest {
    
    private FileDataHandler systemUnderTest;
    private Orc testOrc;

    @BeforeEach
    void assignObs(){
        this.systemUnderTest = new FileDataHandler("./Objects.csv");
        this.testOrc = new Orc("Chance",18,"Male",1,10, this.systemUnderTest);
    }

    @Test 
    void testCreate(){
        this.testOrc.getDataHandler().Create(testOrc);
    };

     @Test 
     void testUpdate(){
         this.testOrc.getDataHandler().Create(testOrc);
         this.testOrc.setAge(27);
         Orc updatedOrc = (Orc) this.testOrc.getDataHandler().Update(testOrc);
         assertEquals(updatedOrc.getAge(), 27);
     }

    @Test
    void testRead() throws Exception {
        try {
            this.testOrc.getDataHandler().Create(testOrc);
        }
        catch (Exception e) {

        }
        Orc readOrc = (Orc) this.testOrc.getDataHandler().Read(testOrc.getId());
        assertEquals(testOrc.getId(), readOrc.getId());
    }

     @Test 
     void testDelete() throws Exception{
         this.testOrc.getDataHandler().Create(testOrc);
        Orc readOrc = (Orc) this.testOrc.getDataHandler().Read(testOrc.getId());
         assertEquals(testOrc.getId(), readOrc.getId());
         this.testOrc.getDataHandler().Delete(testOrc.getId());
         Exception exception = assertThrows(Exception.class, () -> {
             this.testOrc.getDataHandler().Read(testOrc.getId()); 
         });
         assertEquals("Item not found with that ID", exception.getMessage());
     }
}