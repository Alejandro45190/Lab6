package com.mycompany.lab6.teamproject2;


public class Answer { //Stores an answer along with the question id
    private String text;
    private int questionId;

    public Answer(String text, int questionId) { //constructor for answer
        this.text = text;
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
    
    @Override
    public String toString() { //toString to print text and questionId
        return "Text: " + text + ", questionId: " + questionId;
    }
}
