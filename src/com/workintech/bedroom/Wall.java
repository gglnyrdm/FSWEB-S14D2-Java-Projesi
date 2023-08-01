package com.workintech.bedroom;

public class Wall {
    private String direction;

    public Wall(String direction){
        this.direction=direction;
    }
    public String getDirection(){ return direction; }
    public void create(){
        System.out.println("Wall has been created on: " + getDirection());
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Wall-------------------\n");
        builder.append("Direction: " + direction + "\n");
        return builder.toString();
    }
}
