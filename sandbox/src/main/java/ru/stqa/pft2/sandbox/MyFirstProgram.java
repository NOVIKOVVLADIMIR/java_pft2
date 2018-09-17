package ru.stqa.pft2.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Vladimir");


        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугодьника со сторонами " + r.a + " и " + r.b + " = " + r.area());


        Cube c = new Cube(5, 5, 5);
        System.out.println("Площадь куба со сторонами " + c.q + " , " + c.w + " и " + c.e + " = " + c.area());

    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");

    }



    }

