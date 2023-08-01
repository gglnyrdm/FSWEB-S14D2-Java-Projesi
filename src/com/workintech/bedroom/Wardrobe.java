package com.workintech.bedroom;

public class Wardrobe{
    private int width;
    private int height;
    double weight;

    public Wardrobe(int width,int height, double weight){
        this.height=height;
        this.weight=weight;
        this.width=width;
    }

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public double getWeight(){
        return weight;
    }
    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
