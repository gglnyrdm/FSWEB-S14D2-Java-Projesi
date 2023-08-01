package com.workintech.bedroom;

import com.workintech.bedroom.enums.PaintColor;

public class Carpet{
    private int width;
    private int height;
    private PaintColor paintedColor;

    public Carpet(int width, int height,PaintColor paintedColor,String name){
        this.width=width;
        this.height=height;
        this.paintedColor=paintedColor;
    }

    public int getWidth(){ return width; }
    public int getHeight(){ return height; }
    public PaintColor getPaintedColor(){ return paintedColor; }
    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
