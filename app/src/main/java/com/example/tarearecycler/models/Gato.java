package com.example.tarearecycler.models;

public class Gato extends Animal{
    private String bigotes;
    private String color;

    public Gato(String bigotes, String color) {
        this.bigotes = bigotes;
        this.color = color;
    }

    public String getBigotes() {
        return bigotes;
    }

    public void setBigotes(String bigotes) {
        this.bigotes = bigotes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
