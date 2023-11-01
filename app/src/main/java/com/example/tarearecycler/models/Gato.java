package com.example.tarearecycler.models;

public class Gato extends Animal{
    private Bigote bigotes;
    private Color color;

    public Gato(Bigote bigotes, Color color) {
        this.bigotes = bigotes;
        this.color = color;
    }

    public Bigote getBigotes() {
        return bigotes;
    }

    public void setBigotes(Bigote bigotes) {
        this.bigotes = bigotes;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
