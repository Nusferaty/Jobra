package pr_3.src.z2;
import pr_3.src.z2.movable.*;
import pr_3.src.z2.movableCircle.*;
import pr_3.src.z2.movablePoint.*;
import pr_3.src.z2.movableRectangle.*;

public class TestMovable {
    public static void main(String[] args){
        Movable point = new MovablePoint(2,10,2,3);
        System.out.println(point);
        point.moveDown();
        point.moveUp();
        point.moveLeft();
        point.moveRight();

        Movable circle = new MovableCircle(2,10,2,3,5);
        System.out.println(circle);
        circle.moveDown();
        circle.moveUp();
        circle.moveRight();
        circle.moveLeft();

        Movable rectangle = new MovableRectangle(1,2,4,6,3,1);
        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveUp();
        rectangle.moveRight();
        rectangle.moveLeft();

    }
}