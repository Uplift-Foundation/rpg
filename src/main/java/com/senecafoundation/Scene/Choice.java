package com.senecafoundation.Scene;

public class Choice
{
    //Variables
    private int choiceOptionNumber;
    private String choiceText;
    private Response response;

    public Choice(int choiceOptionNumber, String choiceText, Response response) {
        this.choiceOptionNumber = choiceOptionNumber;
        this.response = response;
        this.choiceText = choiceText;
    }

    public int getChoiceOptionNumber() {
        return choiceOptionNumber;
    }

    public Response getResponse() {
        return response;
    }

    public String getChoiceText() {
        return choiceText;
    }
}
