package com.mycompany.lab6.teamproject2;

public class Question {
    private int id;
    private String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", text: " + text;
    }
}
