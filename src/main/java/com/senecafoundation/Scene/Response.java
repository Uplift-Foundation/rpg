package com.senecafoundation.Scene;

public class Response 
{
    //Variables
    private String responseText;
    private String resultingSceneIDFromChoce;
    
    public Response(String responseText, String resultingSceneIDFromChoce) {
        this.responseText = responseText;
        this.resultingSceneIDFromChoce = resultingSceneIDFromChoce;
    }
    public String getResultingSceneIDFromChoice() {
        return resultingSceneIDFromChoce;
    }

    public String getResponseText() {
        return responseText;
    }
}
