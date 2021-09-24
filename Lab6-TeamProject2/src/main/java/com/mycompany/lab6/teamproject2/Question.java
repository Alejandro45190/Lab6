package com.mycompany.lab6.teamproject2;

public class Question { //stores a question and an id
    private int id;
    private String text;

    public Question(int id, String text) { //constructor for question
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString() { //toString to print id and text
        return "ID: " + id + ", text: " + text;
    }
}
