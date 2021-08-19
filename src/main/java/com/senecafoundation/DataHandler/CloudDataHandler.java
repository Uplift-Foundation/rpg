package com.senecafoundation.DataHandler;

public class CloudDataHandler extends DataHandler {
    
    @Override
    public boolean Create(Character character) {
        // TODO This is code to save to the Cloud
        return false;
    }

    @Override
    public Character Read(String id) {
        // TODO This is code to read from the Cloud
        return null;
    }

    @Override
    public boolean Update(Character character) {
        // TODO This is code to update to the Cloud
        return false;
    }

    @Override
    public boolean Delete(String id) {
        // This is delete from the Cloud
        return false;
    }
}