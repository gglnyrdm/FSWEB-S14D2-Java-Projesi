package com.workintech.bedroom.enums;

public enum LampType {
    DESK_LAMP("Desk lamp", true, 25),
    FLOOR_LAMP("Floor Lamp", false, 60),
    CEILING_LAMP("Ceiling Lamp", true, 100);

    private String name;
    private boolean hasBulb;
    private int powerInWatts;

    LampType(String name,boolean hasBulb, int powerInWatts){
        this.name=name;
        this.hasBulb=hasBulb;
        this.powerInWatts=powerInWatts;
    }

    public String getName(){
        return name;
    }
    public boolean isHasBulb(){
        return hasBulb;
    }
    public int getPowerInWatts(){
        return powerInWatts;
    }
}
