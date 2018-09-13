package ru.stqa.pft2.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Vladimir");


       Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle (4, 6);
        System.out.println("Площадь прямоугодьника со сторонами " + r.a + " и " + r.b + " = " + area(r));


        Cube c = new Cube (5, 5, 5);
        System.out.println("Площадь куба со сторонами " + c.q + " , " + c.w + " и " + c.e + " = " + area(c));

    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");

    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r){
        return r.a * r.b;

    }

    public static double area(Cube c){
        return c.q * c.w * c.e;
    }

}