package com.workintech.main;

import com.workintech.bedroom.*;
import com.workintech.bedroom.enums.LampType;
import com.workintech.bedroom.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom=new Bedroom("Gülin",
                new Wall("North"),
                new Wall("South"),
                new Wall("East"),
                new Wall("West"),
                new Ceiling(300, PaintColor.BLUE),
                new Bed("Klasik",2,30,3,1),
                new Lamp(LampType.DESK_LAMP,true,25),
                new Wardrobe(100,220,130.5),
                new Carpet(330,200,PaintColor.GRAY)
                );

        System.out.println(bedroom);

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getWall1().create();
        bedroom.getCeiling().create();
    }
}