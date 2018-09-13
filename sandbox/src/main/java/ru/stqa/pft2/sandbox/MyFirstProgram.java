package ru.stqa.pft2.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Vladimir");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугодьника со сторонами " + a + " и " + b + " = " + area(a, b));

        double q = 5;
        double w = 5;
        double e = 5;
        System.out.println("Площадь куба со сторонами " + q + " , " + w + " и " + e + " = " + area(q, w, e));

    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");

    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b){
        return a * b;

    }

    public static double area(double q, double w, double e){
        return q * w * e;
    }

}