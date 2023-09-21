package com.workintech.s13d4;

public class Point {
    private int x;
    private int y;


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((x * x) + (y * y));
    }
    public double distance(Point p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    public double distance(int a, int b){
        return Math.sqrt((this.x - a) * (this.x - a) + (this.y - b) * (this.y - b));
    }
}
