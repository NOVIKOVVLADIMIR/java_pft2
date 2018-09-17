package ru.stqa.pft2.sandbox;

public class Cube {
    public double q;
    public double w;
    public double e;

    public Cube(double q, double w, double e){
        this.q = q;
        this.w = w;
        this.e = e;

    }

    public double area() {
        return this.q * this.w * this.e;
}
}
