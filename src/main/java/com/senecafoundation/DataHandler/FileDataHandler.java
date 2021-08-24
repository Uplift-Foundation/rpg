package com.senecafoundation.DataHandler;

import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.io.*;

import com.senecafoundation.Character;
import com.senecafoundation.ICharacter;
import com.senecafoundation.Orc;

public class FileDataHandler extends DataHandler {
    
    private String fileLocation;
    private File file;
    Scanner scanner;
    
    public FileDataHandler(String fileLocationFromUser) {
        this.fileLocation = fileLocationFromUser;
        try {
            this.file = new File(fileLocationFromUser);
            this.scanner = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public boolean Create(Character characterFromUser) 
    {
        try {
            // See if it exists in the file already
            this.Read(characterFromUser.getId());
        }
        catch (Exception e) { // We catch the custom error here (from line 60)
            if (e.getMessage() == "Item not found with that ID" || e instanceof FileNotFoundException) {
                // Was not found in the file - add it
                BufferedWriter bw;
                try {
                    bw = new BufferedWriter(new FileWriter(this.fileLocation, true));
                    bw.write(characterFromUser.toString());
                    bw.newLine();
                    bw.flush();
                    bw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        return true;
        
    }

    @Override
    public Character Read(String id) throws Exception 
    {      
        if (this.file != null) {
            try {
                this.scanner = new Scanner(this.file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (this.scanner != null && this.scanner.hasNextLine()) {
                String line = this.scanner.nextLine();
                if(line.contains(id)) { 
                    String[] props = line.split(",");
                    if (props[0].equals("Orc")) {
                        Orc orcToReturn = new Orc(props[2], Integer.parseInt(props[3]), props[4], Integer.parseInt(props[5]), Integer.parseInt(props[6]), this);
                        orcToReturn.setId(id);
                        return orcToReturn;
                    }
                }
            }
        }
        // We throw a custom error here if we can't find anything with that ID
        throw new Exception("Item not found with that ID");
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