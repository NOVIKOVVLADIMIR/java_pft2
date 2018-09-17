package ru.stqa.pft2.sandbox;

public class DistanceBetweenPoints {


    public static void main(String[] args) {


        Point point1 = new Point(5,10);
        Point point2 = new Point(7,9);

        double test = point1.distance(point2);

        System.out.println("Расстояние между точками на плоскости: " + test);

    }

}
