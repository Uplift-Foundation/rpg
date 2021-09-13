package com.senecafoundation.Scene;

import java.util.List;
import java.util.UUID;

public class Scenario
{
    //Variables
    private String id;
    private String nextSceneID;
    private String previousSceneID;
    private String sceneName;
    private String sceneText;
    private List<Choice> choices;

    //Accessor and Mutators

    public String getId() 
    {
        return id;
    }

    public String getPreviousSceneID() {
        return previousSceneID;
    }
    public void setPreviousSceneID(String previousSceneID) {
        this.previousSceneID = previousSceneID;
    }

    public String getNextSceneID() {
        return nextSceneID;
    }
    public void setNextSceneID(String nextSceneID) {
        this.nextSceneID = nextSceneID;
    }

    public String getSceneName() 
    {
        return sceneName;
    }
    public void setSceneName(String sceneName) 
    {
        this.sceneName = sceneName;
    }

    public String getSceneText() 
    {
        return sceneText;
    }
    public void setSceneText(String sceneText) 
    {
        this.sceneText = sceneText;
    }

    public Scenario(List<Choice> choices, String sceneName, String sceneText, String nextSceneID, String previousSceneId)
    {
        this.id = UUID.randomUUID().toString();
        this.choices = choices;
        this.sceneName = sceneName;
        this.sceneText = sceneText;
        this.nextSceneID = nextSceneID;
        this.previousSceneID = previousSceneId;
    }

    //Methods
    public String Scene()
    {
        return("\n" + "***  " + this.getSceneName() + " ***\n\n\n" + getSceneText());
    }

    public String playThrough() throws Exception
    {
        // Start the scene text with the scene name and text
        String sceneAsString = String.join("\n\n", this.sceneName, this.sceneText);

        // Also append each possible choice
        for (Choice possibleChoice : this.choices) {
            sceneAsString = String.join("\n", sceneAsString, possibleChoice.getChoiceOptionNumber() + ") " + possibleChoice.getChoiceText());
        }
        return sceneAsString;
    }

    public Response getResponse(int sceneChoice) throws Exception {
        for (Choice possibleChoice : this.choices) {
            if (sceneChoice == possibleChoice.getChoiceOptionNumber()) {
                return possibleChoice.getResponse();
            }
        }
        throw new Exception("Valid response not selected");
    }
}
