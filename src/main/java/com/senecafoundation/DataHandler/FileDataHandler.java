package com.senecafoundation.DataHandler;

public class FileDataHandler extends DataHandler {
    
    @Override
    public boolean Create(Character character) {
        // TODO This is code to save to a file
        return false;
    }

    @Override
    public Character Read(String id) {
        // TODO This is code to read from a file
        return null;
    }

    @Override
    public boolean Update(Character character) {
        // TODO This is code to update to a file
        return false;
    }

    @Override
    public boolean Delete(String id) {
        // This is delete from a file
        return false;
    }
}