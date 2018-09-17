package ru.stqa.pft2.sandbox;

public class Point {
    double x;
    double y;

    public Point(double x, double y){

        this.x = x;
        this.y = y;

    }

    public double distance(Point a){
        return Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2));
    }
}
