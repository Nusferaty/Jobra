package pr_3.src;
import pr_3.src.shape.*;
import pr_3.src.rectangle.*;
import pr_3.src.circle.*;
import pr_3.src.square.*;

public class testShape {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); т.к. в данном классе отсутствуцет данный метод

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); т.к. данный класс - абстрактный, нельзя создать объект

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); т.к. в данном классе отсутствуцет данный метод

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        //System.out.println(r1.getLength()); т.к. в данном классе отсутствуцет данный метод

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); т.к. в данном классе отсутствуцет данный метод

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); т.к. в данном классе отсутствуцет данный метод
        //System.out.println(r2.getLength()); т.к. в данном классе отсутствуцет данный метод

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        //System.out.println(sq1.getLength()); т.к. в данном классе отсутствуцет данный метод
    }
}
