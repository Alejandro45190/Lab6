package com.mycompany.lab6.teamproject2;


public class Answer {
    private String text;
    private int questionId;

    public Answer(String text, int questionId) {
        this.text = text;
        this.questionId = questionId;
    }
    
    @Override
    public String toString() {
        return "Text: " + text + ", questionId: " + questionId;
    }
}
